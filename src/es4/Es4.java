package Es4; // Definiamo il pacchetto 'Es4' dove inseriamo il codice relativo a questo esercizio

import java.util.Scanner;

public class Es4 { // La classe 'Es4' contiene il programma principale

    public static void main(String[] args) { // Metodo main: punto di partenza del programma
        Scanner scanner = new Scanner(System.in); // Creiamo un oggetto Scanner per leggere l'input dell'utente

        // Chiediamo all'utente di inserire un numero intero
        System.out.print("Inserisci un numero intero: ");
        int numero = scanner.nextInt(); // Leggiamo il numero intero inserito dall'utente

        // Ciclo 'for' per stampare il conto alla rovescia
        // Partiamo dal numero inserito e andiamo fino a 0 (incluso)
        for (int i = numero; i >= 0; i--) { // Iniziamo da 'numero' e decrementiamo 'i' fino a 0
            System.out.println(i); // Stampa il valore corrente di 'i' (conto alla rovescia)
        }

        scanner.close(); // Chiudiamo lo Scanner per liberare le risorse
    }
}
