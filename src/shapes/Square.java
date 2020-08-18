package shapes;

public class Square extends Rectangle {
    private int side;

    public Square (int side){
        super(side,side);
        this.side = side;//important
    }

    public int getArea(){
        return this.side * this.side;
    }
    public int getPerimeter(){
        return 4*this.side;
    }



}
