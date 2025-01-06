import java.util.HashSet;

class Main {
    public static void main(String[] args) {
        int[] arr = {1,4,2,4,2,5,6,7,2,4};
        int n = arr.length;
        HashSet<Integer> uniqList = new HashSet<>();
        for(int num: arr){
            if(uniqList.contains(num)){
                System.out.println("Duplicate Num: " + num);
            }
            uniqList.add(num);
        }
        System.out.println(uniqList);
    }
}