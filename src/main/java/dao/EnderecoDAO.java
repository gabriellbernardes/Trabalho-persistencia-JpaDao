package dao;

import model.Endereco;
import model.Limpeza;

public interface EnderecoDAO extends GenericDAO<Endereco> {
    public Endereco findById(Integer id);
}
