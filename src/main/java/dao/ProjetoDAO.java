package dao;

import model.Pesquisador;
import model.Projeto;

import java.util.List;

public interface ProjetoDAO extends GenericDAO<Projeto> {
    public List<Projeto> findPesquisadorPorProjeto(Pesquisador pesq);
}
