public class prime {
    public static void main(String[] args) {
        int n = 17;
        boolean isPrime = true;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime && n > 1)
            System.out.println("Prime");
        else
            System.out.println("Not Prime");
    }
}
class prime2 {
    public static void main(String[] args) {
        int n = 17;
        boolean isPrime = true;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime && n > 1)
            System.out.println("Prime");
        else
            System.out.println("Not Prime");
    }
}
class prime3 {
    public static void main(String[] args) {
        int n = 17;
        boolean isPrime = true;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime && n > 1)
            System.out.println("Prime");
        else
            System.out.println("Not Prime");
    }
}
