import static es1.Es1.annoBisestile;
import static es1.Es1.stringaPariDispari;

public class Main { // La classe 'Main' contiene il programma principale

    public static void main(String[] args) { // Metodo main: punto di partenza del programma

        // Test del metodo 'stringaPariDispari'
        String testStringa = "Emiliano"; // Stringa di test
        // Verifica se la lunghezza della stringa è pari o dispari
        if (stringaPariDispari(testStringa)) { // Se il metodo restituisce true (lunghezza pari)
            System.out.println("La lunghezza della stringa " + testStringa + " è pari"); // Stampa il risultato
        } else { // Se il metodo restituisce false (lunghezza dispari)
            System.out.println("La lunghezza della stringa " + testStringa + " è dispari"); // Stampa il risultato
        }

        // Test del metodo 'annoBisestile'
        int anno = 2016; // Anno di test
        // Verifica se l'anno è bisestile
        if (annoBisestile(anno)) { // Se il metodo restituisce true (anno bisestile)
            System.out.println("L'anno " + anno + " è bisestile"); // Stampa il risultato
        } else { // Se il metodo restituisce false (anno non bisestile)
            System.out.println("L'anno " + anno + " non è bisestile"); // Stampa il risultato
        }
    }
}
