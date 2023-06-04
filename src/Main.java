public class Main {
    public static void main(String[] args){

        System.out.println("Hello World ");  //sout skrót do wypisywania informacji
        int age = 20; //int liczby całkowite
        int age2 = 10;
        int result = age+age2; //suma zmiennych, odejmowanie, dzielnie itd tak samo, wszelkie działania mat.
        boolean check = true; //przyjmuje tylko true or false
        double tmp = 5.5; //liczby z przecinkami, przecinki piszemy kropką
        tmp = 6.7;
        final double PI = 3.14; //final mówi, że zmiennej nie można zmienić
        int c = 5; int d = 3; double e = 6; //można deklarowac kilka zmiennych w jednej linijce


        System.out.println("mój wiek to "+PI+" ok?"); //zmienne piszemy bez "" - tak jak age w przykładzie

        int a=2; int b=3; int wynik;
        /*
        b--;//dekrementacja czyli odejmuje zawsze 1
        System.out.println(b);
        b++;//inkrementacje czyli oddaje zawsze 1
        System.out.println(b);
        //Wyrażenie modulo %
        wynik=b%a;
        System.out.println(wynik);
        */
        /*
        boolean res=a==b;// jest równe
        boolean res2=a!=b;//nie jest równe
        boolean res3=a>b;// jest większe
        boolean res4 =a<b;//jest mniejsze
        boolean res5=a>=b;// jest większe lub równe
        System.out.println(res3);
        */
        /*
        boolean flag=(a!=b) && (a>0)&& (a>1); //true
        boolean flag2=(a==b) || (b==3) ||(a<10);// true
        boolean res=!flag2;// negacja
        System.out.println(res);
        */
        a+=2;// prosty zapis a=a+2;
        a-=2;//prosty zapis a=a-2;
        a*=2;// prosty zapis a=a*2;
        System.out.println(a);

        int a1=5; int b2=3; int wynik1;
        wynik=(b2>a1) ? b2:a1; // przypisz większą liczbę
        System.out.println(wynik);

        String myVar="Mama i Tata";
        String myVar2="Mama i Tata";
        System.out.println(myVar.toUpperCase()); //wszystkie litery na duże
        System.out.println(myVar.toLowerCase()); //wszystkie litery na małe
        System.out.println(myVar.equals(myVar2));//sprawdza czy oba ciągi_znaków są takie same
        System.out.println(myVar=myVar+myVar2); //dodanie do siebie napisów
        System.out.println(myVar.concat(myVar2)); //dodanie do siebie napisów
        System.out.println(myVar.isEmpty());      // czy jest puste true or false
        System.out.println(myVar.length());       // ilość znaków w ciągu


        System.out.print("Tekst"+"\n"); // "\n" działa jako polecienie przejścia do nowej lini
        System.out.println("Dodatni");
        System.out.printf("My cat, %s, is %d years old.%n", "Filemon", 8); //podmienia litery z znakiem % np: %s na wartość która jest na końcu lini i ma odpowiedni typ



    }
}