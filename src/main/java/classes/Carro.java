package classes;

import base.Automovel;

public class Carro extends Automovel {

    public Carro(String nome, double aceleracao) {
        super(nome, aceleracao);
        setRodas(4);
        setTipo("Carro");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
