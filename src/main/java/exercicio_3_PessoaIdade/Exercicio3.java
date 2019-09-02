package exercicio_3_PessoaIdade;

import base.ExercicioBase;
import classes.Pessoa;

import java.util.Random;
import java.util.Scanner;

public class Exercicio3 extends ExercicioBase{


    // criar metodo retornando uma pessoa e com 1 parametro
    // parametro: i
    // instancia a pessoa, cria o nome dela e idade
    // e retorne a pessoa

    @Override
    public void iniciarExercicio() {
        Random random = new Random();
        Scanner teclado = new Scanner(System.in);


        System.out.println("Digite a quantidade de pessoas: ");
        int quantP = teclado.nextInt();

        Pessoa[] pessoaAle = new Pessoa[quantP];

        for (int i = 0; i < quantP; i++){
//            pessoaAle[i] = nomeDoMetodoDeCriarPessoa(i);
            // remova as linhas de baixo
            pessoaAle[i] = new Pessoa();
            pessoaAle[i].criarPessoaAleatória(i);
        }
        for (int i = 0;i < quantP; i++){
            pessoaAle[i].status();
        }


    }
}
