package classes;

import base.Animal;

public class Cachorro extends Animal {
    //Construtor
    public Cachorro(String nome, int patas){
        this.nome = nome;
        this.patas = patas;
    }
    //Metodos Abstratos
    @Override
    public void rugir() {
        System.out.println("cachorro: AUAUAUUAUAUAU  AUAUAUAUAUA");
    }

    public void detalhes(){
        System.out.println("----------------------");
        System.out.println("Patas: "+getPatas());
        System.out.println("Tipo: "+getNome());
    }

}
