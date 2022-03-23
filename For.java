


class For{
    public static void main(String args[]){

        int n = 1;

        for(int i=1; i >= 298 ; i=i+3){
            if(i == 298){
                System.out.print("100°" + i + ".");
            }
            else{
            System.out.print( n++ + "°" + i + ", ");
            }
        }
    }
}