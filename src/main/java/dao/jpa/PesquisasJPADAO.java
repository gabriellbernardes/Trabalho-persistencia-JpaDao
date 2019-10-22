package dao.jpa;

import dao.PesquisasDAO;
import model.Pesquisas;

public class PesquisasJPADAO extends GenericJPADAO<Pesquisas> implements PesquisasDAO {

    public PesquisasJPADAO() {
        super(Pesquisas.class);
    }

}
