package shapes;

public class ShapesTest {
    public static void main(String[] args) {
//        Rectangle box1 = new Rectangle(4,5);
//        System.out.println("Perimeter of the box1: " + box1.getPerimeter());
//        System.out.println("Area of the box1: " + box1.getArea());
//
//        Rectangle box2 = new Square(5);
//        System.out.println("Perimeter of the box2: " + box2.getPerimeter());
//        System.out.println("Area of the box2: " + box2.getArea());

//        Square box3 = new Square(5);
//        System.out.println(box3.getPerimeter());
//        System.out.println(box3.getArea());
        Measurable myShape = new Square(5.0 );
        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());

        Measurable myShape1 = new Rectangle(5.0,6.0);
        System.out.println(myShape1.getArea());
        System.out.println(myShape1.getPerimeter());



    }

}
