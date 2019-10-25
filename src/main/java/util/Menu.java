package util;

import dao.DepartamentoDAO;
import dao.PesquisadorDAO;
import dao.SecretarioDAO;
import dao.jpa.DepartamendoJPADAO;
import dao.jpa.SecretarioJPADAO;
import model.*;

import javax.persistence.PersistenceException;
import javax.swing.*;
import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Menu {
    public Menu(){}


    public void chamaMenu() throws ParseException {

    String menu = "Escolha uma opção:\n1 - Menu Inserir \n2 - Menu Remover \n3  - Consultas\n4 - Sair";
    char opcao;
		do {
        Funcionario funcionario;
        List<Funcionario> funcionarioList;
        Dependente dependente;
        List<Dependente> dependenteList;
        Endereco endereco;
        Departamento departamento;
        List<Departamento> departamentoList;
        Limpeza limpeza;
        List<Limpeza> limpezaList;
        Pesquisador pesquisador;
        List<Pesquisador>pesquisadorList;
        Pesquisas pesquisas;
        List<Pesquisas>pesquisasList;
        Projeto projeto;
        List<Projeto> projetoList;
        Secretario secretario;
        List<Secretario>secretarioList;

        char opcaob;
        String submenu;

        opcao = JOptionPane.showInputDialog(menu).charAt(0);
        switch (opcao) {

            case '1': // Menu inserir
//----------------------------------------------------------------------------------------------------------------
                submenu = "Escolha uma opção:\n1 - Inserir Pesquisador\n2 - Inserir Secretario\n3 - Inserir Limpeza\n4 - Inserir um Departamento\n5 - Sair";

                do {
                    opcaob = JOptionPane.showInputDialog(submenu).charAt(0);


                    switch (opcaob) {
                        // insere Secretario
                        case '1':
                            endereco = null;
                            secretario = null;
                            secretario = new Secretario();
                            endereco = new Endereco();
                            int id ;
                            id = Integer.parseInt(JOptionPane.showInputDialog("Digite um id de um Secretario"));

                            SecretarioDAO secDao = new SecretarioJPADAO();
                            Secretario temp= new Secretario();
                           // temp = secDao.findById(id);


                                secretario.setNome( JOptionPane.showInputDialog("Digite o Nome do Secretario"));

                                secretario.setSexo( JOptionPane.showInputDialog("Digite o sexo do Secretario"));

                                String aniversario = JOptionPane.showInputDialog("Digite o aniversario do Secretario");
                                secretario.setAniversario(new SimpleDateFormat("dd/MM/yyyy").parse(aniversario));

                                secretario.setSalario( Double.parseDouble(JOptionPane.showInputDialog("Digite o Salario do Secretario")));
                                secretario.setEscolaridade( JOptionPane.showInputDialog("Digite a Escolaridade do Secrteario"));

                                endereco.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Digite o numero da casa do Secretario")));
                                endereco.setBairro(JOptionPane.showInputDialog("Digite o bairro do Secretario"));
                                endereco.setCidade(JOptionPane.showInputDialog("Digite a cidade do Secretario"));
                                endereco.setLogradouro(JOptionPane.showInputDialog("Digite o lagradouro do Secretario"));
                                endereco.setComplemento(JOptionPane.showInputDialog("Digite o complemento do Secretario"));

                                secretario.setEndereco(endereco);


                                try {;
                                    secDao.beginTransaction();
                                    secDao.save(secretario);
                                    secDao.commit();
                                } catch(IllegalStateException | PersistenceException e) {
                                    secDao.rollBack();
                                    e.printStackTrace();
                                } finally {
                                    secDao.close();
                                }





                            break;
                        // insere Limpeza
                        case '2':


                            break;

                        case '3':// inserir Pesquisador



                            break;
                        //insere um Departamento
                        case '4':
                            departamento =null;
                            DepartamentoDAO dDAO = new DepartamendoJPADAO();
                            Departamento dep = new Departamento();

                               String nome =  JOptionPane.showInputDialog("Digite o Nome do Departamento");
                               int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero do Departamento"));
                                 dep.setNome(nome);
                                 dep.setNumero(numero);
                                try {
                                    dDAO.beginTransaction();
                                    dDAO.save(dep);
                                    dDAO.commit();
                                } catch(IllegalStateException | PersistenceException e) {
                                    dDAO.rollBack();
                                    e.printStackTrace();
                                } finally {
                                    dDAO.close();
                                }

                            break;
                        case '5':
                            break;

                        default:
                            JOptionPane.showMessageDialog(null, "Opção Inválida");
                            break;
                    }

                } while (opcaob != '4');
                break;
//--------------------------------------------------------------------------------------------------------------


            case '2':// Menu de Remocoes

                submenu = "Escolha uma opção:\n1 - Remover Secretario\n2 - Remover Pesquisador\n3 - Remover Limpeza\n4 - Sair";
                JOptionPane.showMessageDialog(null, "Essa acao pode remover tudo vinculado !!");
                do {

                    opcaob = JOptionPane.showInputDialog(submenu).charAt(0);
                    switch (opcaob) {
                        // remove Secretario
                        case '1':


                            break;
                        // remove Pesquisador
                        case '2':

                            break;

                        case '3':// remove Limpeza

                            break;

                        case '4':
                            break;

                        default:
                            JOptionPane.showMessageDialog(null, "Opção Inválida");
                            break;
                    }

                } while (opcaob != '4');

                break;
//--------------------------------------------------------------------------------------------------------------


            case '3':


                submenu = "Escolha uma opção:\n1 - Vizualizar consultas Secretario\n2 - Vizualizar consultas Pesquisador \n3 - Vizualizar consultas Limpeza \n4 - Sair";

                do {
                    opcaob = JOptionPane.showInputDialog(submenu).charAt(0);
                    switch (opcaob) {

                        case '1':

                            break;



                        case '2':

                            break;

                        case '3':

                            break;

                        case '4':

                            break;

                        default:
                            JOptionPane.showMessageDialog(null, "Opção Inválida");
                            break;
                    }

                } while (opcaob != '4');
                break;

            case '4': // Sair
                break;

            default:

                JOptionPane.showMessageDialog(null, "Opção Inválida");
                break;
        }

    } while (opcao != '4');


}

}

