public class LargestNumber {
    public static void main(String[] args){
        int[] array = {1,2,100,5,6,7};
        int largestNum = 0;
        for(int num: array){
            if(num > largestNum){
                largestNum = num;
            }
        }
        System.out.println("Largest number: " + largestNum);
    }
}
