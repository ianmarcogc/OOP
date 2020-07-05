package com.company.App;

public class Settore {
    private final Double costoBase;
    private final String nome;

    public Settore(Double costoBase, String nome) {
        this.costoBase = costoBase;
        this.nome = nome;
    }

    public Double getCostoBase() {
        return costoBase;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Settore settore = (Settore) o;

        return nome.equals(settore.nome);
    }

    @Override
    public int hashCode() {
        return nome.hashCode();
    }
}

