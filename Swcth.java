import java.util.Scanner;
public class Swcth {
    public static void main( String[] args){
        Scanner scaner = new Scanner(System.in);
    
        System.out.println("Bem vindo a PIZZARIA PIZZA");
        System.out.println("Escolha uma opção");
        System.out.println("1 - Ver o cardápio");
        System.out.println("2 - Sobre nos");
        System.out.println("3 - Sair");

        int opc = scaner.nextInt();
        switch(opc){
            case 1: {
                System.out.println("\tCardapio");
                System.out.println("|______________________________________________________|");
                System.out.println("| 1 - Pizza de Calabresa                       R$ 45,00|");
                System.out.println("| 2 - Pizza de Frango                          R$ 50,00|");
                System.out.println("| 3 - Pizza de Queijo                          R$ 60,00|");
                System.out.println("| 4 - Pizza de Chocolate                       R$ 54,00|");
                System.out.println("| 5 - Pizza de Banana                          R$ 40,00|");
                System.out.println("| 6 - Pizza de Morango                         R$ 50,00|");
                System.out.println("| 7 - Pizza de Abacaxi                         R$ 45,00|");
                System.out.println("| 8 - Pizza de Camarão                         R$ 70,00|");
                System.out.println("| 9 - Pizza de Carne Seca                      R$ 65,00|");
                System.out.println("|10 - Pizza de Carne de Sol                    R$ 65,00|");
                System.out.println("|11 - Pizza de Carne de Sol com Queijo         R$ 70,00|");
                System.out.println("|12 - Pizza de Carne de Sol com Camarão        R$ 75,00|");
                System.out.println("|13 - Pizza de Carne de Sol com Banana         R$ 70,00|");
                System.out.println("|14 - Pizza de Carne de Sol com Abacaxi        R$ 70,00|");
                System.out.println("|15 - Pizza de Carne de Sol com Morango        R$ 70,00|");
                System.out.println("|16 - Pizza de Carne de Sol com Chocolate      R$ 70,00|");
                System.out.println("|17 - Pizza de Carne de Sol com Frango         R$ 70,00|");
                System.out.println("|______________________________________________________|");     
                break;
            }
            case 2: {
                System.out.println("\tSobre nos");
                System.out.println("A PIZZARIA PIZZA foi fundada em 2019 por um grupo de amigos que gostavam de pizza");
                System.out.println("e resolveram abrir uma pizzaria, hoje somos a maior pizzaria do Brasil");
                break;
            }
            case 3: {
                System.out.println("Obrigado por usar nosso sistema");
                break;
            }
        }
    
    }
}
