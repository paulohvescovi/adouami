package br.com.materdei.adouami.enums;

/**
 * Created by Paulo Henrique on 11/11/2015.
 */
public enum TipoResidencia {

    COMERCIAL("COMERCIAL"), MORADIA("MORADIA");

    private String label;

    private TipoResidencia(String tipo) {
        this.label = tipo;
    }

    public String getLabel() {
        return this.label;
    }

}
