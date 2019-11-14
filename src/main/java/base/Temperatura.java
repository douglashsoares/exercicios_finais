package base;

import classes.Celsius;
import classes.Fahrenheit;
import classes.Kelvin;

public abstract class Temperatura {
    //Atributo
    protected float valor;

    public Temperatura(float valorTemp){
        this.valor = valorTemp;
    }

    //Metodos Abstratos

    public abstract Celsius paraCelsio();
    public abstract Fahrenheit paraFahrenheit();
    public abstract Kelvin paraKelvin();
    public abstract String mostrarCelsio();
    public abstract String mostrarFahreiheid();
    public abstract String mostrarKelvin();

    //Metodos Acessores

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
}
