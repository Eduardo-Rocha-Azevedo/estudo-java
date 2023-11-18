public class CarroCombate extends Carro{
    private final int MAX_ARMAMENTO = 100;
    private final int MIN_ARMAMENTO = 0;
    private int qtdArmamento;

    public CarroCombate(String nome, int blindagem){
      super(nome); //chama o construtor da classe pai  
      setArmamento(true);
      setBlindagem(blindagem);
      this.qtdArmamento = 100;
    }

    public void setQtdArmamento(int qtdArmamento){
        this.qtdArmamento += qtdArmamento;
     if(qtdArmamento > MAX_ARMAMENTO){
        this.qtdArmamento = MAX_ARMAMENTO;
        }

     if(qtdArmamento <=0){
        this.qtdArmamento = MIN_ARMAMENTO;
        }
    }
    
    public int getQtadeArmamento(){
        return this.qtdArmamento;
    }

    public void atirar(){
        if(this.qtdArmamento > MIN_ARMAMENTO){
            setQtdArmamento(-1);
        }else{
            System.out.println("Sem armamento");
        }
    }

    public void info(){
      System.out.printf("Qtde Arma: %d%n", this.qtdArmamento);
      super.info();
    }
}
