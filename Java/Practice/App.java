import java.util.Scanner;
public class App {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String waltuh = "My name is Walter Hartwell White. ";
        String adress = "I live at 308 Negra Arroyo Lane, Albuquerque, New Mexico, 87104. This is my confession.";
        //int times = input.nextInt();
        String name = input.nextLine();
        //System.out.println("FAKKA PINDAAS");
        
        /* if(times =< 10){*/
        /* 
                for (int i = 0; i < times; i++) {
                    System.out.println(waltuh);
                }
                System.out.println(adress);
            /*}*/
            
        if(name.equals(waltuh)){
            System.out.println(adress);
        }

    }
}