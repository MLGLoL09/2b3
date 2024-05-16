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
        char zeichen;
        int words = 0;
        for (int i = 0; i < text.length(); i++) {
            zeichen = text.charAt(i);
            if (!Character.isLetterOrDigit(zeichen)) {
                words++;
            }
        }
        return words;
    }
}
/*
    public static int passwortstaerke(String text) {
        return;
    }
}*/