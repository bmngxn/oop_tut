/**
 *  Exercise 1.4.12
 * 
 *  Takes a variable number of integer command-line arguments and prints the 
 *  integer i with probability proportional to the ith command-line argument.
 * 
 * @author bmngxn
 */


 public class DiscreteDistribution {
    public static void main(String[] args) {
        int n = args.length;
        int[] freq = new int[n];
        int totalFreq = 0;

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(args[i]);
            freq[i] = num;
            totalFreq += freq[i];
        }


        /**
         * generate a random double int (0.0, 1.0) and multiple it with the 
         * totalFreq scalar -> ~ U(0, totalFreq) aka a random number from
         * 0 to total.
         */
        int randInt = (int) (Math.random() * totalFreq);

        /**
         * find the bucket which the randInt above belongs to.
         */
        int sum = 0;
        int index = -1;
        for (int i = 0; i < n; i++) {
            sum += freq[i];
            if (sum > randInt) {
                index = i;
                break;
            }
        }
        System.out.println(index);
    }
 }