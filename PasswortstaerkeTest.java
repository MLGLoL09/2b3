import javax.swing.JOptionPane;

public class PasswortstaerkeTest {
    public static void main(String[] args) {
        String password = JOptionPane.showInputDialog(null, "Geben Sie hier Ihr Passwort ein:");
        int passwordLength = Passwortstaerke.zeichenZaehlen(password);
        int character = Passwortstaerke.zeichenZaehlenSonderzeichen(password);
        int words = Passwortstaerke.woerterZaehlen(password);
        int staerke = Passwortstaerke.passwortstaerke(password);
        JOptionPane.showMessageDialog(null, "Anzahl der Zeichen: " + passwordLength + 
                                                            "\nAnzahl der Sonderzeichen: " + character + 
                                                            "\nAnzahl der Woerter: " + words + 
                                                            "\nPasswortstaerke: " + staerke);
    }
}
