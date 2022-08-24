public class MainProgram { 

    public static void main(String[] args) {
      
    }
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
}
