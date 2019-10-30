package util;

import dao.DepartamentoDAO;
import dao.LimpezaDAO;
import dao.PesquisadorDAO;
import dao.SecretarioDAO;
import dao.jpa.DepartamendoJPADAO;
import dao.jpa.LimpezaJPADAO;
import dao.jpa.PesquisadorJPADAO;
import dao.jpa.SecretarioJPADAO;
import model.*;

import javax.persistence.PersistenceException;
import javax.swing.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

public class Menu {
    public Menu() {
    }


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
            List<Pesquisador> pesquisadorList;
            Pesquisas pesquisas;
            List<Pesquisas> pesquisasList;
            Projeto projeto;
            List<Projeto> projetoList;
            Secretario secretario;
            List<Secretario> secretarioList;

            char opcaob;
            String submenu;
            DepartamentoDAO dDAO = new DepartamendoJPADAO();
            SecretarioDAO secDao = new SecretarioJPADAO();
            PesquisadorDAO pDAO = new PesquisadorJPADAO();
            LimpezaDAO lDAO = new LimpezaJPADAO();

            Calendar c = Calendar.getInstance();



            opcao = JOptionPane.showInputDialog(menu).charAt(0);
            switch (opcao) {

                case '1': // Menu inserir
//----------------------------------------------------------------------------------------------------------------
                    submenu = "Escolha uma opção:\n1 - Inserir Secretario\n2 - Inserir Limpeza\n3 - Inserir Pesquisador\n4 - Inserir um Departamento\n5 - Sair";

                    do {
                        opcaob = JOptionPane.showInputDialog(submenu).charAt(0);


                        switch (opcaob) {
                            // insere Secretario
                            case '1':

                                secretario = new Secretario();
                                endereco = new Endereco();



                                secretario.setNome(JOptionPane.showInputDialog("Digite o Nome do Secretario"));

                                secretario.setSexo(JOptionPane.showInputDialog("Digite o sexo do Secretario"));


                                c.set(Calendar.YEAR, Integer.parseInt(JOptionPane.showInputDialog("Digite o dia do aniversario do Secretario")));
                                c.set(Calendar.MONTH, Integer.parseInt(JOptionPane.showInputDialog("Digite o mes do aniversario do Secretario")));
                                c.set(Calendar.DAY_OF_MONTH, Integer.parseInt(JOptionPane.showInputDialog("Digite o ano do aniversario do Secretario")));
                                secretario.setAniversario(c);


                                secretario.setSalario(Double.parseDouble(JOptionPane.showInputDialog("Digite o Salario do Secretario")));
                                secretario.setEscolaridade(JOptionPane.showInputDialog("Digite a Escolaridade do Secretario"));

                                endereco.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Digite o numero da casa do Secretario")));
                                endereco.setBairro(JOptionPane.showInputDialog("Digite o bairro do Secretario"));
                                endereco.setCidade(JOptionPane.showInputDialog("Digite a cidade do Secretario"));
                                endereco.setLogradouro(JOptionPane.showInputDialog("Digite o lagradouro do Secretario"));
                                endereco.setComplemento(JOptionPane.showInputDialog("Digite o complemento do Secretario"));

                                secretario.setEndereco(endereco);


                                try {
                                    ;
                                    secDao.beginTransaction();
                                    secDao.save(secretario);
                                    secDao.commit();
                                } catch (IllegalStateException | PersistenceException e) {
                                    secDao.rollBack();
                                    e.printStackTrace();
                                } finally {
                                    secDao.close();
                                }


                                break;
                            // insere Limpeza
                            case '2':

                                limpeza = new Limpeza();
                                endereco = new Endereco();


                                limpeza.setNome(JOptionPane.showInputDialog("Digite o Nome "));

                                limpeza.setSexo(JOptionPane.showInputDialog("Digite o sexo "));


                                c.set(Calendar.YEAR, Integer.parseInt(JOptionPane.showInputDialog("Digite o dia do aniversario ")));
                                c.set(Calendar.MONTH, Integer.parseInt(JOptionPane.showInputDialog("Digite o mes do aniversario ")));
                                c.set(Calendar.DAY_OF_MONTH, Integer.parseInt(JOptionPane.showInputDialog("Digite o ano do aniversario ")));
                                limpeza.setAniversario(c);


                                limpeza.setSalario(Double.parseDouble(JOptionPane.showInputDialog("Digite o Salario ")));
//                                limpeza.setEscolaridade(JOptionPane.showInputDialog("Digite a Escolaridade do Secretario"));

                                endereco.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Digite o numero da casa do Secretario")));
                                endereco.setBairro(JOptionPane.showInputDialog("Digite o bairro do Secretario"));
                                endereco.setCidade(JOptionPane.showInputDialog("Digite a cidade do Secretario"));
                                endereco.setLogradouro(JOptionPane.showInputDialog("Digite o lagradouro do Secretario"));
                                endereco.setComplemento(JOptionPane.showInputDialog("Digite o complemento do Secretario"));

                                limpeza.setEndereco(endereco);

                                try {
                                    ;
                                    lDAO.beginTransaction();
                                    lDAO.save(limpeza);
                                    lDAO.commit();
                                } catch (IllegalStateException | PersistenceException e) {
                                    lDAO.rollBack();
                                    e.printStackTrace();
                                } finally {
                                    lDAO.close();
                                }

                                break;

                            case '3':// inserir Pesquisador
                                pesquisador = new Pesquisador();
                                int idDep = Integer.parseInt(JOptionPane.showInputDialog("Digite o id do Departamento em qual está o pesquisador", 1));
                                Departamento dep = dDAO.find(idDep);
                                pesquisador.setDepartamento(dep);



                                pesquisador.setNome(JOptionPane.showInputDialog("Digite o nome do pesquisador"));
                                pesquisador.setAtuacao(JOptionPane.showInputDialog("Digite a atuacao do pesquisador"));

                                c.set(Calendar.YEAR, Integer.parseInt(JOptionPane.showInputDialog("Digite o dia do aniversario do Pessquisador")));
                                c.set(Calendar.MONTH, Integer.parseInt(JOptionPane.showInputDialog("Digite o mes do aniversario do Pesquisador")));
                                c.set(Calendar.DAY_OF_MONTH, Integer.parseInt(JOptionPane.showInputDialog("Digite o ano do aniversario do Pesquisador")));
                                pesquisador.setAniversario(c);


                                pesquisador.setSexo(JOptionPane.showInputDialog("Digite o sexo do Pessquisador"));
                                pesquisador.setSalario(Double.parseDouble(JOptionPane.showInputDialog("Digite o id do Departamento em qual está o pesquisador", 0.0)));

                                 endereco = new Endereco();
                                endereco.setBairro(JOptionPane.showInputDialog("Digite o bairro"));
                                endereco.setCidade(JOptionPane.showInputDialog("Digite a cidade"));
                                endereco.setComplemento(JOptionPane.showInputDialog("Digite o complemento"));
                                endereco.setLogradouro(JOptionPane.showInputDialog("Digite o lagradouro"));
                                endereco.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Digite o numero da casa", 1)));
                                pesquisador.setEndereco(endereco);

                                try {;
                                    pDAO.beginTransaction();
                                    pDAO.save(pesquisador);
                                    pDAO.commit();
                                } catch(IllegalStateException | PersistenceException e) {
                                    pDAO.rollBack();
                                    e.printStackTrace();
                                } finally {
                                    pDAO.close();
                                }

                                break;
                            //insere um Departamento
                            case '4':

                                departamento = new Departamento();
                                String nome = JOptionPane.showInputDialog("Digite o Nome do Departamento");
                                int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero do Departamento"));

                                departamento.setNome(nome);
                                departamento.setNumero(numero);

                                try {
                                    dDAO.beginTransaction();
                                    dDAO.save(departamento);
                                    dDAO.commit();
                                } catch (IllegalStateException | PersistenceException e) {
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

