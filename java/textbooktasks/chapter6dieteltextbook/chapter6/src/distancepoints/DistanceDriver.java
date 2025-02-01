package distancepoints;

import java.util.Scanner;

public class DistanceDriver {
    public static DistanceBetweenPointsExercise6_32 distance;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        distance = new DistanceBetweenPointsExercise6_32();

        distance.getPointsDisplay('X', 1);
        int x_1 = distance.validateIntInput(input);
        distance.setPointX_1(x_1);

        distance.getPointsDisplay('Y', 1);
        int y_1 = distance.validateIntInput(input);
        distance.setPointY_1(y_1);

        distance.getPointsDisplay('X', 2);
        int x_2 = distance.validateIntInput(input);
        distance.setPointX_2(x_2);

        distance.getPointsDisplay('Y', 2);
        int y_2 = distance.validateIntInput(input);
        distance.setPointY_2(y_2);

        getParallelOrPerpendicularComparison();
    }

    public static void getParallelOrPerpendicularComparison(){
        if(distance.getPointY_1() == distance.getPointY_2()) System.out.println("The points are on a line parallel to the X-axis and perpendicular to the Y-axis.");
        else if(distance.getPointX_1() == distance.getPointX_2()) System.out.println("The points are on a line parallel to the Y-axis and perpendicular to the X-axis.");
        else System.out.println("The line is not parallel or perpendicular to any axis.");
    }
}
