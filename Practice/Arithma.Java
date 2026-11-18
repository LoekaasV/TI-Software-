class Arithmetic{
    void calc(int a, String b, int c){
        switch(b){
            case("+"):
                System.out.println(String(a + b));
                break;
            case("-"):
                System.out.println(String(a - b));
                break;
            case("*"):
                System.out.println(String(a * b));
                break;
            case("/"):
                System.out.println(String(a / b));
                break;
        }
    }
}


public class Arithma {
    
   public static void main(String[] args){
        Arithmetic.calc(1, "+", 2);
        Arithmetic.calc(4, "-", 3);
        Arithmetic.calc(5, "*", 6);
    }
}