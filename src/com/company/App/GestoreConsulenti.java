package com.company.App;

import com.company.App.sessioni.Livello;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

class GestoreConsulenti {
    List<Consulente> consulenti;


    Stream cercaConsulenti(Programma programma) {
        List<Consulente> consulentiPossibili = new ArrayList<>();
        for (Consulente consulente : consulenti) {
            Livello level = consulente.getCompetenze().get(programma.getSettore());
            if (level != null && level.compareTo(programma.getLivello()) >= 0) {
                consulentiPossibili.add(consulente);
            }
        }
        return consulentiPossibili.stream();
    }
}
