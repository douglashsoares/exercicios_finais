package exercicio_4_Animal;

import base.Animal;
import base.ExercicioBase;
import classes.Cachorro;
import classes.Passaro;
import classes.Peixes;

import java.util.Random;
import java.util.Scanner;

public class Exercicio4 extends ExercicioBase {
    @Override
    public void iniciarExercicio() {
    Scanner teclado = new Scanner(System.in);
        System.out.println("------------------------------------------------------");
        System.out.println("Seja Bem vindo ao Zoologico do Rugido!!! ");
        System.out.println("------------------------------------------------------");
        System.out.println("Qauntos rugidos voce deseja escutar?");
        int quantAnimal = teclado.nextInt();


    Animal[] animals = new Animal[quantAnimal];
    Random random = new Random();


    for (int i = 0; i < animals.length; i++){
        int escolha = random.nextInt(3);

        switch (escolha){
            case 0:
                animals[i] = new Cachorro();
                break;
            case 1:
                animals[i] = new Peixes();
                break;
            case 2:
                animals[i] = new Passaro();
                break;
            default:
                System.out.println("Esse animal nao está na lisata");
                break;
        }
        animals[i].rugir();
    }

            /*Cachorro dog = new Cachorro();
    Passaro bird = new Passaro();
    Peixes fish = new Peixes();

    bird.rugir();
    bird.detalhes();

    fish.rugir();
    fish.detalhes();

    dog.rugir();
    dog.detalhes();*/

    }
}
