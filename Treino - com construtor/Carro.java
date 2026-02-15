 public class Carro {

    // Atributos (idealmente privados)
    private String nome;
    private String marca;
    private int ano;
    private int vel;

    // Construtor
    public Carro(String nome, String marca, int ano, int velInicial) {
        this.nome = nome;
        this.marca = marca;
        this.ano = ano;
        this.vel = velInicial;
    }

    // Métodos
    public void acelerar(int aceleracao) {
        vel += aceleracao;
    }

    public void freiar(int reduzir) {
        vel -= reduzir;
    }

    public void buzinar() {
        System.out.println("BIBIBIBIBI");
    }

    // Método para exibir dados
    public void imprimirDados() {
        System.out.println("\n--- Dados do Carro ---");
        System.out.println("Nome: " + nome);
        System.out.println("Marca: " + marca);
        System.out.println("Ano: " + ano);
        System.out.println("Velocidade atual: " + vel + " Km/h");
    }
}