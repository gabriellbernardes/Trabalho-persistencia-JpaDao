package dao.jpa;

import dao.SecretarioDAO;
import model.Funcionario;
import model.Secretario;

public class SecretarioJPADAO extends FuncionarioJPADAO<Secretario> implements SecretarioDAO {

    public SecretarioJPADAO() {
        super(Secretario.class);
    }

//    @Override
//    public Funcionario findByNome(String nome) {
//        return null;
//    }
}
