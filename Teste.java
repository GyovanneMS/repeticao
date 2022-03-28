class Teste {
    public static void main(String args[]) {

        int n = 1;

        for(int i=20; i <= 50; i=i+1 ){
            if(i == 50){
                System.out.print("31°" + i + ".");
            }
            else{
            System.out.print( n++ + "°" + i + ", ");
            }

        }
    }
}

