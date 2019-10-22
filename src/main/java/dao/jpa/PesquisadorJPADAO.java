package dao.jpa;

import dao.PesquisadorDAO;
import model.Pesquisador;

public class PesquisadorJPADAO extends FuncionarioJPADAO<Pesquisador> implements PesquisadorDAO {

    public PesquisadorJPADAO() {
        super(Pesquisador.class);
    }

}