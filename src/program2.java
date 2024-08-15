// N number of input is given .We have to convert each number into binary and convert all 0's to 1 , 1's to 2. find the count of magical number>
// maginal number is represented by adding each binary converted digit and if the sum is odd , then increment the count and return it.
import java.util.*;

class program2 {
    public static void main(String[] args) {
        int[] ar = new int[]{1, 2, 3, 4, 5};  // Input array
        int n = ar.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            int b = ar[i];
            String binaryString = Integer.toBinaryString(b);  // Convert to binary string
            int sum = 0;

            // Convert 0's to 1's and 1's to 2's, then calculate the sum
            for (char c : binaryString.toCharArray()) {
                if (c == '0') {
                    sum += 1;  // Replace '0' with 1
                } else if (c == '1') {
                    sum += 2;  // Replace '1' with 2
                }
            }

            // Check if the sum is odd
            if (sum % 2 != 0) {
                count++;
            }
        }

        System.out.println("Count of magical numbers: " + count);
    }
}
