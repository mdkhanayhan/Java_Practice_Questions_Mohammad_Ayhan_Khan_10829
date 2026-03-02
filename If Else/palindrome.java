import java.util.Scanner;
public class palindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int rev=0, temp=n;
        while(n>0){
            int digit = n%10;
            rev = rev*10 + digit;
            n/=10;
    }
        if(temp==rev){
            System.out.println("Palindrome");
        }
        else System.out.println("Not palindrome");
    }
    public static void main2(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int rev=0, temp=n;
        while(n>0){
            int digit = n%10;
            rev = rev*10 + digit;
            n/=10;
    }
        if(temp==rev) System.out.println("Palindrome");
        else System.out.println("Not palindrome");
    }
    public static void main3(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int rev=0, temp=n;
        while(n>0){
            int digit = n%10;
            rev = rev*10 + digit;
            n/=10;
    }
        if(temp==rev) System.out.println("Palindrome");
        else System.out.println("Not palindrome");
    }
}
