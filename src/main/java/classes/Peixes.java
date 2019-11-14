package classes;

import base.Animal;

public class Peixes extends Animal {

    public Peixes(String nome, int patas){
        setNome(nome);
        setPatas(patas);
    }

    @Override
    public void rugir(){
        System.out.println("PEIXE: plup plup plup...........Plup Plup");
    }

    public void detalhes(){

        System.out.println("Patas: "+getPatas());
        System.out.println("Nome: "+getNome());
        System.out.println("----------------------");
    }

}
