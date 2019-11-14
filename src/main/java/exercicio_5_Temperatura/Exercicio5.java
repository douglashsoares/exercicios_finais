package exercicio_5_Temperatura;

import base.ExercicioBase;
import base.Temperatura;
import classes.Celsius;
import classes.Fahrenheit;
import classes.Kelvin;

public class Exercicio5 extends ExercicioBase {
    @Override
    public void iniciarExercicio() {
        Temperatura c1 = new Celsius(42);
        Temperatura k1 = new Kelvin(50);
        Temperatura f1 = new Fahrenheit(80);

        c1.mostrarCelsio();
        c1.paraFahrenheit();
        c1.mostrarCelsio();
        c1.paraKelvin();
        c1.mostrarKelvin();
        c1.paraCelsio();
        c1.mostrarFahreiheid();


    }
}
