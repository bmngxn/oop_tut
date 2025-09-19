/**
 * Exercise 1.4.11
 * 
 * Takes a variable number of command-line arguments and prints how many 
 * there are.
 * 
 * @author bmngxn
 */
public class HowMany {

    /**
     * Main method
     * 
     * @param args CMD line arguments.
     */
    public static void main(String[] args) {
        int n = args.length;
        System.out.print("There are " + n + " command-line argument");
        if (n == 1) {
            System.out.println(".");
        }
        else {
              System.out.println("s.");
        }
    }
}