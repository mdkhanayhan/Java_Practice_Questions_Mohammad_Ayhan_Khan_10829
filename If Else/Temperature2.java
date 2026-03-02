import java.util.Scanner;

public class Temperature2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature: ");
        int temp = sc.nextInt();
        if (temp > 25)
            System.out.println("Hot");
        else
            System.out.println("Cool");
    }
    public static void main2(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature: ");
        int temp = sc.nextInt();
        if (temp > 25) System.out.println("Hot");
        else System.out.println("Cool");
    }
    public static void main3(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature: ");
        int temp = sc.nextInt();
        if (temp > 25) System.out.println("Hot");
        else System.out.println("Cool");
    }
}