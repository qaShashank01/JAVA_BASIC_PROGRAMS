public class SwtichCase {
    public static void main(String[] args){
        int dayOfWeek = 3;
        switch (dayOfWeek) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            // ... other cases
            default:
                System.out.println("Invalid day");
        }

    }
}
