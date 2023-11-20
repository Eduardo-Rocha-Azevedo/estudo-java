public class Vegetal {
    private boolean vivo;
    private int massa;

    public Vegetal(int massa){
        this.vivo = true;
        this.massa = massa;
    }

    public int getMassa(){
        return this.massa;
    }
    public void setVivo(boolean vivo){
        this.vivo = vivo;
    }
    public void info(){
        System.out.printf("_____________________\n");
        System.out.printf("Tipo:        %s%n", getClass().toGenericString());
        System.out.printf("Vivo:        %s%n", this.vivo ? "sim" : "nao");
        System.out.printf("Massa:       %d%n", this.massa);
        System.out.printf("_____________________");
    }
}
