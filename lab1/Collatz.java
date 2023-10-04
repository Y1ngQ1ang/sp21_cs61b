/**
 * Class that prints the Collatz sequence starting from a given number.
 *
 * @author YOUR NAME HERE
 */
public class Collatz {

    /**
     * Buggy implementation of nextNumber!
     */
    public static int nextNumber(int n) {
        if (n % 2 == 0) {
            return n / 2;
        }
        return 3 * n + 1;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.print(n + " ");
        while (nextNumber(n) != 1) {
            System.out.print(nextNumber(n) + " ");
            n = nextNumber(n);
        }
        System.out.print(1 + " ");
    }
}

