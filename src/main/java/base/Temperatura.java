package base;

public class Temperatura {
    //Atributo
    public float valor;

    public Temperatura(float valorTemp){
        this.valor = valorTemp;
    }

    //Metodos Abstratos

    public void paraCelsio(){

    }
    public void paraFahreiheid(){

    }
    public void paraKelvin(){

    }
    public void mostrarCelsio(){

    }
    public void mostrarFahreiheid(){

    }
    public void mostrarKelvin(){

    }


    //Metodos Acessores

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
}
