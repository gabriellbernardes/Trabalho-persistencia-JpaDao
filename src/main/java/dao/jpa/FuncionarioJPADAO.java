package dao.jpa;

import dao.FuncionarioDAO;

public abstract class FuncionarioJPADAO<T> extends GenericJPADAO<T> implements FuncionarioDAO<T> {


    public FuncionarioJPADAO(Class<T> persistenceClass) {
        super(persistenceClass);
    }

}
