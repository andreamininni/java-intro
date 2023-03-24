import java.util.Scanner;

class App {
    public static void main(String[] args) {
        //! un numero è automorfo se le cifre finali del suo quadrato sono uguali al numero stesso
        //! 76 => 76 * 76 = 5776
        System.out.println("Inserisci un numero e ti dirò se è automorfo");
        Scanner sc = new Scanner(System.in);
        int number = Integer.parseInt(sc.nextLine());
        //* calcolo il quadrato */
        int squared = number * number;
        System.out.println(squared);
        //! 5776 => 76
        int numLength = String.valueOf(number).length();
        //! voglio prendere una sottostringa che va dall'ultimo carattere, quindi dal 6, fino alla lunghezza del numero inserito all'inizio, 76
        // String lastNNumbers = String.valueOf(squared).substring(String.valueOf(squared).length() - numLength, String.valueOf(squared).length());

        // System.out.println("Le ultime cifre del numero elevato al quadrato sono " + lastNNumbers);
        // if(lastNNumbers.equals(String.valueOf(number))){
        //     System.out.println("Il numero " + number + " è automorfo");
        // } else {
        //     System.out.println("Il numero " + number + " NON è automorfo");
        // }
        // if(Integer.parseInt(lastNNumbers) == number){
        //     System.out.println("Il numero " + number + " è automorfo");
        // } else {
        //     System.out.println("Il numero " + number + " NON è automorfo");
        // }
        if(String.valueOf(squared).endsWith(String.valueOf(number))){
            System.out.println("Il numero " + number + " è automorfo");
        } else {
            System.out.println("Il numero " + number + " NON è automorfo");
        }

    }
}