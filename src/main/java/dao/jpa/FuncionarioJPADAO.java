package dao.jpa;

import dao.FuncionarioDAO;
import jpa.JPAUtil;
import model.Dependente;
import model.Funcionario;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;


public abstract class FuncionarioJPADAO<T> extends GenericJPADAO<T> implements FuncionarioDAO<T> {


    FuncionarioJPADAO(Class<T> persistenceClass) {
        super(persistenceClass);
    }

    @Override
    public List<Funcionario> findByNome(String nome) {
        EntityManager em = JPAUtil.getEntityManager();
        Query query = em.createNamedQuery("Funcionario.findByNome");
        query.setParameter(1, nome);
        return query.getResultList();
    }

    @Override
    public List<Dependente> findDependentes(Funcionario func) {
        EntityManager em = JPAUtil.getEntityManager();
        Query query = em.createQuery("SELECT d FROM Dependente d"
                + " WHERE d.funcionario = ?1");
        query.setParameter(1, func);
        return query.getResultList();
    }
}
