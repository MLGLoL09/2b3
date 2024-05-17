public class Passwortstaerke {
    public static int zeichenZaehlen(String text) {
        int length = text.length();
        return length;
    }

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
            } else if (Character.isLetterOrDigit(text.charAt(i)) && i == endOfLine) {
                words++;
            }
        }
        return words;
    }

    public static int passwortstaerke(String text) {
        int length = zeichenZaehlen(text);
        int zeichen = zeichenZaehlenSonderzeichen(text);
        int woerter = woerterZaehlen(text);
        return length + zeichen + woerter;
    }
}