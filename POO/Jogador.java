public class Jogador{
    // Atributos
    private int num = 0;// NÃO é acessivel fora da classe
    private int vidas = 0;

    
    // Construtor
    public Jogador(int num){
        this.num = num;
        this.vidas = 3;
        System.out.printf("%nJogador numero %d criado!%n", num);
    }
}