public class checkPrimeNumber {
    // method to check for a prime number here
    public static void checkPrime(int n ) {
        int i, m = 0, flag = 0;
        m = n / 2;


        if (n == 0 || n == 1) {
            System.out.println(n +  "  is not a prime number");
        } else {
            for (i = 2; i < 100; i++) {
                if (n % i == 0) {
                    System.out.println(n +  " is not prime number");
                    flag = 1;
                    break;
                }
            }

            if (flag == 0) {
                System.out.println(n + "is a prime number");
            }
        }
    }

    // main method
        public static void main(String args[]){

        // calling the checkprime method here with various different integers values
            checkPrime(1);
            checkPrime(2);
            checkPrime(3);
            checkPrime(4);
            checkPrime(5);
            checkPrime(6);
            checkPrime(7);
            checkPrime(11);
            checkPrime(13);
            checkPrime(17);
            checkPrime(19);
            checkPrime(29);
            checkPrime(53);
            checkPrime(59);
            checkPrime(97);
            checkPrime(83);
            checkPrime(71);


        }
    }

