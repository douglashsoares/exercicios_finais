package classes;

import base.Animal;

public class Cachorro extends Animal {
    //Atributos

    //Metodo Construtor
    public Cachorro() {
        this.setPatas(4);
        this.setTipo("Mamifero");
        this.setRugir(false);
    }

    //Metodos Abstratos
    public void detalhes(){

        System.out.println("Patas: "+getPatas());
        System.out.println("Tipo: "+getTipo());
        System.out.println("Ele esta rugindo? "+getRugir());
        System.out.println("----------------------");
    }


    public void rugindo() {
        if (this.getRugir() == true) {
            System.out.println("cachorro: AU AU AU... AU AU AU");
        } else {
            System.out.println("cachorro:...(calado)...");
        }
    }


}
