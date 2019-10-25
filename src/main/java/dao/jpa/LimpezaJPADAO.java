package dao.jpa;

import dao.LimpezaDAO;
import jpa.JPAUtil;
import model.Limpeza;
import model.Pesquisador;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

public class LimpezaJPADAO extends FuncionarioJPADAO<Limpeza> implements LimpezaDAO {

    public LimpezaJPADAO() {
        super(Limpeza.class);
    }

    @Override
    public List<Limpeza> findFuncionarioCargo(String cargo) {
        EntityManager em = JPAUtil.getEntityManager();
        Query query= em.createQuery("SELECT .nome ,  l.sexo, l.aniversario, l.salario , l.cargo "+
                " FROM limpeza l"+
                "  WHERE l.cargo == :cargo");

        query.setParameter("cargo", cargo);

        return  query.getResultList();
    }


    @Override
    public List<Limpeza> findJornadaTrabalho(String nome) {
        EntityManager em = JPAUtil.getEntityManager();
        Query query= em.createQuery("SELECT l.nome, l.jornada"+
                " FROM limpeza l"+
                "  WHERE l.nome == :nome");

        query.setParameter("nome", nome);

        return  query.getResultList();
    }

    @Override
    public Limpeza findSupervisor(Integer id) {

        Limpeza temp = null;
        EntityManager em = JPAUtil.getEntityManager();
        try {
            temp = (Limpeza) em.createQuery("SELECT l.nome, l.sexo, l.aniversario, l.salario, l.cargo, l.jornada"+
                    " FROM  Limpeza l"+
                    "  WHERE supervisor = :id ").setParameter("id", id).getSingleResult();
        } catch(Exception e) {
            e.printStackTrace();
        }
        return temp;
    }
}
