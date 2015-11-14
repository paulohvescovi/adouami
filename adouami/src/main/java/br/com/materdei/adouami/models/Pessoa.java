package br.com.materdei.adouami.models;

import br.com.materdei.adouami.enums.TipoAnimal;
import br.com.materdei.adouami.enums.TipoResidencia;

import javax.persistence.*;

/**
 * Created by Paulo Henrique on 11/11/2015.
 */
@Entity
@Table(name = "pessoa")
public class Pessoa {

    @Id
    @GeneratedValue
    private Integer id;
    @Column(nullable = false)
    private String nome;
    @Column(nullable = false)
    private String apelido;
    @Column(nullable = false)
    private String rua;
    @Column(nullable = false)
    private String cnpjf;
    @Column(nullable = false)
    private String celular;
    @Column
    private String numero;
    @ManyToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
    @JoinColumn(name="cidade_id", referencedColumnName="id")
    private Cidade cidade;
    @Column
    private String profissao;
    @Enumerated(EnumType.STRING)
    private TipoResidencia tipoResidencia;

    public Pessoa() {
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

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCnpjf() {
        return cnpjf;
    }

    public void setCnpjf(String cnpjf) {
        this.cnpjf = cnpjf;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public TipoResidencia getTipoResidencia() {
        return tipoResidencia;
    }

    public void setTipoResidencia(TipoResidencia tipoResidencia) {
        this.tipoResidencia = tipoResidencia;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pessoa pessoa = (Pessoa) o;

        return !(id != null ? !id.equals(pessoa.id) : pessoa.id != null);

    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
