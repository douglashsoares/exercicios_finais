package base;

public abstract class Animal {
    //Atributos
    private int patas;
    private String tipo;
    private String rugir;

    //Metodo Abstrato
    public void rugir() {

    }

    //Metodos especiais

    public void setPatas(int pa) {
        this.patas = pa;
    }

    public int getPatas() {
        return this.patas;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}




