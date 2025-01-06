import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        System.out.println("Are Anagrams: " + areAnagrams(str1, str2));
    }

    public static boolean areAnagrams(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        System.out.println(arr1);
        System.out.println(arr2);
        Arrays.sort(arr1);
        System.out.println(arr1);
        Arrays.sort(arr2);
        System.out.println(arr2);
        return Arrays.equals(arr1, arr2);
    }
}
