package dao.jpa;

import dao.DependenteDAO;
import model.Dependente;

public class DependenteJPADAO extends GenericJPADAO<Dependente> implements DependenteDAO {

    public DependenteJPADAO() {
        super(Dependente.class);
    }
}
