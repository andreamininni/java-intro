import java.util.Scanner;

class App {
    public static void main(String[] args) {
        //! 1. almeno 8 caratteri
        //! 2. almeno uno in uppercase
        //! 3. almeno un numero
        Boolean firstRule = false;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci la tua password");
        String password = scanner.nextLine();
        System.out.println("La pwd inserita è " + password);

        //! controllo 1
        if(password.length() >= 8) firstRule = true;

        if(firstRule && checkIfPWDContainsNumberAndUppercase(password)){
            System.out.println("La pwd è corretta");
        } else {
            System.out.println("La password non è corretta");
        }

        //! controllo2: almeno uno in uppercase
            //! se voglio accedere al singolo carattere tramite indice di una stringa devo utilizzare la funzione charAt
            //! cosa ritorna questa funzione? In base a cosa ritorna devo capire se utilizzare un metodo delle stringhe o un metodo dei char per capire se è in uppercase

            //* devo controllare se esiste almeno un carattere in uppercase all'interno della stringa password
            //* ciclo la stringa password
            //* accedo al singolo carattere
            //* controllo se è in uppercase
            //* se accedo tramite la funzione charAt al singolo carattere, questa funzione ritorna un tipo di dato != String
            //* che non posso effettuare controlli ( non posso usare funzioni ) delle stringhe su quel carattere
            //* come accedo al singolo carattere su cui sto ciclando? password.charAt(i) -> char
        // for (int i = 0; i < password.length(); i++) {
        //     if(Character.isUpperCase(password.charAt(i))) {
        //         secondRule = true;
        //     }
        // }

        // //! controllo 3: almeno un numero
        // for (int i = 0; i < password.length(); i++) {
        //     char currentChar = password.charAt(i);
        //     if(Character.isDigit(currentChar)) thirdRule = true;
        // }

    }

    public static boolean checkIfPWDContainsNumberAndUppercase(String pwd){
        boolean secondRule = false;
        boolean thirdRule = false;
        for (int i = 0; i < pwd.length(); i++) {
            if(Character.isUpperCase(pwd.charAt(i))) {
                secondRule = true;
            }
            if(Character.isDigit(pwd.charAt(i))) {
                thirdRule = true;
            }
        }
        return secondRule && thirdRule;
    }

}