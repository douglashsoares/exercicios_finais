package classes;

import base.Temperatura;

public class Fahrenheit extends Temperatura {

    public Fahrenheit(float valorTemp) {
        super(valorTemp);
    }

    @Override
    public Celsius paraCelsio() {
        float conversao = (valor - 32)/1.8f;
        return new Celsius(conversao);
    }

    @Override
    public Fahrenheit paraFahrenheit() {
        return this;
    }

    @Override
    public Kelvin paraKelvin() {
        float conversao = (valor -32)*(5/9) + 273.15f;
        return new Kelvin(conversao);
    }

    @Override
    public String mostrarCelsio() {
        return (valor -32)/1.8f +"C";
    }

    @Override
    public String mostrarFahreiheid() {
        return valor +" F";
    }

    @Override
    public String mostrarKelvin() {
        return (valor - 32)*(5/9) +"K";
    }
}
