package classes;

import base.Temperatura;

public class Kelvin extends Temperatura {
    public Kelvin(float valorTemp) {
        super(valorTemp);
    }

    @Override
    public Celsius paraCelsio() {
        float conversao = valor - 273.15f;
        return new Celsius(conversao);
    }

    @Override
    public Fahrenheit paraFahrenheit() {
        float conversao = (valor -273.15f)*(9/5)+32;
        return new Fahrenheit(conversao);
    }

    @Override
    public Kelvin paraKelvin() {
        return this;
    }

    @Override
    public String mostrarCelsio() {
        return (valor - 273.15f)+" C";
    }

    @Override
    public String mostrarFahreiheid() {
        return (valor - 273.15f)*(9/5)+32+"F";
    }

    @Override
    public String mostrarKelvin() {
        return valor+" K";
    }
}
