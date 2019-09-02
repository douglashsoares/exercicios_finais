package exercicio_3_PessoaIdade;

import base.ExercicioBase;
import classes.Pessoa;

import java.util.Random;
import java.util.Scanner;

public class Exercicio3 extends ExercicioBase{
    @Override
    public void iniciarExercicio() {
        Random random = new Random();
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a quantidade de pessoas : ");
        int quantP = teclado.nextInt();


        String pessoaAle[] = new String[quantP];
        int idadeAle[] = new int[quantP];

        for (int c = 0; c <  pessoaAle.length; c++){
            pessoaAle[c] = "Pessoa" + 1;

        }
        for (int i =0; i < idadeAle.length; i++){
            idadeAle[i] = random.nextInt(40);
        }

        for(int i = 0; i < pessoaAle.length; i++) {
            Pessoa p1 = new Pessoa(pessoaAle[i], idadeAle[i]);
            p1.ehMaiorIdade();
            p1.status();
        }


    }
}
