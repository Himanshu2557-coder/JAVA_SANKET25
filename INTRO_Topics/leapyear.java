public class leapyear {
    public static void main(String[] args) {
        int year = 2020;
        boolean isleapyear;
        // a year is a leap year if it is divisible by 4,
        // but not divisible by 100, unless it is also divisible by 400.
        
        if (year %4 ==0){
            System.out.println(""+ year + "is a leap year");}
        else{
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    isleapyear = true;
                    System.out.println(year + " is a leap year");
                } else {
                    isleapyear = false;
                    System.out.println(year + " is not a leap year");
                }
            } else {
                isleapyear = true;
                System.out.println(year + " is a leap year");
        }
        }
    }
}
