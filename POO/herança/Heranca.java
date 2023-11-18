public class Heranca {
    public static void main(String[] args) {
        Carro c1 = new Carro("Golf");
        Carro c2 = new Carro("HRV");
        CarroCombate c3 = new CarroCombate("Tanque", 100);
        CarroCombate c4 = new CarroCombate("Guerra", 50);

        c3.atirar();
        c4.atirar();
        c4.sofrerDano(30);
        c3.sofrerDano(500);

        c1.info();
        c2.info();
        c3.info();
        c4.info();
        
    }
}
