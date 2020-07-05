package com.company.App;

public class ProduttoreGestoreSettori implements Produttori {
    @Override
    public Object produci() {
        return new GestoreSettori();
    }
}
