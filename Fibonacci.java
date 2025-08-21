public class Fibonacci {

    /**
     * Returns the nth term in the Fibonacci sequence using recursion.
     *
     * @param n the index of the term to calculate (must be >= 0)
     * @return the nth Fibonacci number
     */
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int n = 10;
        int result = fibonacci(n);
        System.out.println("The " + n + "th term of the Fibonacci sequence is " + result + ".");
    }
}

