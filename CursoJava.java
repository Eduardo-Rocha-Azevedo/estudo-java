import java.util.Scanner;

public class CursoJava {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int n1 = 0, n2 = 0, res = 0;
        String nome = "";

        System.out.print("Digite seu nome: ");
        nome = scan.nextLine();//para strings
        System.out.print("Digite o primeiro número: ");
        n1= scan.nextInt();
        System.out.print("Digite o segundo número: ");
        n2= scan.nextInt();

        res = n1 + n2;
        System.out.printf("%s a soma de %d + %d e %d",nome, n1, n2, res); 
    }
}
