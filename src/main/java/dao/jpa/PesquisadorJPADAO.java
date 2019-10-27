package dao.jpa;

import dao.PesquisadorDAO;
import model.Funcionario;
import model.Pesquisador;

public class PesquisadorJPADAO extends FuncionarioJPADAO<Pesquisador> implements PesquisadorDAO {

    public PesquisadorJPADAO() {
        super(Pesquisador.class);
    }

//    @Override
//    public Funcionario findByNome(String nome) {
//        return null;
//    }
}


