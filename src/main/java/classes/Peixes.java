package classes;

import base.Animal;

public class Peixes extends Animal {

    @Override
    public void rugir(){
        System.out.println("PEIXE: plup plup plup...........Plup Plup");
    }

    public void detalhes(){

        System.out.println("Patas: "+getPatas());
        System.out.println("Tipo: "+getTipo());
        System.out.println("----------------------");
    }

}
