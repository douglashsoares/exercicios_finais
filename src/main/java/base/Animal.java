package base;

public abstract class Animal {
    //Atributos
    protected int patas;
    protected String nome;

    //Metodo Abstrato
    public abstract void rugir();

    //Metodos especiais

    public void setPatas(int pa) {
        this.patas = pa;
    }

    public int getPatas() {
        return this.patas;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}




