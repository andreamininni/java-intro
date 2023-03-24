import java.util.Scanner;

class App {
    public static void main(String[] args) {
        //! chiedere all'utente di inserire un numero
        //! vogliamo ottenere la sommatoria delle cifre che lo compongono
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("inserisci un numero: ");
        int number = Integer.parseInt(scanner.nextLine());
        //! devo accedere ad ogni singola cifra, eliminarla dal numero inserito dall'utente e sommarla a sum
        //! 123 -> estrarre il 3
        while(number != 0){
            int digit = number % 10;
            sum = sum + digit;
            number = number / 10;
        }
        System.err.println("La somma è " + sum);
    }
}