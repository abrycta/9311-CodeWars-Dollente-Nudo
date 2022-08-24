import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainProgram {

    /**
     * Checks if inputted integer is a square.
     * @param n integer to check if is perfect square.
     * @return returns true if integer is perfect square otherwise falls.
     */
    public static boolean isSquare(int n) {
        int temp = 0;
        if (n == 2){
            return true;
        } else if (!(n < 0)){
            temp = (int) Math.sqrt(n);
        }
        return ((temp * temp) == n);
    }
    // Complete Ones and Zeros (7 kyu)
    public static int convertBinaryArrayToInt(List<Integer> binary) {
        int[] binaryEquivalent = {1, 2, 4, 8, 16, 32, 64, 128};
        int returnVal = 0;
        int binaryIndex = 0;
        // 1 2 4 8 16 32 64 128 256
        for (int i = binary.size(); i-- > 0; ) {
            if (binary.get(i) == 1) returnVal += binaryEquivalent[binaryIndex];
            binaryIndex++;
        }
        return returnVal;
    }

    public static void main(String[] args) {
        System.out.println(convertBinaryArrayToInt(new ArrayList<>(Arrays.asList(0, 0, 0, 1))));
    }
}
