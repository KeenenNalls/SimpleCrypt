import static java.lang.Character.isLowerCase;
import static java.lang.Character.isUpperCase;
import static java.lang.Character.toLowerCase;

public class ROT13  {

    ROT13(Character cs, Character cf) {
    }

    ROT13() {
    }


    public String crypt(String text) throws UnsupportedOperationException {
        StringBuilder cryptedString = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);

            if (c == ' ') {
                cryptedString.append(' ');
            } else if (c >= 'a' && c <= 'z') {
                if (c > 'm') c -= 13;
                else c += 13;
                cryptedString.append(c);
            } else if (c >= 'A' && c <= 'Z') {
                if (c > 'M') c -= 13;
                else c += 13;
                cryptedString.append(c);
            } else {
                cryptedString.append(c);
            }
        }

        return cryptedString.toString();
    }




    public String encrypt(String text) {
        return crypt(text);
    }







    public String decrypt(String text) {
        return crypt(text);
    }

    public static String rotate(String s, Character c) {
        int diff = c-'A';
        String s1 = s.substring(diff)+s.substring(0,diff);

        return s1;
    }

}
