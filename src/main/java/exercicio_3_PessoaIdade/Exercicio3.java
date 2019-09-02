package exercicio_3_PessoaIdade;

import base.ExercicioBase;
import classes.Pessoa;

public class Exercicio3 extends ExercicioBase{
    @Override
    public void iniciarExercicio() {
    Pessoa p1 = new Pessoa("Keven",12);

    p1.idades();
    p1.status();

    }
}
