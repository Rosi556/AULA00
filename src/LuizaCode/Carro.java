package LuizaCode;

public class Carro {

    //Atributos
    String tipo;
    String cor;
    String placa;
    int numeroDePortas;
    Pessoa dona;

    //Construtor
    //Construtor
    public Carro(){
    }
    public Carro(String tipo, String cor, String placa, int numeroDePortas) {
        this.tipo = tipo;
        this.cor = cor;
        this.placa = placa;
        this.numeroDePortas = numeroDePortas;
    }
    //Get e Set

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getNumeroDePortas() {
        return numeroDePortas;
    }

    public void setNumeroDePortas(int numeroDePortas) {
        this.numeroDePortas = numeroDePortas;
    }

    public Pessoa getDona() {
        return dona;
    }

    public void setDona(Pessoa dona) {
        this.dona = dona;
    }

    //Metodos
    void ligar() {
        System.out.println("Carro ligado!!!");

    }

    void desligar(){
        System.out.println("Carro desligado");
    }

    int dobrarportas(){
        return numeroDePortas * 2;
    }

}
