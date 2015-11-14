package br.com.materdei.adouami.models;

import javax.persistence.*;

/**
 * Created by Paulo Henrique on 10/11/2015.
 */
@Entity
@Table(name = "estado")
public class Estado {

    @Id
    @GeneratedValue
    private Integer id;
    @Column(nullable = false)
    private String descricao;
    @Column(nullable = false)
    private String sigla;

    public Estado() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }
}
