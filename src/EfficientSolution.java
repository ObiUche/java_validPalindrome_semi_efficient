public class EfficientSolution {
    static boolean isPalindrome(String s){
        // one pointer at the beginning one pointer at the end
        int Left = 0, Right = s.length() -1;

        while(Left < Right){

            // move the Left pointer if the current char is not letter or digit
            while(Left < Right && !Character.isLetterOrDigit(s.charAt(Left))){
                Left++;
            }

            // Decrement if the char at right pointer is not letter or digit
            while(Left < Right && !Character.isLetterOrDigit(s.charAt(Right))){
                Right--;
            }

            // If the letters dont match LowerCase return false aswell
            if(Character.toLowerCase(s.charAt(Left)) !=  Character.toLowerCase(s.charAt(Right))){
                return false;
            }

            Left++;
            Right--;
        }
        return true;

    }


    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }
}
