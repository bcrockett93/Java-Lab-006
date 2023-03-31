import java.util.Scanner;

/**
 * This class is designed to test whether the first integer is divisible by the second integer.
 * @author Brandin Crockett
 */
public class Lab006 {
    private int n;
    private int m;

    /**
     * Constructor for the Lab006 class.
     *
     * @param n the first integer
     * @param m the second integer
     */
    public Lab006(int n, int m) {
        this.n = n;
        this.m = m;
    }

    /**
     * Checks if n is evenly divisible by m.
     *
     * @return true if n is evenly divisible by m, false otherwise
     */
    public boolean isDivisible() {
        return n % m == 0;
    }

    /**
     * Main method for the Lab006 class.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two integers: ");
        int userInput1 = scanner.nextInt();
        int userInput2 = scanner.nextInt();

        Lab006 lab = new Lab006(userInput1, userInput2);
        boolean isDivisibleResult = lab.isDivisible();
        System.out.println("The result of the divisibility test: " + isDivisibleResult);
    }
}