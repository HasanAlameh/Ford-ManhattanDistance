//Point Coordinates Class
import java.lang.Math;

public class Point {
    int x_coordinate;
    int y_coordinate;

    //Set x and y coordinates
    public  Point(int x, int y){
        x_coordinate = x;
        y_coordinate = y;
    }

    //Calculate the Manhattan Distance between this point and another
    public int calculate_distance(Point other_point){

        //Manhattan Distance = sum of the absolute values of vertical/horizontal distances
        int horizontal_distance = Math.abs(this.x_coordinate - other_point.x_coordinate);
        int vertical_distance = Math.abs(this.y_coordinate - other_point.y_coordinate);

        return horizontal_distance + vertical_distance;
    }
}
