package classes;

import base.Temperatura;

public class Celsius extends Temperatura {
    private Fahrenheit temp;

    public Celsius(float valorTemp) {

        super(valorTemp);
    }

    @Override
    public Celsius paraCelsio() {
        return this;
    }

    @Override
    public Fahrenheit paraFahrenheit() {
        float conversao = (valor * 9/5)+32;
        return new Fahrenheit(conversao);
    }

    @Override
    public Kelvin paraKelvin() {
        float conversao = valor +273.15f;
        return new Kelvin(conversao);
    }

    @Override
    public String mostrarCelsio() {
        return valor+" Graus";
    }

    @Override
    public String mostrarFahreiheid() {
        return (valor *9/5) + 32 + " F ";
    }

    @Override
    public String mostrarKelvin() {
        return (valor + 273.15)+"F";
    }






    /*public Celsius paraCelcius(){
        return this;
    }

    public Fahrenheit paraFahrenheit(){
        double conversao = (valor * 9/5) + 32;
        return new Fahrenheit(conversao);
    }
    public Kelvin paraKelvin(){
        double conversao = valor + 273.15;
        return new Kelvin(conversao);
    }*/



}
