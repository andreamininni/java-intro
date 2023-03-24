import java.util.Scanner;

class App {
    public static void main(String[] args) {
        //! vogliamo chiedere all'utente quanti numeri vuole inserire
        //! dobbiamo chiedere tutti i numeri uno alla volta e metterli in un array
        //! dobbiamo effettuare la sommatoria
        System.out.println("Quanti numeri vuoi inserire ? ");
        Scanner scanner = new Scanner(System.in);
        int len = Integer.parseInt(scanner.nextLine());
        int[] numbers = new int[len];
        int sum = 0;
        for (int i = 0; i < len; i++) {
            System.out.println("Inserisci un numero: ");
            int x = Integer.parseInt(scanner.nextLine());
            numbers[i] = x;
        }

        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }

        System.out.println("La sommatoria dei numeri che hai inserito è " + sum);
    }
}