package classes;

import base.Animal;

public class Passaro extends Animal {
    private int asas;

    public Passaro(){
        this.setPatas(2);
        this.setTipo("ave");
        this.setRugir(false);
    }
    public void rugindo(){
        if(getRugir() == true){
            System.out.println("passaro: PIU PIU PIU PIU PIU");
        }else{
            System.out.println("passaro: ....(calado)...");
        }
    }
    public void detalhes(){

        System.out.println("Patas: "+getPatas());
        System.out.println("Tipo: "+getTipo());
        System.out.println("Ele esta rugindo? "+getRugir());
        System.out.println("----------------------");
    }
}
