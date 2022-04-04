 import java.util.Scanner;

class WhileIfFor {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        while (true){
            System.out.println("Escolha um número.");
            int n = ler.nextInt();
            long fat = n;
            if( n >= 0 ){
                if(n == 0){
                    System.out.println("0! = 1.");
                }
                else{
                    for(int i=n-1; i>=1; i--){
                    fat = fat * i;
                    }
                System.out.println(n + "! = " + fat + ".");
                }
                //break; --> quebra do while
                System.out.println("Quer continuar?(Y/N) ");
                char l = ' ';
                if(l == Y){
                    
                }
                break;
            }
            System.out.println("Número negativo, por favor repita.");  
        }
    } //String ente haspas/haspas duplas "l"
} // variavel char --> char letra = 's'[lembre dos os apóstrofos/haspas simples !!!!]