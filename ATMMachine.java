package ATMMachine;

import java.util.Scanner;

class ATM {
    float Balance;
    int PIN = 5678;

    public

            void

            checkpin()

    {
        System.out.println("Enter your pin: ");
        Scanner sc = new Scanner(System.in);
        int enteredpin = sc.nextInt();
        if (enteredpin == PIN) {
            menu();
        } else {
            System.out.println("Enter a valid pin");
        }
    }

    public

            void

            menu()

    {
        System.out.println("Enter your Choice: ");
        System.out.println("1. CHECK A/C BALANCE");
        System.out.println("2. WITHDRAW MONEY ");
        System.out.println("3. DEPOSITE MONEY ");
        System.out.println("4. EXIT ");

        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();

        if (option == 1) {
            checkBalance();
        } else

        if (option == 2) {
            withdrawMoney();
        } else

        if (option == 3) {
            depositeMoney();
        } else if (option == 4) {
            return;
        } else {
            System.out.println("Enter a valid choice");
        }
    }

    public

            void

            checkBalance()

    {
        System.out.println("Balance: " + Balance);
        menu();
    }

    public

            void

            withdrawMoney()

    {
        System.out.println("Enter Amount to Withdraw: ");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        if (amount > Balance) {
            System.out.println("Insufficient Balance");
        } else {
            Balance = Balance - amount;
            System.out.println("Money Withdrawl Successful");
        }
        menu();
    }

    public

            void depositeMoney() {
        System.out.println("Enter the Amount: ");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        Balance = Balance + amount;
        System.out.println("Money Deposited Successfully");
    }
}

public class ATMMachine {
    public static void main(String[] args) {
        ATM obj = new ATM();
        obj.checkpin();
    }
}
