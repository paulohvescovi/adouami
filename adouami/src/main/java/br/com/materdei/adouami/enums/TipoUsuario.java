package br.com.materdei.adouami.enums;

/**
 * Created by Paulo Henrique on 11/11/2015.
 */
public enum TipoUsuario {

    NORMAL("NORMAL"), ADM("ADM");

    private String label;

    private TipoUsuario(String tipo) {
        this.label = tipo;
    }

    public String getLabel() {
        return this.label;
    }

}
