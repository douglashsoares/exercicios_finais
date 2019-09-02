package classes;


import java.util.Random;

public class Pessoa {
    Random random = new Random();
    private String nome;
    private int idade ;

    String pessoasAle[] = new String[5];
    int idadeAle[] = new int[5];




    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    /*public void pessoas(){
          for (int i = 0; i < pessoasAle.length; i++){
              return pessoasAle(i);
              pessoasAle[i] = "Pessoa" + 1;

          }
    }*/
    public void idades(){
        for (int i = 0; i<idadeAle.length;i++ ){
            idadeAle[i] = random.nextInt(40);
            System.out.println(idadeAle);
        }
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
