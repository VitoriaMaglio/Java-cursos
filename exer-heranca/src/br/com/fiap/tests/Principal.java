package br.com.fiap.tests;

import br.com.fiap.models.Cachorro;
import br.com.fiap.models.Gato;

public class Principal {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Caramelo");

        cachorro.comer();
        cachorro.latir();

        Gato gato = new Gato("Lua");
//
        gato.beber();
        gato.miar();

    }
}
