package dao.jpa;

import dao.LimpezaDAO;
import model.Funcionario;
import model.Limpeza;

public class LimpezaJPADAO extends FuncionarioJPADAO<Limpeza> implements LimpezaDAO {

    public LimpezaJPADAO() {
        super(Limpeza.class);
    }

//    @Override
//    public Funcionario findByNome(String nome) {
//        return null;
//    }
}
