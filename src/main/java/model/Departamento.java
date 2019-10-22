package model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Departamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "dep_id")
    private Integer id;

    private String nome;
    private Integer numero;

    @OneToMany(
            cascade = CascadeType.ALL,
            mappedBy = "departamento"
    )
    private List<Projeto> projetos;

    @OneToMany(
            cascade = CascadeType.ALL,
            mappedBy = "departamento"
    )
    private List<Funcionario> funcionarios;

    public Departamento() {
    }

    public Departamento(String nome, Integer numero, List<Projeto> projetos, List<Funcionario> funcionarios) {
        this.nome = nome;
        this.numero = numero;
        this.projetos = projetos;
        this.funcionarios = funcionarios;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public List<Projeto> getProjetos() {
        return projetos;
    }

    public void setProjetos(List<Projeto> projetos) {
        this.projetos = projetos;
    }

    public List<Funcionario> getFuncionarios() { return funcionarios; }

    public void setFuncionarios(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    @Override
    public String toString() {
        return "Departamento{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", numero=" + numero +
                ", projetos=" + projetos +
                ", funcionarios=" + funcionarios +
                '}';
    }
}
