abstract class Animal implements SerVivo {
    private boolean vivo;
    private int massa;
    private int x;
    private int y;
    private int vel;
    private int forca; 

    public Animal(int vel, int massa, int forca){
        this.vivo = true;
        this.vel = vel;
        this.x = 0;
        this.y = 0; 
        this.massa = massa;
        this.forca = forca;
    } 
    

    public void setVivo(boolean vivo){
        this.vivo = vivo;
    }
    public boolean getVivo(){
        return this.vivo;
    }
  
    public void setVel(int vel){
        this.vel = vel;
    }
    public int getVel(){
        return this.vel;
    }
  public void setForca(int forca){
        this.forca = forca;
    }
    public int getForca(){
        return this.forca;
    }   

    public void setMassa(int massa){
        this.massa = massa;
    }
    public int getMassa(){
        return this.massa;
    }
    public void atacar(Animal a){
        if(this.vivo){
            if(this.forca > a.forca){
                //this.forca += a.getMassa();
                a.vivo = false;
            }else{ 
                this.vivo = false;
            }
        }else{
       
            System.out.println(" esta morto, nao pode atacar\n");
            System.out.println("_____________________");
        }
    }
    public void mover(){
        if(this.vivo){
            this.x += this.vel;
            this.y += this.vel;
        }else{
     
            System.out.println(" esta morto, nao pode se mover\n");
            System.out.println("_____________________");
        }
    }
    public void comer(int massa){
        if(this.vivo){
            this.forca += massa;
        }else{

            System.out.println(" esta morto, nao pode comer\n");
            System.out.println("_____________________");
        }
    }
    public void info(){
        System.out.printf("_____________________\n");
        System.out.printf("Tipo:        %s%n", getClass().toGenericString());
        System.out.printf("Vivo:        %s%n", this.getVivo() ? "sim" : "nao");
        System.out.printf("Massa:       %d%n", this.massa);
        System.out.printf("Velocidade:  %d%n", this.vel);
        System.out.printf("Forca:       %d%n",this.forca);
        System.out.printf("_____________________");
    }
}