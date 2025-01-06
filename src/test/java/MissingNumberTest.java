import java.util.ArrayList;
import java.util.List;

public class MissingNumberTest {
    public static void main(String[] args) {
        int[] array = {2, 5, 10, 11, 1};
        System.out.println(missingNumber(array));
    }

    public static List<Integer> missingNumber(int[] array) {
        List<Integer> missingNumber1 = new ArrayList<>();
        int min = array[0];
        int max = array[0];
        for (int num : array) {
            if (num < min) {
                min = num;

            }
            if (num > max) {
                max = num;
            }
        }
        for(int i=min; i <=max; i++){
            boolean found = false;
            for(int num : array){
                if(i == num){
                    found = true;
                    break;
                }
            }
            if(!found){
                missingNumber1.add(i);
            }
        }
        return missingNumber1;
    }

}
