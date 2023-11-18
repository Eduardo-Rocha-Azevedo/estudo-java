public class Jogador{
    // Atributos
    private final int maxVidas = 3; 
    private int num;// NÃO é acessivel fora da classe
    private int vidas = 0;
    static boolean alerta = false;
    static int qtdJogadores = 0; 
    static int pontosJogadores = 0;

    
    // Construtor=================================
    public Jogador(int num){
        this.num = num;
        this.vidas = 1;
        System.out.printf("%nJogador numero %d criado!%n", num);
    }


    // Metodos====================================
    public int getVidas(){
        return this.vidas;
    }
    public void setVidas(int vidas){
        if (vidas < maxVidas) {
            this.vidas = maxVidas;
        }else if(vidas < 0){
            this.vidas = 0;
        }else {
            this.vidas = vidas; 
        }
        
    }

    public void addVidas(){
        if(this.vidas < maxVidas){
            this.vidas++;
        }
    }
    static void pontosJogadores(){
        pontosJogadores += 10;
    }

    public void info(){
        System.out.printf("jogador:%d%n",this.vidas);
        System.out.printf("vidas:%d%n",this.vidas);
        System.out.printf("alerta:%s%n", alerta ? "sim" : "nao");
        System.out.printf("jogadores:%d%n",qtdJogadores);
        System.out.printf("pontos:%d",pontosJogadores);
        System.out.println("\n________________________________\n");
    }
}