package com.company.App;

import com.company.App.sessioni.Livello;

import java.util.HashMap;
import java.util.Map;

class Consulente {
    private final String nome;
    private Map<Settore, Livello> competenze;

    public Consulente(String nome) {
        this.nome = nome;
        this.competenze = new HashMap<>();
    }

    public void registraCompetenza(Settore settore, Livello livello) {
        competenze.put(settore, livello);
    }

    public String getNome() {
        return nome;
    }

    public Map<Settore, Livello> getCompetenze() {
        return competenze;
    }
}
