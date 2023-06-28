package shapes;

public class Square extends Quadrilateral{
    Square(double length) {
        super(length,length);
    }

    @Override
    public double getPerimeter() {
        return 4*length;
    }

    @Override
    public double getArea() {
        return length*length;
    }

    @Override
    public void setLength(double length) {
        this.length= length ;
        width=length;
    }

    @Override
    public void setWidth(double width) {
        this.width= width;
    }
//    double side;
//    public Square(double side) {
//        super(side, side);
//        this.side = side;
//    }
//
//    @Override
//    public double getArea() {
//        return Math.pow(side,2);
//    }
//
//    @Override
//    public double getPerimeter() {
//        return 4*side;
//    }
}
