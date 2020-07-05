package com.company.App;

import java.util.List;

class GestoreSettori {

    List<Settore> settori;

    /**
     * restituisce il settore cercato
     * @param nomeSettore settore da cercare
     * @return
     */
    public Settore getSettore(String nomeSettore) {
        Settore settore= new Settore(3008d,nomeSettore);
        return settore;
    }
}
