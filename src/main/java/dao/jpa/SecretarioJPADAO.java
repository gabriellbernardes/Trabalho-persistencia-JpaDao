package dao.jpa;

import dao.SecretarioDAO;
import model.Secretario;

public class SecretarioJPADAO extends FuncionarioJPADAO<Secretario> implements SecretarioDAO {

    public SecretarioJPADAO() {
        super(Secretario.class);
    }

}
