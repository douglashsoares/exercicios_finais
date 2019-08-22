package base;

public abstract class Automovel {
    private int rodas;
    private String nome;
    private double aceleracao;
    private double velocidadeAtual;
    private String tipo;

    private final double valorFreio = 10;

    public Automovel(String nome, double aceleracao) {
        this.nome = nome;
        this.aceleracao = aceleracao;
    }

    public int getRodas() {
        return rodas;
    }

    public void setRodas(int rodas) {
        this.rodas = rodas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getAceleracao() {
        return aceleracao;
    }

    public void setAceleracao(double aceleracao) {
        this.aceleracao = aceleracao;
    }

    public double getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(double velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void acelerar() {
        velocidadeAtual += aceleracao;
    }

    public void frear() {
        velocidadeAtual -= valorFreio;
    }

    public void mostrarVelocidadeAtual() {
        System.out.println("-------------"
                + "\nO(a) " + tipo + ": " + nome + "\n"
                + "velocidade atual: " + velocidadeAtual + "Km/s");
    }

    @Override
    public String toString() {
        return "----------------------\n"
                + "Tipo: " + tipo + "\n"
                + "nome: " + nome + "\n"
                + "numero de rodas: " + rodas + "\n"
                + "Aceleracao: " + aceleracao;
    }
}
