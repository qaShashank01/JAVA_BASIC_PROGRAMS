import java.util.ArrayList;
import java.util.List;

public class MissingNumbers {
    public static void main(String[] arg){
        int[] array = {1,2,5,7,10};
       System.out.println("Missing numbers: " + findMissingNumber(array));
     }
     public static List<Integer> findMissingNumber(int[] array){
         List<Integer> missingNumber = new ArrayList<>();
         int min = array[0];
         int max = array[0];
         for (int num: array){
             if(num < min){
                 min = num;
             }
             if(num > max){
                 max = num;
             }
         }
         for(int i=min; i<=max; i++){
             boolean found = false;
             for (int num: array){
                 if(i == num){
                     found =true;
                     break;
                 }
             }
             if(found == false){
                 missingNumber.add(i);
             }
         }
         return missingNumber;
     }
}
