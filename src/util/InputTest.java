package util;

public class InputTest {
    public static void main(String[] args) {
        Input input = new Input();
        System.out.println(input.getString());
        System.out.println(input.yesNo());
        System.out.println(input.getInt());
        System.out.println(input.getInt(3,40));
        System.out.println(input.getDouble());
        System.out.println(input.getDouble(2.5,6.7));

    }
}
