package LuizaCode;

public class Main {

    public static void main(String[] args) {

        //Instanciando um objeto do tipo carro
        Carro meuPrimeiroCaro = new Carro ();

        //instanciar uma Pessoa
        Pessoa pessoaT = new Pessoa("Taina" , 33 , "j345r");


        //Atribuir valores aod atributos
        meuPrimeiroCaro.setTipo("Conversivel");
        meuPrimeiroCaro.setPlaca("qwe123");
        meuPrimeiroCaro.setCor("laranja");
        meuPrimeiroCaro.setNumeroDePortas(3);
        meuPrimeiroCaro.setDona(pessoaT);



        //Acessando os valores
        System.out.println("O tipo é: " + meuPrimeiroCaro.getTipo());
        System.out.println("A placa é: " + meuPrimeiroCaro.getPlaca());
        System.out.println("A cor é: " + meuPrimeiroCaro.getCor());
        System.out.println("Quantidade de portas é: " + meuPrimeiroCaro.getNumeroDePortas());
        System.out.println("A dona dessa carro é: " + meuPrimeiroCaro.getDona().getNome());

        //Segungo Objeto instanciado do tipo carro
        Carro meuSegundoCarro = new Carro("Conversilvel", "Azul", "qwe1234", 4);

        System.out.println("\n \n \n A cor  é: " + meuSegundoCarro.getCor());
        meuSegundoCarro.setCor("laranja");
        System.out.println("A nova cor é: " + meuSegundoCarro.getCor());

        System.out.printf("Cor é: %s , placas é %s , e portas é %d", meuSegundoCarro.getCor(), meuSegundoCarro.getPlaca(), meuSegundoCarro.getNumeroDePortas());

        //Acessando metodos especificos
        meuPrimeiroCaro.ligar();
        meuPrimeiroCaro.desligar();
       // int valor = meuPrimeiroCaro.dobrarportas();
        System.out.println("O dobro de portas é: " + meuPrimeiroCaro.dobrarportas());



    }

}
