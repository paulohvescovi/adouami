package br.com.materdei.adouami.models;

import br.com.materdei.adouami.enums.SimNao;
import br.com.materdei.adouami.enums.TipoUsuario;

import javax.persistence.*;

/**
 * Created by Paulo Henrique on 11/11/2015.
 */
@Entity
@Table(name = "usuario")
public class Usuario {

    @Id
    @GeneratedValue
    private Integer id;
    @Column(nullable = false)
    private String login;
    @Column(nullable = false)
    private String senha;
    @Enumerated(EnumType.STRING)
    private TipoUsuario tipoUsuario;
    @Enumerated(EnumType.STRING)
    private SimNao inavito;
    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name="pessoa_id", referencedColumnName="id", nullable = false)
    private Pessoa pessoa;

    public Usuario() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public TipoUsuario getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(TipoUsuario tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public SimNao getInavito() {
        return inavito;
    }

    public void setInavito(SimNao inavito) {
        this.inavito = inavito;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Usuario usuario = (Usuario) o;

        return !(id != null ? !id.equals(usuario.id) : usuario.id != null);

    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
