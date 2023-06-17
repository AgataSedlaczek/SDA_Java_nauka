import java.security.cert.PolicyNode;

public class zadanie3 {
    public static void main(String[] args){
    double amount = 450.0;
    String currency = "EUR";

    switch (currency){
        case "EUR":
            System.out.println("PLN->EUR: " + amount/4.5);
            break;
        case "USD":
            System.out.println("PLN->USD: " + amount/4.1);
            break;
        case "GBP":
            System.out.println("PLN->GBP: " + amount/5.3);
            break;
        default:
            System.out.println("Nie rozpoznano waluty");
    }
    }
}
