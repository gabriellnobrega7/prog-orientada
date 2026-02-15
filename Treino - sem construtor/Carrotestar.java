  import java.util.Scanner;

public class Carrotestar {
    
    public static Scanner input = new Scanner(System.in);

    public static void nomeDoCarro(Carro c1){

        System.out.println("Digite o nome do carro: ");
        c1.nome = input.nextLine();
        input.nextLine();

        System.out.println("O nome do carro é: " + c1.nome);
    }

     public static void AnodoCarro(Carro c1){

        System.out.println("Digite o ano do carro: ");
        c1.ano = input.nextInt();
        input.nextLine();

        System.out.println("O ano do carro é: " + c1.ano);
    }

     public static void MarcadoCarro(Carro c1){

        System.out.println("Digite a marca do carro: ");
        c1.marca = input.nextLine();
        input.nextLine();

        System.out.println("O nome do carro é: " + c1.marca);
    }

    public static void Imprimirtudo(Carro c1){

        System.out.println("Nome: " + c1.nome);
        System.out.println("Marca: " + c1.marca);
        System.out.println("Ano: " + c1.ano);
        System.out.println("Velocidade atual: " + c1.vel + "Km/h");

    }

    public static void main(String[] args) {
        
        Carro c1 = new Carro();
        c1.vel = 60;

        nomeDoCarro(c1);
        MarcadoCarro(c1);
        AnodoCarro(c1);

        System.out.println();

        Imprimirtudo(c1);


    }

}
