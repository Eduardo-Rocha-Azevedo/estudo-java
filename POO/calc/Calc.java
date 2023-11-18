import java.util.Scanner;

public class Calc{
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            Numero n1 = new Numero();
            Numero n2 = new Numero();
            Numero res = new Numero();
            String op="s";

            while(op.equals("s") || op.equals("S")){
            System.out.println("Digite o primeiro valor: ");
            n1.setValor(scan.nextInt());

            System.out.println("Digite o segundo valor: ");
            n2.setValor(scan.nextInt());

            res.setValor(n1.getValor() + n2.getValor());
            System.out.printf("%d + %d = %d",n1.getValor(),n2.getValor(),res.getValor());
            System.out.println("\n Deseja continuar? (s/n)");
            op = scan.next();
            System.out.println("\n__________________________\n");

        }
    }
}
