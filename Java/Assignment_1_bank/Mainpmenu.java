import java.util.Scanner;

class BankAccount{
    int accountNum;
    String accountName;
    double balance; 
    static int nextAccountNum = 1000;
    
    void deposit(double amount){
        balance += amount;
    }

    boolean withdraw(double amount){
        if(balance >= 0 && balance - amount >= 0){
            balance -= amount;
            return true;
        } else{
            System.out.println("Insufficient funds: " + accountName);
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

    void giveAccountNum(){
        accountNum = nextAccountNum;
        nextAccountNum++;
    }
    
    boolean transfer(BankAccount reciever, double amount){
        if(withdraw(amount)){
            reciever.deposit(amount);
            return true;
        }else{
            return false;
        }

    }
}

public class Mainpmenu {
    
    public static void main(String[] args) {
        BankAccount bankAcc1 = new BankAccount();
        BankAccount bankAcc2 = new BankAccount();
        BankAccount bankAcc3 = new BankAccount();
        bankAcc1.giveAccountNum();
        bankAcc2.giveAccountNum();
        bankAcc3.giveAccountNum();
        bankAcc1.changeUsername("Bob");
        bankAcc2.changeUsername("Jeff");
        bankAcc3.changeUsername("Henk");
        
        BankAccount[] Bankaccs = {bankAcc1, bankAcc2, bankAcc3};

        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("1. Deposit money");
            System.out.println("2. Withdraw money");
            System.out.println("3. Transfer money");
            System.out.println("4. Print account information");
            System.out.println("------------------------------");
            System.out.println("Enter choice:");
            int choice = scanner.nextInt();
            System.out.println("Enter account number:");
            int accNum = scanner.nextInt();

            for(BankAccount acc : Bankaccs){
                if (acc.accountNum == accNum){
                    if(choice == 1 || choice == 2 || choice == 3){
                        System.out.println("Enter Amount: ");
                        double amount = scanner.nextDouble();
                        if(choice == 1){
                            acc.deposit(amount);
                            System.out.println(amount + " deposited to account number: " + accNum);
                        }
                        if(choice == 2){
                            acc.withdraw(amount);
                            System.out.println(amount + " withdrawed from account number: " + accNum);
                        }
                        if(choice == 3){
                            System.out.println("Enter account reciever number:");
                            int accRecieverNum = scanner.nextInt();
                            for(BankAccount accReciever : Bankaccs){
                                if (accReciever.accountNum == accRecieverNum){ 
                                    acc.transfer(accReciever, amount);
                                    System.out.println(amount + " transfered from " + accNum + " to " + accRecieverNum);
                                }
                        }
                        }
                    }
                    if(choice == 4){
                        acc.printAccInfo();
                    }
                }
            }
            
        }
    }
}