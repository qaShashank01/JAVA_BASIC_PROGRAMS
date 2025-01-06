public class PalindromeCheck {
    public static void main(String[] args){
        String str = "radar";
        int start = 0;
        int end = str.length() -1;
        System.out.println("Length: "+end);
        boolean value = false;
        while (start < end){
            if(str.charAt(start) == str.charAt(end)){
                value = true;
            }
            start ++;
            end --;
        }
        System.out.println("is Palindrome: " + value);
    }
}
