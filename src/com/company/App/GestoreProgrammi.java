package com.company.App;

import com.company.App.sessioni.Livello;
import com.company.App.sessioni.Sessioni;
import com.company.App.sessioni.TipoSessione;

import java.util.Date;

class GestoreProgrammi {

    public Programma creaProgramma(int numeroSessioni, Sessioni sessioni, Livello livello, TipoSessione tipoSessione, Date inizio, Date fine, Settore settore) {
        Programma programma = new Programma(numeroSessioni, sessioni, livello, tipoSessione, inizio, fine, settore);
        return programma;
    }
}
