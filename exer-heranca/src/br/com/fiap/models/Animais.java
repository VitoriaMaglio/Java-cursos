package br.com.fiap.models;

public class Animais {
    private String nome;

    public void comer(){
        String mensagem = String.format("%s comeu\n", nome);
        System.out.println(mensagem);
    }

    public void beber(){
        String mensagem  = String.format("%s bebeu\n", nome);
        System.out.println(mensagem);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Animais(String nome){
        this.nome = nome;
    }
}
//