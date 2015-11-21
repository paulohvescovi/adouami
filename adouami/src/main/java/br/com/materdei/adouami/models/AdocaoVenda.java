package br.com.materdei.adouami.models;

import br.com.materdei.adouami.enums.TipoDocumento;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Paulo Henrique on 11/11/2015.
 */
@Entity
@Table(name = "adocaovenda")
public class AdocaoVenda {

    @Id
    @GeneratedValue
    private Integer id;

    @ManyToOne
    @JoinColumn(name="pessoa_id", referencedColumnName="id", nullable = false)
    private Pessoa pessoa;

    @ManyToOne
    @JoinColumn(name="animal_id", referencedColumnName="id", nullable = false)
    private Animal animal;

    @Temporal(TemporalType.DATE)
    @Column(nullable = false)
    private Date dtEmissao;

    @Enumerated(EnumType.STRING)
    private TipoDocumento tipoDocumento;

    @Column
    private Double preco;

    @Column
    private String observacao;

    @ManyToOne  
    @JoinColumn(name="usuario_id", referencedColumnName="id", nullable = false)
    private Usuario usuario;

    public AdocaoVenda() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Date getDtEmissao() {
        return dtEmissao;
    }

    public void setDtEmissao(Date dtEmissao) {
        this.dtEmissao = dtEmissao;
    }

    public TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(TipoDocumento tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AdocaoVenda that = (AdocaoVenda) o;

        return !(id != null ? !id.equals(that.id) : that.id != null);

    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
