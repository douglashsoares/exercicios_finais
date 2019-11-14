package classes;

import base.Animal;

public class Passaro extends Animal {

    public Passaro(String nome, int patas){
        setNome(nome);
        setPatas(patas);
    }

    @Override
    public void rugir() {
        System.out.println("Passaro: Piu Piu Piu............PIUPIU ");
    }

    public void detalhes(){

        System.out.println("Patas: "+getPatas());
        System.out.println("Nome: "+getNome());
        System.out.println("----------------------");
    }
}
