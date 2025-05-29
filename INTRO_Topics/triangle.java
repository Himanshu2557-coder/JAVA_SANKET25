public class triangle {
    public static void main(String[] args) {
        int a = 3, b = 4, c = 5;
        String triangleType;

        if (a == b && b == c) {
            triangleType = "Equilateral";
        } else if (a == b || b == c || a == c) {
            triangleType = "Isosceles";
        } else {
            triangleType = "Scalene";
        }

        System.out.println("The triangle is: " + triangleType);
    }
}
