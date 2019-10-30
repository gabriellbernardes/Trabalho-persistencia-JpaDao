package dao;

import model.Limpeza;
import model.Pesquisador;

import java.util.List;

public interface LimpezaDAO extends FuncionarioDAO<Limpeza> {
    public List<Limpeza> findByCargo(String cargo);
    public List<Pesquisador> findByAtuacao(Integer num);
}

