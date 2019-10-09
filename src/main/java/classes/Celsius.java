package classes;

import base.Temperatura;

public class Celsius extends Temperatura {
    public Celsius(float valorTemp) {
        super(valorTemp);
    }
    public Celsius paraCelcius(){
        return this;
    }


}
