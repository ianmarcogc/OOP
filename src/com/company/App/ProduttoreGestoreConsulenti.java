package com.company.App;

class ProduttoreGestoreConsulenti implements Produttori {
    @Override
    public Object produci() {
        return new GestoreConsulenti();
    }
}
