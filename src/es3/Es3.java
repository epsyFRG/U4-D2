package Es3; // Definiamo il pacchetto 'Es3' dove inseriamo il codice relativo a questo esercizio

import java.util.Scanner;

public class Es3 { // La classe 'Es3' contiene il programma principale

    public static void main(String[] args) { // Metodo main: punto di partenza del programma
        Scanner scanner = new Scanner(System.in); // Creiamo un oggetto Scanner per leggere l'input dell'utente

        // Ciclo infinito che continua a chiedere l'input finché l'utente non inserisce ":q"
        while (true) { // 'while (true)' significa che il ciclo si ripete all'infinito
            System.out.print("Inserisci una stringa (scrivi :q per uscire): "); // Chiediamo all'utente di inserire una stringa
            String input = scanner.nextLine(); // Leggiamo la stringa inserita dall'utente

            // Se l'utente inserisce ":q", usciamo dal ciclo con 'break'
            if (input.equals(":q")) {
                break; // Esci dal ciclo 'while'
            }

            // Ciclo per stampare ogni carattere della stringa separato da virgola
            for (int i = 0; i < input.length(); i++) { // Scorriamo ogni carattere della stringa
                System.out.print(input.charAt(i)); // Stampiamo il carattere corrente
                // Aggiungiamo una virgola solo se non siamo all'ultimo carattere della stringa
                if (i < input.length() - 1) {
                    System.out.print(", "); // Stampa una virgola dopo ogni carattere (tranne l'ultimo)
                }
            }
            System.out.println(); // Vai a capo dopo aver stampato tutta la stringa
        }

        scanner.close(); // Chiudiamo lo Scanner per liberare le risorse
    }
}
