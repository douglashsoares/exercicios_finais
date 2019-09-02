package classes;


import sun.awt.SunHints;

import java.util.Random;
import java.util.Scanner;

public class Pessoa {
    Random random = new Random();
    Scanner teclado = new Scanner(System.in);

    private String nome;
    private int idade ;

    public  Pessoa(){

    }
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Pessoa criarPessoaAleatória( int p){
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Pessoa" + p);
        pessoa.setIdade(random.nextInt(40));
        return pessoa;
    }
    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public boolean ehMaiorIdade(){
        return idade >= 18;
    }
    
    public void status(){
        System.out.println("------------------------------------");
        System.out.println("O seu nome é "+this.getNome());
        System.out.println("A sua idade é "+this.getIdade());
        System.out.println("É maior de idade? "+this.ehMaiorIdade());

    }

}
