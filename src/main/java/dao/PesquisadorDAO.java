package dao;

import model.Funcionario;
import model.Pesquisador;

import java.util.List;

public interface PesquisadorDAO extends FuncionarioDAO<Pesquisador> {
    public Pesquisador findAtuacao(String nome);


}
