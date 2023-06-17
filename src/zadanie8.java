public class zadanie8 {
    public static void main(String[] args) {
        int n = 1;
       while ( n < 1024) {
           n = n * 2;
           System.out.print(n + " ");
       }

        System.out.println();

       int power = 1;
       int i=0;
       while (i <= 10){
           if (i != 0){
               power = power *2;

           }
           System.out.print(power + " ");
           i++;
       }
    }
}
