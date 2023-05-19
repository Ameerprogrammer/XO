//Ameer Ahmed

public class XO {
    public static boolean getXO(String str) {

        //use counters for each character
        int countX = 0;
        int countO = 0;

        for(int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'x' || str.charAt(i) == 'X') {
                countX++;
            }
            else if(str.charAt(i) == 'o' || str.charAt(i) == 'O') {
                countO++;
            }
        }
        //if the x's and o's are the same
        if(countX == countO) {
            return true;
        }
        //not the same amount
        else if(countX != countO) {
            return false;
        }
        //if there's no x's or o's case
        else {
            return true;
        }
    }
    public static void main (String[] args) {
        System.out.println("Output: " + getXO("ooxx"));
        System.out.println("Output: " + getXO("xooxx"));
        System.out.println("Output: " + getXO("ooxXm"));
        System.out.println("Output: " + getXO("zpzpzpp"));
        System.out.println("Output: " + getXO("zzoo"));
    }
}