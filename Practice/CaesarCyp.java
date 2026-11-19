import java.util.Scanner;

class Cypher {
    static Character[] alphabet = {'a','b', 'c', 'd', 'e', 'f', 
                                'g', 'h', 'i', 'j', 'k', 'l', 
                                'm', 'n', 'o', 'p', 'q', 'r', 
                                's', 't', 'u', 'v', 'w', 'x', 
                                'y', 'z'};
    static void encode(){
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter Text: ");
        String textP = input.nextLine();
        

        Character[] chars = new Character[textP.length()];
        for (int i = 0; i < textP.length(); i++) {
            chars[i] = Character.toLowerCase(textP.charAt(i));
        }
        
        Character[] textAfA = new Character[textP.length()];
        for (int a = 0; a < textP.length(); a++){
            for(int b = 0; b < 25; b++){
                if (alphabet[b] == chars[a]) {
                    textAfA[a] = alphabet[(b + 3) % alphabet.length];
                    break; 
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (Character c : textAfA) {
            if (c != null) {
                sb.append(c);
            } else {
                sb.append(' '); 
            }
        }
        
        String textAf = sb.toString();
        System.out.println(textAf);
    }

    static void decode(){
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter Text: ");
        String textP = input.nextLine();
        

        Character[] chars = new Character[textP.length()];
        for (int i = 0; i < textP.length(); i++) {
            chars[i] = Character.toLowerCase(textP.charAt(i));
            
        }
        
        //System.out.println(Arrays.toString(chars));
        Character[] textAfA = new Character[textP.length()];
        for (int a = 0; a < textP.length(); a++){
            for(int b = 0; b < 25; b++){
                if (alphabet[b] == chars[a]) {
                    textAfA[a] = alphabet[(b - 3 + alphabet.length) % alphabet.length];
                    break; 
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (Character c : textAfA) {
            if (c != null) {
                sb.append(c);
            } else {
                sb.append(' '); 
            }
        }
        
        String textAf = sb.toString();
        System.out.println(textAf);
    }

}

public class CaesarCyp {
    
    public static void main(String[] args) {
        boolean running = true;

        Scanner scanner = new Scanner(System.in);

        while(running){
            System.out.println("Do you want to Encode a message or Decode a message?");
            System.out.println("1. Encode");
            System.out.println("2. Decode");
            System.out.println("3. Quit");

            int inputN = scanner.nextInt();

            switch(inputN){
                case 1:
                    Cypher.encode();
                    break;
                case 2:
                    Cypher.decode();
                    break;
                case 3:
                    running = false;
                    break;
                
            }
        }
    }
}

