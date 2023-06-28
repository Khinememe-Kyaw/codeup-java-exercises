package shapes;

public class Rectangle extends Quadrilateral implements Measurable{
    Rectangle(double length, double width) {
        super(length, width);
    }

    @Override
    public double getPerimeter() {
        return 2* width + 2*length;
    }

    @Override
    public double getArea() {
        return width *length;
    }

    @Override
    public void setLength(double length) {
         this.length=length;
    }

    @Override
    public void setWidth(double width) {
        this.width=width;
    }
//    protected double width;
//    protected double length;
//    public Rectangle(double width, double length){
//        this.width =width;
//        this.length=length;
//    }
//    public double getArea(){
//        return length*width;
//    }
//    public double getPerimeter(){
//        return 2*length + 2*width;
//    }

}
