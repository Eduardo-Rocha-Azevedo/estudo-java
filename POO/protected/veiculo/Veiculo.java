package veiculo;
public class Veiculo{
    protected String nome;
    protected int tipo;

    public Veiculo(String nome, int tipo){
        this.nome = nome;
        this.tipo = tipo;
    }
    public void info(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Tipo: " + this.tipo);
    }

    public String getNome(){
        return this.nome;
    }

}