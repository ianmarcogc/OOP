package com.company.App;

class ProduttoreGestoreProgrammi implements Produttori {
    @Override
    public Object produci() {
        return new GestoreProgrammi();
    }
}
