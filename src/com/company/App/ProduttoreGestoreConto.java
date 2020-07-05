package com.company.App;

class ProduttoreGestoreConto implements Produttori {
    @Override
    public Object produci() {
        return new GestoreConto();
    }
}
