package dao.jpa;

import dao.ProjetoDAO;
import model.Projeto;

public class ProjetoJPADAO extends GenericJPADAO<Projeto> implements ProjetoDAO {

    public ProjetoJPADAO() {
        super(Projeto.class);
    }

}
