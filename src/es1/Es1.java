package es1; // Definiamo il pacchetto 'es1' dove inseriamo il codice

// La classe Es1 contiene due metodi, uno per verificare la parità della lunghezza di una stringa
// e l'altro per verificare se un anno è bisestile.
public class Es1 {

    // Metodo stringaPariDispari:
    // Questo metodo prende una stringa 's' e restituisce 'true' se la sua lunghezza è pari,
    // e 'false' se è dispari.
    public static boolean stringaPariDispari(String s) {
        // 's.length()' restituisce la lunghezza della stringa.
        // L'operatore '&' (AND bitwise) con 2 determina se il numero è pari o dispari:
        // - se il numero è pari, 's.length() & 2' restituisce 0 (perché l'ultimo bit è 0).
        // - se il numero è dispari, 's.length() & 2' restituisce 2 (perché l'ultimo bit è 1).
        return (s.length() & 2) == 0; // Se il risultato è 0, significa che la lunghezza è pari
    }

    // Metodo annoBisestile:
    // Questo metodo prende un intero 'anno' e restituisce 'true' se l'anno è bisestile,
    // e 'false' altrimenti.
    public static boolean annoBisestile(int anno) {
        // Primo controllo: l'anno deve essere divisibile per 4
        if (anno % 4 != 0) {
            return false; // Se non è divisibile per 4, non è bisestile
        } else if (anno % 100 != 0) {
            // Secondo controllo: se l'anno non è divisibile per 100, è comunque bisestile
            return true;
        } else {
            // Terzo controllo: se è divisibile per 100, deve anche essere divisibile per 400
            return anno % 400 == 0; // Se divisibile per 400, è bisestile
        }
    }
}


