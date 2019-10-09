package classes;

import base.Animal;

public class Cachorro extends Animal {

    //Metodos Abstratos
    @Override
    public void rugir() {
        System.out.println("cachorro: AUAUAUUAUAUAU  AUAUAUAUAUA");
    }

    public void detalhes(){
        System.out.println("----------------------");
        System.out.println("Patas: "+getPatas());
        System.out.println("Tipo: "+getTipo());
    }

}
