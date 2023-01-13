public class Main {
    public static void main(String[] args) {
        int primeNumCounter = 0;
        for (int i = 0; i <= 1000; i++){
            isPrime(i);
            if (isPrime(i)) {
                primeNumCounter++;
                System.out.println(i + " is a prime number");
                System.out.println(primeNumCounter + " prime numbers found");
                if (primeNumCounter == 3) {
                    break;
                }
            }
        }
    }

    public static boolean isPrime(int wholeNumber) {
        if (wholeNumber <= 2) {
            return (wholeNumber == 2);
        }
        for (int divider = 2; divider <= wholeNumber / 2; divider++) {
            if (wholeNumber % divider == 0) {
                return false;
            }
        }
        return true;
    }
}