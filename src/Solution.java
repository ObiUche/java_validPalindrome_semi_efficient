public class Solution {

    public static boolean isPalindrome(String s) {
        // first i am going to remove the spaces
        // slightly more efficent but reassigning strings is the same as creating another string
        s = s.replaceAll(" ", "").toLowerCase();
        // Now remove punctuation
        s = s.replaceAll("\\p{Punct}", "");
        char[] array = s.toCharArray();

        // Set the pointers to beginning and end of array
        int Left = 0, Right = array.length - 1;
        boolean matched = false;

        while (Left < Right) {

            if (array[Left] == array[Right]) {
                matched = true;
                Left++;
                Right--;
            } else {
                matched = false;
                break;
            }

        }

        return matched;

    }


    public static void main(String[] args) {
        String S = "tab a cat";
        System.out.println(isPalindrome(S));

    }
}
