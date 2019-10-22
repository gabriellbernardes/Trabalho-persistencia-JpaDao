package dao.jpa;

import dao.DepartamentoDAO;
import model.Departamento;

public class DepartamendoJPADAO extends GenericJPADAO<Departamento> implements DepartamentoDAO {

    public DepartamendoJPADAO() {
        super(Departamento.class);
    }
}
