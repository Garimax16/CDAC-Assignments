import java.util.Scanner;

public class Quadrants {
    public static String findQuadrant(int x, int y) {
        if (x > 0 && y > 0) return "First Quadrant";
        else if (x < 0 && y > 0) return "Second Quadrant";
        else if (x < 0 && y < 0) return "Third Quadrant";
        else if (x > 0 && y < 0) return "Fourth Quadrant";
        else return "On Axis";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the x coordinate: ");
        int x = sc.nextInt();
        System.out.print("Enter the y coordinate: ");
        int y = sc.nextInt();
        System.out.println("The coordinate lies in: " + findQuadrant(x, y));
    }
}
