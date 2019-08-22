package exercicio_1_basico;

import base.ExercicioBase;
import classes.Pessoa;

public class Exercicio1 extends ExercicioBase {

    public void printaPessoaMaiorIdade(Pessoa pessoa){
        if (pessoa.ehMaiorIdade()){
            System.out.println("nome: " + pessoa.getNome() + "\n"
                    + "Maior idade: sim");
        } else {
            System.out.println("nome: " + pessoa.getNome() + "\n"
                    + "Maior idade: nao");
        }

    }

    @Override
    public void iniciarExercicio() {
        Pessoa pessoa1 = new Pessoa("Salguod", 24);

        printaPessoaMaiorIdade(pessoa1);

        Pessoa pessoa2 = new Pessoa("Keven", 9);

        printaPessoaMaiorIdade(pessoa2);
    }
}
