package classes;

import base.Animal;

public class Passaro extends Animal {

    @Override
    public void rugir() {
        System.out.println("Passaro: Piu Piu Piu............PIUPIU ");
    }

    public void detalhes(){

        System.out.println("Patas: "+getPatas());
        System.out.println("Tipo: "+getTipo());
        System.out.println("----------------------");
    }
}
