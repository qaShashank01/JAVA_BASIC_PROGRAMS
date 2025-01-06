public class ReverseString {
    public static void main(String[] args){
        String ab = "Hello";
        StringBuilder reversed = new StringBuilder(ab);
        reversed.reverse();
        System.out.println("Reverse of "+ ab + " is "+reversed);
    }
}
