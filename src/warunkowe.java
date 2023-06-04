public class warunkowe{

    public static void main(String[] args){
/*
        int someVar=8;
        if (someVar >= 7){
            System.out.println("Zmienna jest większa od 7");
        }

 */
       /* if (8 >= 7 && 8 <10){
            System.out.println("Zmienna bądź równa 9");}
        if (8>7 || 8<6){
            System.out.println("zmienna jest wieksza od 7 lub mniejsza niz 6");
        }

        int wiek=66;
        if (wiek<18 && wiek>0){
            System.out.println("nieletni");
        }
        if (wiek>=18){
            System.out.println("pełnoletni");
        }
        if (wiek>=65 && wiek<100){
            System.out.println("senior");
        }
        else {
            System.out.println("błędny wiek");
        }
        int wiek2=18;
        if (wiek2 <18 && wiek2> 0) {
            System.out.println("Nieletni");
        }
        else if (wiek2>=18) {
            System.out.println("Pełnoletni");
        }
        else if (wiek2>=65 && wiek2 <100) {
            System.out.println("Senior");
        }
        else {
            System.out.println("błędny wiek");
        }*/

        int day=5;
        switch (day){
            case 0:
                System.out.println("?");
            break;
            case 6:
            case 7:
                System.out.println("weekend");
            break;
            case 5:
                System.out.println("piąteczek");
            default:
                System.out.println("praca");

        }
    }
}
