public class Metodos {
    public static void main(String[] args) {
     msg("Ola", 1);
     System.out.println(soma2(5, 2));
     System.out.println(soma(5,2.8 ,5,20,2));

    }

    public static void msg(String m, int loop){
        for(int i = 0; i < loop; i++){
            System.out.println(m);
        }
    }
    public static int soma(int... num){//soma quantos numeros for necessario
        int res = 0;
        for(int n: num){
            res += n;
        }
        return res;
    }
    public static double soma(double... num){//sobregarca de metodos 
            double res = 0;
            for(double n: num){
                res += n;
            }
            return res;
        }

    public static int soma2(int a, int b){
       int res = a + b;
        return res;
    }
}
