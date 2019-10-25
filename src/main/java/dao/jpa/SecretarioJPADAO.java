package dao.jpa;

import dao.SecretarioDAO;
import jpa.JPAUtil;
import model.Limpeza;
import model.Pesquisador;
import model.Secretario;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

public class SecretarioJPADAO extends FuncionarioJPADAO<Secretario> implements SecretarioDAO {

    public SecretarioJPADAO() {
        super(Secretario.class);
    }

    @Override
    public List<Secretario> escolaridadeSecretario(String escolaridade) {
        EntityManager em = JPAUtil.getEntityManager();
        Query query= em.createQuery("SELECT s.nome, s.salario"+
                " FROM Secretario s"+
                "  WHERE f.salario == :salario");

        query.setParameter("escolaridade", escolaridade);

        return  query.getResultList();
    }

    @Override
    public Secretario findById(Integer id) {

        Secretario temp = null;
        EntityManager em = JPAUtil.getEntityManager();
        try {
            temp = (Secretario) em.createQuery("SELECT l.func_id, l.nome, l.sexo, l.aniversario, l.salario, l.cargo, l.jornada"+
                    " FROM  Secretario l"+
                    "  WHERE supervisor = :id ").setParameter("id", id).getSingleResult();
        } catch(Exception e) {
            e.printStackTrace();
        }
        return temp;
    }
}
