package br.com.materdei.adouami.models;

import br.com.materdei.adouami.enums.TipoAnimal;

import javax.persistence.*;

/**
 * Created by Paulo Henrique on 10/11/2015.
 */
@Entity
@Table(name = "animal")
public class Animal {

    @Id
    @GeneratedValue
    private Integer id;
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private TipoAnimal tipo;
    @ManyToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
    @JoinColumn(name="raca_id", referencedColumnName="id")
    private Raca raca;
    @Column(nullable = false)
    private String apelido;
    @Column
    private Integer idade;
    @Column
    private String observacao;

    public Animal() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public TipoAnimal getTipo() {
        return tipo;
    }

    public void setTipo(TipoAnimal tipo) {
        this.tipo = tipo;
    }

    public Raca getRaca() {
        return raca;
    }

    public void setRaca(Raca raca) {
        this.raca = raca;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
}
