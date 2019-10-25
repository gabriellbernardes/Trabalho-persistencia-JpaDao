package dao;

import model.Funcionario;
import model.Limpeza;

import java.util.List;

public interface FuncionarioDAO<T> extends GenericDAO<T> {

    public List<Funcionario> findByNome(String nome);
    public List<Funcionario> findByParteNome(String nome);
    public List<Funcionario> funcionarioDados(int salario );

}
