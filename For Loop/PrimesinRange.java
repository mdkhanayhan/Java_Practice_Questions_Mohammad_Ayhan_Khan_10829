public class PrimesinRange {
    public static void main(String[] args) {
        int start = 10, end = 30;
        for (int n = start; n <= end; n++) {
            boolean isPrime = true;
            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime && n > 1)
                System.out.print(n + " ");
        }
    }
}
class PrimesinRange2 {
    public static void main(String[] args) {
        int start = 10, end = 30;
        for (int n = start; n <= end; n++) {
            boolean isPrime = true;
            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime && n > 1)
                System.out.print(n + " ");
        }
    }
}
class PrimesinRange3 {
    public static void main(String[] args) {
        int start = 10, end = 30;
        for (int n = start; n <= end; n++) {
            boolean isPrime = true;
            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime && n > 1)
                System.out.print(n + " ");
        }
    }
}
