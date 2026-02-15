import java.util.Scanner;

public class Carrotestar {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite o nome do carro: ");
        String nome = input.nextLine();

        System.out.println("Digite a marca do carro: ");
        String marca = input.nextLine();

        System.out.println("Digite o ano do carro: ");
        int ano = input.nextInt();

        System.out.println("Digite a velocidade inicial: ");
        int vel = input.nextInt();

        // Criando objeto com construtor
        Carro c1 = new Carro(nome, marca, ano, vel);

        c1.imprimirDados();

        input.close();
    }
}