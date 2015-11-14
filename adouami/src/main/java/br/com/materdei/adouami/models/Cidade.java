package br.com.materdei.adouami.models;

import javax.persistence.*;

/**
 * Created by Paulo Henrique on 10/11/2015.
 */
@Entity
@Table(name = "cidade")
public class Cidade {

    @Id
    @GeneratedValue
    private Integer id;
    @Column(nullable = false)
    private String descricao;
    @ManyToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
    @JoinColumn(name="estado_id", referencedColumnName="id", nullable = false)
    private Estado estado;

    public Cidade() {
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

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
}
