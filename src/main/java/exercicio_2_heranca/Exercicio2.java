package exercicio_2_heranca;

import base.Automovel;
import base.ExercicioBase;
import classes.Carro;
import classes.Moto;

import java.util.Scanner;

public class Exercicio2 extends ExercicioBase {

    public int dirigirAutomovel(Automovel automovel){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Escolha o que fazer: \n"
                +"1- Acelerar\n"
                +"2- Freiar");
        int escolha = teclado.nextInt();

        switch (escolha){
            case 1 :
                automovel.acelerar();
                break;
            case 2:
                automovel.frear();
                break;
            default:
                System.out.println("Nao existe essa escolha - finalizando programa");
                break;
        }

        automovel.mostrarVelocidadeAtual();

        return escolha;
    }

    @Override
    public void iniciarExercicio() {
        Carro carro = new Carro("Uno",10);
        Moto moto = new Moto("Hornet",20);

        System.out.println(carro.toString());
        System.out.println(moto.toString());

        int escolha;
        do {
            escolha = dirigirAutomovel(moto);
        }while (escolha == 1 || escolha == 2);
    }
}
