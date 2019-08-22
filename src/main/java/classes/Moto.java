package classes;

import base.Automovel;

public class Moto extends Automovel {

    public String guidon;

    public Moto(String nome, double aceleracao) {
        super(nome, aceleracao);
        setRodas(2);
        setTipo("Moto");
    }
}
