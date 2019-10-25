
import dao.DepartamentoDAO;
import dao.FuncionarioDAO;
import dao.GenericDAO;
import dao.PesquisadorDAO;
import dao.jpa.DepartamendoJPADAO;
import dao.jpa.FuncionarioJPADAO;
import dao.jpa.GenericJPADAO;
import dao.jpa.PesquisadorJPADAO;
import jpa.JPAUtil;
import model.Departamento;
import model.Endereco;
import model.Funcionario;
import model.Pesquisador;
import util.Menu;

import javax.persistence.PersistenceException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Companhia {



    public static void addFuncionario() {
//        PesquisadorDAO pDAO = new PesquisadorJPADAO();
//        DepartamentoDAO dDAO = new DepartamendoJPADAO();
//
//        Departamento dep = new Departamento();


//        System.out.println(dep);

//        dDAO.close();
//        dep.setNome("3");
//        dep.setNumero(3);

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

//        Pesquisador pesq = new Pesquisador();
//        pesq.setNome("xavier");
//        pesq.setAtuacao("pesquisas");
//
//        Calendar c = Calendar.getInstance();
//        c.set(Calendar.YEAR, 1995);
//        c.set(Calendar.MONTH, Calendar.MARCH);
//        c.set(Calendar.DAY_OF_MONTH, 20);
//        pesq.setAniversario(c);
//
//        pesq.setDepartamento(dep);
//        pesq.setSexo("masc");
//        pesq.setSalario(1500.00);
//
//        Endereco endereco = new Endereco();
//        endereco.setBairro("Parque Potira");
//        endereco.setCidade("Caucaia");
//        endereco.setComplemento("Casa A");
//        endereco.setLogradouro("Seu ze da carroça");
//        endereco.setNumero(898);
//        pesq.setEndereco(endereco);
//
//        try {;
//            pDAO.beginTransaction();
//            pDAO.save(pesq);
//            pDAO.commit();
//        } catch(IllegalStateException | PersistenceException e) {
//            pDAO.rollBack();
//            e.printStackTrace();
//        } finally {
//            pDAO.close();
//        }
    }

//    public static void buscar() {
//        DepartamentoDAO dDAO = new DepartamendoJPADAO();
//
//        List<Departamento> deps = dDAO.findAll();
//
//        dDAO.close();
//
//        for(Departamento d: deps)
//        {
//            System.out.println(d);
//        }
//    }


    public static void main(String[] args) {

            Menu menu = new Menu();
            menu.chamaMenu();
    }

}
