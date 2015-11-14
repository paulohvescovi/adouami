package br.com.materdei.adouami.enums;

/**
 * Created by Paulo Henrique on 10/11/2015.
 */
public enum TipoAnimal {

    GATO("Gato"), CACHORRO("Cachorro");

    private String label;

    private TipoAnimal(String tipo) {
        this.label = tipo;
    }

    public String getLabel() {
        return this.label;
    }

}
