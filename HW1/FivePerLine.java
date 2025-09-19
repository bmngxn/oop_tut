/**
 * Exercise 1.3.9
 * 
 * Prints the integers from 1000 to 2000 with five integers per line.
 * 
 * @author bmngxn
 */

public class FivePerLine {
    public static void main(String[] args) {
        int start = 1000;
        int end   = 2000;
        int intPerLine = 5;
        for (int i = start; i <= end; i++) {
            System.out.print(i + " ");
            if ((i + 1) % intPerLine == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }
}