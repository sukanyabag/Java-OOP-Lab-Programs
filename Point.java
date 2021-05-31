import java.lang.Math;

public class Point{

    double x;
    double y;

    Point(double x1, double y1){

        x = x1;
        y = y1;

    }

    public static double distance(Point p1, Point p2){

        double dist = Math.sqrt(Math.pow((p1.x - p2.x),2.0) + Math.pow((p1.y-p2.y),2.0));

        return dist;
    }

    public static void main(String[] args) {
        Point p1 = new Point(2.0,1.0);
        Point p2 = new Point(1.0,1.0);
        
        double dist  = distance(p1, p2);

        System.out.print("The distance between points p1 and p2 is : " + dist);


    }


}

