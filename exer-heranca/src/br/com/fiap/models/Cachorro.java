package br.com.fiap.models;

public class Cachorro extends Animais {
    public Cachorro(String nome){
        super(nome);
    }

    public void latir(){
        System.out.printf("%s latiu", getNome());
    }

    public void lamber(){
        System.out.printf("%s lambeu", getNome());
    }
}
