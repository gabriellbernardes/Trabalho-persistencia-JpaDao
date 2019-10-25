package util;

import dao.PesquisadorDAO;
import model.*;

import javax.swing.*;
import java.util.List;

public class Menu {
    public Menu(){}


    public void chamaMenu(){

    String menu = "Escolha uma opção:\n1 - Menu Inserir \n2 - Menu Remover \n4  - Consultas\n5 - Sair";
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
                submenu = "Escolha uma opção:\n1 - Inserir Pesquisador\n2 - Inserir Secretario\n3 - Inserir Limpeza\n4 - Sair";

                do {
                    opcaob = JOptionPane.showInputDialog(submenu).charAt(0);
                    switch (opcaob) {
                        // insere Secretario
                        case '1':



                            break;
                        // insere Limpeza
                        case '2':


                            break;

                        case '3':// inserir Pesquisador



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


            case '4':


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

            case '5': // Sair
                break;

            default:

                JOptionPane.showMessageDialog(null, "Opção Inválida");
                break;
        }

    } while (opcao != '5');


}

}

