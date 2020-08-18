package shapes;

//public class Rectangle {
//    protected int length;
//    protected int width;
//
//    public Rectangle(int length, int width){
//        this.length = length;
//        this.width = width;
//    }
//
//    public int getArea(){
//        return length * width;
//    }
//    public int getPerimeter(){
//        return 2*(length + width);
//    }
//
//}
public class Rectangle extends Quadrilateral implements Measurable{
//    protected double length;
//    protected double width;

    public Rectangle(double length, double width) {
        super(length, width);
//        this.length = length;
//        this.width = width;
    }

    @Override
    public void setLength() {

    }

    @Override
    public void setWidth() {

    }

    @Override
    public double getPerimeter() {
        return 2*(length + width);
    }

    @Override
    public double getArea() {
        return length * width;
    }
}