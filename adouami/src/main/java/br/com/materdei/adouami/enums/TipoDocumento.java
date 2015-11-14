package br.com.materdei.adouami.enums;

/**
 * Created by Paulo Henrique on 11/11/2015.
 */
public enum TipoDocumento {

    VENDA("VENDA"), ADOCAO("ADOCAO");

    private String label;

    private TipoDocumento(String tipo) {
        this.label = tipo;
    }

    public String getLabel() {
        return this.label;
    }

}
