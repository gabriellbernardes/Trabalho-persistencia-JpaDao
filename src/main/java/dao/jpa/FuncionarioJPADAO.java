package dao.jpa;

import dao.FuncionarioDAO;
import dao.GenericDAO;
import jpa.JPAUtil;
import model.Funcionario;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceException;
import javax.persistence.Query;
import java.util.List;

import static jpa.JPAUtil.rollback;

public abstract class FuncionarioJPADAO<T> extends GenericJPADAO<T> implements FuncionarioDAO<T> {


    public FuncionarioJPADAO(Class<T> persistenceClass) {
        super(persistenceClass);
    }



    @SuppressWarnings("unchecked")
    @Override
    public List<Funcionario> findByNome(String nome) {
        EntityManager em = JPAUtil.getEntityManager();
        Query query= em.createNamedQuery("Funcionario.findByNome");
        query.setParameter("nome", nome);
        return query.getResultList();
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Funcionario> findByParteNome(String nome) {
        EntityManager em = JPAUtil.getEntityManager();
        Query query= em.createQuery("Select f from Funcionario f"+
                " WHERE c.nome LIKE :nome");
        query.setParameter("nome", nome);

        return  query.getResultList();
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Funcionario> funcionarioDados(int salario ) {
        String result;
        EntityManager em = JPAUtil.getEntityManager();
        Query query= em.createQuery("SELECT CONCAT(f.nome , ' ' , f.aniversario, ' ', f.salario ) AS funcionario_salario"+
                " FROM funcionario f"+
                "  WHERE f.salario == :salario");

        query.setParameter("salario", salario);

        return  query.getResultList();
    }

}
