package dao;

import model.Dependente;
import model.Funcionario;

import java.util.List;

public interface FuncionarioDAO<T> extends GenericDAO<T> {

    List<Funcionario> findByNome(String nome);

    List<Dependente> findDependentes(Funcionario func);

}
