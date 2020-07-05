package com.company.App;

import com.company.App.sessioni.Livello;
import com.company.App.sessioni.Sessioni;
import com.company.App.sessioni.TipoSessione;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

class Programma implements Programmi{
    private Integer numeroSessioni;
    private Sessioni sessioni;
    private Livello livello;
    private TipoSessione tipoSessione;
    private Date inizio;
    private Date fine;
    private Settore settore;


    Programma(Integer numeroSessioni, Sessioni sessioni, Livello livello, TipoSessione tipoSessione, Date inizio, Date fine, Settore settore) {
        this.numeroSessioni = numeroSessioni;
        this.sessioni = sessioni;
        this.livello = livello;
        this.tipoSessione = tipoSessione;
        this.inizio = inizio;
        this.fine = fine;
        this.settore = settore;
    }

    Settore getSettore() {
        return settore;
    }

    public Livello getLivello() {
        return livello;
    }
}
