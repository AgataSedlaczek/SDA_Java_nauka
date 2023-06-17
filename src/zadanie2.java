public class zadanie2 {
    public static void main(String[] args){
        int a = 16;

        if( a % 5 == 0 && a % 3 ==0) {
            System.out.println("Pif Paf");
        } else if(a % 3 == 0) {
            System.out.println("Pif");
        } else if(a % 5 == 0) {
            System.out.println("Paf");
        } else {
            System.out.println("Miss");
        }
    }
}
