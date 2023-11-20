public class Aranha extends Animal {
    private int veneno;

    public Aranha(int massa, int forca, int vel, int veneno){
        super(vel, massa, forca);
        this.veneno = veneno;
    }

    @Override
    public void atacar(Animal a){
        if(this.getVivo()){
            if(this.getForca() > a.getForca()){
                this.setForca(this.getForca() + a.getMassa());
            }
            if((this.getForca() + this.veneno) > a.getForca()){
                //this.setForca(this.getForca() + a.getMassa());
                a.setVivo(false);
            }else{
                this.setVivo(false);
            }
        }else{
 
            System.out.println( " esta morto, nao pode atacar\n");
            System.out.println("_____________________\n");
        }
    }
}
