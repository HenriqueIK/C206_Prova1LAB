package Prova;
public class Rapper{
    String nome;
    float nota;
    int idade;
    Microfone m1;
    public Rapper(String nome, float nota, int idade, String mictipo){ // construtor para rapper
        this.nome = nome;
        this.nota = nota;
        this.idade = idade;

        this.m1 = new Microfone(mictipo);
    }
    void mostraInfo(){ // mostrando informações do rapper
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Nota: " + this.nota + "/10");
        System.out.println("Microfone: " + this.m1.material);
    }
}