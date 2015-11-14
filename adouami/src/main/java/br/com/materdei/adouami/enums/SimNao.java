package br.com.materdei.adouami.enums;

/**
 * Created by Paulo Henrique on 11/11/2015.
 */
public enum SimNao {

    S("S"), N("N");

    private String label;

    private SimNao(String tipo) {
        this.label = tipo;
    }

    public String getLabel() {
        return this.label;
    }

}
