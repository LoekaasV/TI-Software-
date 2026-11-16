class BankAccount{
    int accountNum;
    String accountName;
    double balance; 
    
    void deposit(double amount){
        balance += amount;
    }

    boolean intake(double amount){
        if(balance >= 0 && balance - amount >= 0){
            balance -= amount;
            return true;
        } else{
            System.out.println("Insufficient funds");
            return false;
        }
    }

    void printAccInfo(){
        System.out.println(accountNum);
        System.out.println(accountName);
        System.out.println(balance);
    }

    void changeUsername(String name){
        accountName = name;
    }
}

public class Main {
    
    public static void main(String[] args) {
        BankAccount bankAcc1 = new BankAccount();
        BankAccount bankAcc2 = new BankAccount();
        BankAccount bankAcc3 = new BankAccount();
        bankAcc1.printAccInfo();
        bankAcc2.printAccInfo();
        bankAcc3.printAccInfo();
        bankAcc1.changeUsername("Bob");
        bankAcc2.changeUsername("Jeff");
        bankAcc3.changeUsername("Bartholomew III");
        bankAcc1.deposit(1.50);
        bankAcc2.deposit(150);
        bankAcc3.deposit(1500);
        bankAcc1.intake(10);
        bankAcc2.intake(20);
        bankAcc3.intake(30);
        bankAcc1.printAccInfo();
        bankAcc2.printAccInfo();
        bankAcc3.printAccInfo();
    }
}