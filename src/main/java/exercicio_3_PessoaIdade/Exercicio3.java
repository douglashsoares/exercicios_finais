package exercicio_3_PessoaIdade;

import base.ExercicioBase;
import classes.Pessoa;

import java.util.Random;
import java.util.Scanner;

public class Exercicio3 extends ExercicioBase {


    public Pessoa criarPessoaAleatoria(int p) {
        Random random = new Random();
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Pessoa" + p);
        pessoa.setIdade(random.nextInt(40));
        return pessoa;
    }

    @Override
    public void iniciarExercicio() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a quantidade de pessoas: ");
        int quantP = teclado.nextInt();

        Pessoa[] pessoaAle = new Pessoa[quantP];

        for (int i = 0; i < quantP; i++) {
            pessoaAle[i] = criarPessoaAleatoria(i);
        }
        for (int i = 0; i < quantP; i++) {
            pessoaAle[i].status();
        }

    }

}
