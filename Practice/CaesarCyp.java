import java.util.Scanner;
import java.util.Arrays;
public class CaesarCyp {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter Text: ");
        String textP = input.nextLine();
        Character[] alphabet = {'a','b', 'c', 'd', 'e', 'f', 
                                'g', 'h', 'i', 'j', 'k', 'l', 
                                'm', 'n', 'o', 'p', 'q', 'r', 
                                's', 't', 'u', 'v', 'w', 'x', 
                                'y', 'z'}; 

        Character[] chars = new Character[textP.length()];
        for (int i = 0; i < textP.length(); i++) {
            chars[i] = textP.charAt(i);
        }
        
        System.out.println(Arrays.toString(chars));
        Character[] textAfA = new Character[textP.length()];
        for (int a = 0; a < textP.length(); a++){
            for(int b = 0; b < 25; b++){
                if (alphabet[b] == chars[a]) {
                    // Shift by 3 and use % 26 to wrap around the alphabet safely
                    textAfA[a] = alphabet[(b + 3) % alphabet.length];
                    break; // Exit inner loop once the letter is found
                }
            }
        }

        System.out.println(Arrays.toString(textAfA));
    }
}

