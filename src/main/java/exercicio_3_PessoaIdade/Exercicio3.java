package exercicio_3_PessoaIdade;

import base.ExercicioBase;
import classes.Pessoa;

import java.util.Random;
import java.util.Scanner;

public class Exercicio3 extends ExercicioBase{

    private Random random = new Random();
    private Scanner teclado = new Scanner(System.in);

    // criar metodo retornando uma pessoa e com 1 parametro
    // parametro: i
    // instancia a pessoa, cria o nome dela e idade

    @Override
    public void iniciarExercicio() {

        System.out.println("Digite a quantidade de pessoas: ");
        int quantP = teclado.nextInt();

        Pessoa[] pessoaAle = new Pessoa[quantP];

        for (int i = 0; i < quantP; i++){
//            pessoaAle[i] = nomeDoMetodoDeCriarPessoa(i);
            // remova as linhas de baixo
            pessoaAle[i] = new Pessoa();
            pessoaAle[i].setNome("Pessoa" + i);
            pessoaAle[i].setIdade(random.nextInt(40));
        }
        for (int i = 0;i < quantP; i++){
            pessoaAle[i].status();
        }


    }
    // e retorne a pessoa
}
