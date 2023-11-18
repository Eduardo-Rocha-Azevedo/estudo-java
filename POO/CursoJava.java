public class CursoJava{
    public static void main(String[] args){
        int num = 0;

        Jogador j1 = new Jogador(++num);
        Jogador j2 = new Jogador(++num);

        Jogador.alerta = true;

        j1.info();
        j2.info();
        Jogador.pontosJogadores();
        Jogador.pontosJogadores();
        Jogador.pontosJogadores();

        System.out.println("Jogador 1 vidas: " + j1.getVidas());
        System.out.println("Jogador 2 vidas: " + j2.getVidas());
    
    }
}