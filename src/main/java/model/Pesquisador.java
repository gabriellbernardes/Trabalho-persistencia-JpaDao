package model;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Entity
public class Pesquisador extends Funcionario {

    private String atuacao;

    @OneToMany(mappedBy = "pesquisador")
    private List<Pesquisas> pesquisas;

    public Pesquisador() {
    }

    public Pesquisador(String nome, String sexo, Date aniversario, Double salario,
                       Departamento departamento, List<Dependente> dependentes, Endereco endereco, String atuacao) {
        super(nome, sexo, aniversario, salario, departamento, dependentes, endereco);
        this.atuacao = atuacao;
    }

    public String getAtuacao() {
        return atuacao;
    }

    public void setAtuacao(String atuacao) {
        this.atuacao = atuacao;
    }

    @Override
    public String toString() {
        return "Pesquisador{" +
                super.toString() +
                "atuacao='" + atuacao + '\'' +
                '}';
    }
}
