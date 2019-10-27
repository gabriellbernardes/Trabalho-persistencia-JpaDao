import dao.DepartamentoDAO;
import dao.PesquisadorDAO;
import dao.jpa.DepartamendoJPADAO;
import dao.jpa.PesquisadorJPADAO;
import model.Departamento;
import model.Endereco;
import model.Funcionario;
import model.Pesquisador;
//import util.Menu;

import javax.persistence.PersistenceException;
import java.text.ParseException;
import java.util.Calendar;
import java.util.List;

public class Companhia {


    public static void addFuncionario() {

        DepartamentoDAO dDAO = new DepartamendoJPADAO();
//
//        Departamento dep = new Departamento();
//        dep.setNome("departamento1");
//        dep.setNumero(10);
//
//        try {;
//            dDAO.beginTransaction();
//            dDAO.save(dep);
//            dDAO.commit();
//        } catch(IllegalStateException | PersistenceException e) {
//            dDAO.rollBack();
//            e.printStackTrace();
//        } finally {
//            dDAO.close();
//        }

        Departamento dep = dDAO.find(1);

        PesquisadorDAO pDAO = new PesquisadorJPADAO();

        Pesquisador pesq = new Pesquisador();
        pesq.setNome("xavier");
        pesq.setAtuacao("pesquisas");

        Calendar c = Calendar.getInstance();
        c.set(Calendar.YEAR, 1995);
        c.set(Calendar.MONTH, Calendar.MARCH);
        c.set(Calendar.DAY_OF_MONTH, 20);
        pesq.setAniversario(c);

        pesq.setDepartamento(dep);

        pesq.setSexo("masc");
        pesq.setSalario(1500.00);

        Endereco endereco = new Endereco();
        endereco.setBairro("Parque Potira");
        endereco.setCidade("Caucaia");
        endereco.setComplemento("Casa A");
        endereco.setLogradouro("Seu ze da carroça");
        endereco.setNumero(898);
        pesq.setEndereco(endereco);

        try {;
            pDAO.beginTransaction();
            pDAO.save(pesq);
            pDAO.commit();
        } catch(IllegalStateException | PersistenceException e) {
            pDAO.rollBack();
            e.printStackTrace();
        } finally {
            pDAO.close();
        }
    }

    public static void buscar(String nome) {
        PesquisadorDAO pDAO = new PesquisadorJPADAO();

        List<Funcionario> pesqs = pDAO.findByNome(nome);

        for(Funcionario f: pesqs) {
            System.out.println(f);
        }

    }

    public static void main(String[] args) throws ParseException {
//        JPAUtil.getEntityManager();
//        JPAUtil.closeEntityManager();

//        addFuncionario();

        buscar("xavier");

//        Menu menu = new Menu();
//        menu.chamaMenu();

    }

}
