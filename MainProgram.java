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
    // Complete Jaden Casing Strings (7 kyu)
    public static String toJadenCase(String phrase) {
        if (phrase == null || phrase == "") return null;
        StringBuilder result = new StringBuilder();
        Character[] chars =
                phrase.chars().mapToObj(c -> (char) c).toArray(Character[]::new);
        for (int i = 0; i < chars.length; i++) {
            // test for beginning char
            if (i == 0) chars[i] = Character.toUpperCase(chars[i]);
            else if (chars[i - 1] == ' ') {
                chars[i] = Character.toUpperCase(chars[i]);
            }
            result.append(chars[i]);
        }
        return result.toString();
    }

    public static String order(String words) {
        if(words.length() == 0) return "";
        String[] wordArray = words.split("\\s+");
        String[] sortedArr = new String[wordArray.length];

        // iterate through every word
        for(int i = 0; i < wordArray.length; i++) {
            for(char character : wordArray[i].toCharArray()) {
                if(Character.isDigit(character))
                    sortedArr[Character.getNumericValue(character) - 1] = wordArray[i];
            }
        }
        return String.join(" ", sortedArr);
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
        System.out.println(order("is2 Thi1s T4est 3a"));
    }
}
