import java.util.Scanner;

public class ProfitLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter cost price: ");
        int cost = sc.nextInt();
        System.out.print("Enter selling price: ");
        int sell = sc.nextInt();
        if (sell > cost)
            System.out.println("Profit");
        else if (sell < cost)
            System.out.println("Loss");
        else
            System.out.println("No Profit No Loss");
    }
    public static void main2(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter cost price: ");
        int cost = sc.nextInt();
        System.out.print("Enter selling price: ");
        int sell = sc.nextInt();
        if (sell > cost)
            System.out.println("Profit");
        else if (sell < cost) System.out.println("Loss");
        else System.out.println("No Profit No Loss");
    }
    public static void main3(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter cost price: ");
        int cost = sc.nextInt();
        System.out.print("Enter selling price: ");
        int sell = sc.nextInt();
        if (sell > cost) System.out.println("Profit");
        else if (sell < cost) System.out.println("Loss");
        else System.out.println("No Profit No Loss");
    }
}