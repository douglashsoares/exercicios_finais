package exercicio_4_Animal;

import base.ExercicioBase;
import classes.Cachorro;
import classes.Passaro;
import classes.Peixes;

public class Exercicio4 extends ExercicioBase {
    @Override
    public void iniciarExercicio() {
    Cachorro dog = new Cachorro();
    Passaro bird = new Passaro();
    Peixes fish = new Peixes();

    bird.setRugir(true);
    bird.rugindo();
    bird.detalhes();

    fish.rugindo();
    fish.detalhes();

    dog.setRugir(true);
    dog.rugindo();
    dog.detalhes();
    }
}
