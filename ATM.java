package AtmMachine;

import java.util.Scanner;

public class ATM {
    float Balance;
    int Pin=3535;

    public void checkpin(){
        System.out.println("Enter your pin:");
        Scanner sc=new Scanner(System.in);
        int enterpin= sc.nextInt();
        if(enterpin==Pin){
            menu();
        }
        else {
            System.out.println("Enter a valid pin");

        }
    }
    public void menu(){
        System.out.println("Enter your Choice:");
        System.out.println("1. Check A/C Balance");
        System.out.println("2. Withdraw Money:");
        System.out.println("3. Deposit Money");
        System.out.println("4. Exit");
        
        Scanner sc=new Scanner(System.in);
        int opt = sc.nextInt();
        if(opt==1){
            checkBalance();
        } else if (opt==2) {
            withdrawMoney();
            
        } else if (opt==3) {
            depositeMoney();

        } else if (opt==4) {
            return;

        }
        else {
            System.out.println("Enter a valide choice");
        }
    }
    public void checkBalance(){
        System.out.println("Balance" + Balance);
        menu();
    }
    public void withdrawMoney(){
        System.out.println("Enter Amount to withdraw: ");
        Scanner sc= new Scanner(System.in);
        float amount=sc.nextFloat();
        if(amount>Balance){
            System.out.println("Insufficient Balance");
        }
        else {
            Balance = Balance-amount;
            System.out.println("Money withdraw successfully");
            menu();
        }


    }
    public void depositeMoney(){
        System.out.println("Enter the Amount:");
        Scanner sc=new Scanner(System.in);
        float amount= sc.nextFloat();
        Balance = Balance+ amount;
        System.out.println("Money Deposite sucessfully");
        menu();

    }

}
