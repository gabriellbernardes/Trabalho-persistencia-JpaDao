package dao.jpa;

import dao.EnderecoDAO;
import jpa.JPAUtil;
import model.Endereco;
import model.Limpeza;

import javax.persistence.EntityManager;

public class EnderecoJPADAO extends GenericJPADAO<Endereco> implements EnderecoDAO {

    public EnderecoJPADAO() {
        super(Endereco.class);
    }

    @Override
    public Endereco findById(Integer id) {

        Endereco temp = null;
        EntityManager em = JPAUtil.getEntityManager();
        try {
            temp = (Endereco) em.createQuery("SELECT e.bairro, e.cidade, e.complemento, e.lagradouro, e.numero"+
                    " FROM  Endereco e"+
                    "  WHERE id = :id ").setParameter("id", id).getSingleResult();
        } catch(Exception e) {
            e.printStackTrace();
        }
        return temp;
    }

}
