import java.util.Scanner;

class App {
    public static void main(String[] args) {
        //! devo chiedere all'utente una stringa
        //! devo dire all'utente se la stringa inserita è palindroma
        //* 1. generare una stringa inversa
        //* controllare se combaciano
        String a = "";
        String b = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserisci la parola: ");
        a = sc.nextLine();
        int len = a.length();
        for(int i = len -1; i >= 0; i--){
            b = b + a.charAt(i);
        }
        if(a.equalsIgnoreCase(b)){
            System.out.println("La stringa è palindroma");
        } else {
            System.out.println("La stringa NON è palindroma");
        }

    }
}