package com.company.App;


import com.company.App.eccezioni.TipoGestoreNonSupportato;
import com.company.App.sessioni.Livello;
import com.company.App.sessioni.Sessioni;
import com.company.App.sessioni.TipoSessione;

import java.util.*;
import java.util.stream.Stream;

public class Applicazione {
    /*
*/
    private GestoreProgrammi gestoreProgrammi;
    private GestoreConsulenti gestoreConsulenti;
    private GestoreSettori gestoreSettori;
    private GestoreConto gestoreConto;

    public Applicazione() throws TipoGestoreNonSupportato {
        gestoreProgrammi = (GestoreProgrammi) ProduttoreGestori.getProduttore(Gestori.PROGRAMMI).produci();
        gestoreConsulenti = (GestoreConsulenti) ProduttoreGestori.getProduttore(Gestori.CONSULENTI).produci();
        gestoreSettori = (GestoreSettori) ProduttoreGestori.getProduttore(Gestori.SETTORI).produci();
        gestoreConto = (GestoreConto) ProduttoreGestori.getProduttore(Gestori.CONTO).produci();
    }

    public Programma creaProgramma(int numeroSessioni, Sessioni sessioni, Livello livello, TipoSessione tipoSessione, Date inizio, Date fine, String nomeSettore) {
        Settore settore = gestoreSettori.getSettore(nomeSettore);
        return gestoreProgrammi.creaProgramma(numeroSessioni, sessioni, livello, tipoSessione, inizio, fine, settore);
    }

    public Stream trovaConsulente(Programma programma){
        return gestoreConsulenti.cercaConsulenti(programma);
    }

    public boolean èValido(Programma programma) {
        if(trovaConsulente(programma) != null){
            return true;
        } else return false;
    }

    public Double calcolaCosto(Programma programma) {
        gestoreConto.calcolaCosto(programma);
    }

}
