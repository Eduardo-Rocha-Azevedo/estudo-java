import veiculo.Veiculo;

public class Aviao extends Veiculo {
    private int categoria;
    protected int tipo;

    public Aviao(String nome, int tipo){
        super(nome, 10);
        this.tipo = tipo;
    }

    public void info(){
         System.out.println("Categoria: " + this.categoria);
         super.info();
      
    }
}
