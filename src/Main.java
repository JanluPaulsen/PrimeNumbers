public class Main {
    public static void main(String[] args) {
        //counter to track the amount of prime numbers found
        int primeNumCounter = 0;
        //for loop to keep going till i = 1000
        for (int i = 0; i <= 1000; i++){
            isPrime(i);
            //call the method
            if (isPrime(i)) {
                primeNumCounter++;
                System.out.println(i + " is a prime number");
                System.out.println(primeNumCounter + " prime numbers found");
                //when the counter reaches 3 break the for loop
                if (primeNumCounter == 3) {
                    break;
                }
            }
        }
    }

    public static boolean isPrime(int wholeNumber) {
        //0 and 1 are not prime number so start at 2
        if (wholeNumber <= 2) {
            return (wholeNumber == 2);
        }
        //if it can divide by 2 and other values other than just itself it is not a prime number
        for (int divider = 2; divider <= wholeNumber / 2; divider++) {
            if (wholeNumber % divider == 0) {
                return false;
            }
        }
        return true;
    }
}