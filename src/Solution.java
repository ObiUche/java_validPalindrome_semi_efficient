public class Solution {

    public static boolean isPalindrome(String s){
        String trimedString = s.replace(" ", "").toLowerCase();
        String finalString = trimedString.replaceAll("\\p{Punct}", "");
        char[] array = finalString.toCharArray();
        boolean matched = false;
        // Two Pointers
        int Left = 0, Right = array.length -1;

        while(Left < Right){

            // if both chars match continue
            if(array[Left] == array[Right]){
                matched = true;
                Left ++;
                Right --;
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
