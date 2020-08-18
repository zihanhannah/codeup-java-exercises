package shapes;
//
//public class Square extends Rectangle {
//    private int side;
//
//    public Square (int side){
//        super(side,side);
//        this.side = side;//important
//    }
//
//    public int getArea(){
//        return this.side * this.side;
//    }
//    public int getPerimeter(){
//        return 4*this.side;
//    }
//
//
//
//}
public class Square extends Quadrilateral {
//    protected double side;
    public Square(double side) {
        super(side, side);
//        this.side = side;
    }


    @Override
    public void setLength() {

    }

    @Override
    public void setWidth() {

    }

    @Override
    public double getPerimeter() {
        return length*4;
    }

    @Override
    public double getArea() {
        return length*length;
    }
}