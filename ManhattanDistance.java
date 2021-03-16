import java.util.Scanner;

public class ManhattanDistance {

    public static void main(String[] args) {
        //Instantiate scanner object for user input
        Scanner input_scanner = new Scanner(System.in);

        int point_A_x,
            point_A_y,
            point_B_x,
            point_B_y;

        //Get user input for coordinates
        System.out.print("Enter the x coordinate of point A: ");
        point_A_x = input_scanner.nextInt();
        System.out.print("Enter the y coordinate of point A: ");
        point_A_y = input_scanner.nextInt();
        System.out.print("Enter the x coordinate of point B: ");
        point_B_x = input_scanner.nextInt();
        System.out.print("Enter the y coordinate of point B: ");
        point_B_y =input_scanner.nextInt();

        //Instantiate points A and B from input values
        Point point_A = new Point(point_A_x, point_A_y);
        Point point_B = new Point(point_B_x, point_B_y);

        System.out.println("\nThe Manhattan Distance between points A and B is: " + point_A.calculate_distance(point_B));
    }
}
