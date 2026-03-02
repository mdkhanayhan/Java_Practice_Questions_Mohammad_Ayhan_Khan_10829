import java.util.Scanner;

public class ATM {
    public static void main1(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter balance: ");
        double balance = sc.nextDouble();
        System.out.print("Enter withdrawal amount: ");
        double amount = sc.nextDouble();
        if (amount <= balance)
            System.out.println("Transaction Successful");
        else
            System.out.println("Insufficient Balance");
    }
    public static void main2(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter balance: ");
        double balance = sc.nextDouble();
        System.out.print("Enter withdrawal amount: ");
        double amount = sc.nextDouble();
        if (amount <= balance)
            System.out.println("Transaction Successful");
        else
            System.out.println("Insufficient Balance");
    }
    public static void main3(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter balance: ");
        double balance = sc.nextDouble();
        System.out.print("Enter withdrawal amount: ");
        double amount = sc.nextDouble();
        if (amount <= balance)
            System.out.println("Transaction Successful");
        else
            System.out.println("Insufficient Balance");
    }
}
