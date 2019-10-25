package dao;

import model.Funcionario;
import model.Limpeza;
import model.Secretario;

import java.util.List;

public interface SecretarioDAO extends FuncionarioDAO<Secretario> {

    public List<Secretario> escolaridadeSecretario(String escolaridade );
    public Secretario findById(Integer id );


}
