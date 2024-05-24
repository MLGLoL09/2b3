/**
 * Ueberprueft wie lang das Passwort ist, wie woerter es hat, wie lang es ist und wie stark es ist
 * @author Sebastian Weigl
 * @version 05-20-2024
 */

public class Passwortstaerke {
    /**
     * ueberpueft wie lang das Passwort ist 
     * @param text uebernimmt das Passwort
     * @return gibt die passwortlaenge zurueck
     */
    public static int zeichenZaehlen(String text) {
        int length = text.length();
        return length;
    }   
    /**
     * ueberfrueft wie viele Sonderzeichen das Passwort hat
     * @param text uebernimmt das Passwort
     * @return gibt zurueck wie viele Sonderzeichen das Passwort hat
     */
    public static int zeichenZaehlenSonderzeichen(String text) {
        char zeichen;
        int character = 0;
        for (int i = 0; i < text.length(); i++) {
            zeichen = text.charAt(i);
            if (!Character.isLetterOrDigit(zeichen)) {
                character++;
            }
        }

        return character;
    }
    /**
     * zaehlt wie  viele woerter das Passwort hat
     * @param text uebernimmt das Passwort
     * @return gibt zurueck wie viele woerter das Passwort hat
     */
    public static int woerterZaehlen(String text) {
        int words = 0;
        boolean isWord = false;
        int endOfLine = text.length() - 1;

        for (int i = 0; i < text.length(); i++) {
            if (Character.isLetterOrDigit(text.charAt(i)) && i != endOfLine) {
                isWord = true;
            } else if (!Character.isLetterOrDigit(text.charAt(i)) && isWord) {
                words++;
                isWord = false;
            } else {
                words++;
            }
        }
        return words;
    }
    /**
     * Rechnet sich die Passwortstaerke aus
     * @param text uebernimmt das Passwort
     * @return gibt die Passwortstaerke zurueck
     */
    public static int passwortstaerke(String text) {
        int length = zeichenZaehlen(text);
        int zeichen = zeichenZaehlenSonderzeichen(text);
        int woerter = woerterZaehlen(text);
        int staerke = length + zeichen + woerter;
        return staerke;
    }
}