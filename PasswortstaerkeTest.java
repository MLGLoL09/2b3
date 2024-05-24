import javax.swing.JOptionPane;
/**
 * Ueberprueft wie lang das Passwort ist, wie woerter es hat, wie lang es ist und wie stark es ist
 * @author Sebastian Weigl
 * @version 05-20-2024
 */
public class PasswortstaerkeTest {
    /**
     * Nimmt das Passwort auf und gibt dann aus, wie stark es ist
     */
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
