package Es2; // Definiamo il pacchetto 'Es2' dove inseriamo il codice relativo a questo esercizio

import java.util.Scanner;

public class Es2 { // La classe 'Es2' contiene il programma principale

    public static void main(String[] args) { // Metodo main: punto di partenza del programma
        Scanner scanner = new Scanner(System.in); // Creiamo un oggetto Scanner per leggere l'input dell'utente

        System.out.print("Inserisci un numero intero da 0 a 3: "); // Chiediamo all'utente di inserire un numero
        int numero = scanner.nextInt(); // Leggiamo il numero inserito e lo salviamo nella variabile 'numero'

        // Usiamo un'istruzione 'switch' per verificare il valore di 'numero' e stampare il risultato corrispondente
        switch (numero) {
            case 0: // Se il numero è 0
                System.out.println("Zero"); // Stampiamo "Zero"
                break; // Uscita dal 'switch'
            case 1: // Se il numero è 1
                System.out.println("Uno"); // Stampiamo "Uno"
                break; // Uscita dal 'switch'
            case 2: // Se il numero è 2
                System.out.println("Due"); // Stampiamo "Due"
                break; // Uscita dal 'switch'
            case 3: // Se il numero è 3
                System.out.println("Tre"); // Stampiamo "Tre"
                break; // Uscita dal 'switch'
            default: // Se il numero non è 0, 1, 2 o 3
                System.out.println("Errore: puoi inserire solo numeri da 0 a 3"); // Stampa un messaggio di errore
        }

        scanner.close(); // Chiudiamo lo Scanner per liberare risorse
    }
}
