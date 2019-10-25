package dao;

import model.Funcionario;
import model.Limpeza;

import java.util.List;

public interface LimpezaDAO extends FuncionarioDAO<Limpeza> {
    public List<Limpeza> findFuncionarioCargo(String cargo);
    public List<Limpeza> findJornadaTrabalho(String nome);
    public Limpeza findSupervisor(Integer id  );

}

