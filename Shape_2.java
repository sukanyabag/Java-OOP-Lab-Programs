public abstract class Shape_2 {
    public abstract double rectangleArea(double length, double bredth);
    public abstract double circleArea(double radius);
    public abstract double squareArea(double side);
}

class Area extends Shape_2{

    @Override
    public double rectangleArea(double length, double bredth) {
        return length * bredth;
    }

    @Override
    public double circleArea(double radius) {
        return (Math.PI * Math.pow(radius, 2));
    }

    @Override
    public double squareArea(double side) {
        return side * side;
    }
    
    public static void main(String[] args) {
        Area obj = new Area();
        
        System.out.println("Area of rectangle: " + obj.rectangleArea(4, 3));
        System.out.println("Area of square: " + obj.squareArea(5));
        System.out.println("Area of circle: " + obj.circleArea(7));
    }
}
