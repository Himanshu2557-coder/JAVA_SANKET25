public class switchcase {
    public static void main(String[] args) {
        int day = 5;
        String daynameString;
        switch(day) {
            case 5:
                daynameString = "Friday";
                break;
            case 6:
                daynameString = "Saturday";
                break;
            case 7:
                daynameString = "Sunday";
                break;
            default:
                daynameString = "Invalid day";
        }
        System.out.println(daynameString); // <- Add this
    }
}
