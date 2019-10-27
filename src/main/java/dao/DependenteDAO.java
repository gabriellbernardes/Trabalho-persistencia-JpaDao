package dao;

import model.Dependente;
import model.Funcionario;

import java.util.List;

public interface DependenteDAO extends GenericDAO<Dependente> {
    List<Dependente> findByNome(String nome);
}
