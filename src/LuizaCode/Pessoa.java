package LuizaCode;

public class Pessoa {

    //Atributos
    String nome;
    int idade;
    String cnh;

    //Construtores
    public Pessoa(){
    }

    public Pessoa(String nome, int idade, String cnh) {
        this.nome = nome;
        this.idade = idade;
        this.cnh = cnh;
    }

    //Get e Set


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    //Metodos
    void Dirigir() {
        System.out.println(" Pessoa Dirigindo!!!");
    }

    void comer(){
        System.out.println("Pessoa Comendo!!!");
    }

    public boolean dormir(){
        return true;
    }
}


