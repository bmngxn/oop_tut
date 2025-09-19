/**
 * Exercise 1.3.1
 * 
 * Takes three integer command-line arguments and prints equal if all 
 * three are equal, and not equal otherwise.
 * 
 * @author bmngxn
 */

 public class AllEqual {

    /**
     * Main method.
     * 
     * @param args CMD line arguments
     */
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        if (a == b && a == c) {
            System.out.println("all equal");
        }
        else {
            System.out.println("not all equal");
        }
    }
}