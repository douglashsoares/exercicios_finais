package classes;

import base.Animal;

public class Peixes extends Animal {

    public Peixes(){
        this.setPatas(0);
        this.setTipo("reptil");
        this.setRugir(false);
    }
    public void rugindo(){
        if(getRugir() == true){
            System.out.println("Peixe: blup blup blup blup");
        }else{
            System.out.println("Peixe: ....(calado)...");
        }
    }
    public void detalhes(){

        System.out.println("Patas: "+getPatas());
        System.out.println("Tipo: "+getTipo());
        System.out.println("Ele esta rugindo? "+getRugir());
        System.out.println("----------------------");
    }

}
