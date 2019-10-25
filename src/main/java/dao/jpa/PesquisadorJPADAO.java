package dao.jpa;

import dao.PesquisadorDAO;
import jpa.JPAUtil;
import model.Pesquisador;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

public class PesquisadorJPADAO extends FuncionarioJPADAO<Pesquisador> implements PesquisadorDAO {

    public PesquisadorJPADAO() {
        super(Pesquisador.class);
    }


        @Override
        public Pesquisador findAtuacao(String nome) {
            Pesquisador temp = null;
            EntityManager em = JPAUtil.getEntityManager();
            try {
            temp = (Pesquisador) em.createQuery("SELECT p.nome, p.sexo, p.aniversario, p.salario, p.atuacao"+
                    " FROM  Pesquisador p"+
                    "  WHERE p.nome = :nome ").setParameter("nome", nome+"%").getSingleResult();
            } catch(Exception e) {
                e.printStackTrace();
            }
                    return temp;
        }
}


