package com.company.App;

import com.company.App.eccezioni.TipoGestoreNonSupportato;

class ProduttoreGestori {
    static Produttori getProduttore(Gestori tipoGestore) throws TipoGestoreNonSupportato {
        if (Gestori.CONSULENTI.equals(tipoGestore)){
            return new ProduttoreGestoreConsulenti();
        } else if (Gestori.PROGRAMMI.equals(tipoGestore)){
            return new ProduttoreGestoreProgrammi();
        } else if (Gestori.SETTORI.equals(tipoGestore)){
            return new ProduttoreGestoreSettori();
        } else if (Gestori.CONTO.equals(tipoGestore)){
            return new ProduttoreGestoreConto();
        } else {
            throw new TipoGestoreNonSupportato();
        }
    }
}
