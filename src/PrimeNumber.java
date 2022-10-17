public class PrimeNumber

{

    /** Returns true if num is a prime number and false otherwise */

    private static boolean isPrimeNumber(int num) {
        for (int i = 2; i<(int)(Math.sqrt(num)+1); i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }



    /** Returns the proportion of numbers between start and end, inclusive, that are

     *   prime, as described in part (a)

     *  Precondition: 1 < start <= end <= Integer.MAX_VALUE

     */

    public static double propOfPrimes(int start, int end) {
        start=4;
        end=12;


    }


    {  /* to be implemented in part (a) */  }



// There may be variables and methods that are not shown.

}