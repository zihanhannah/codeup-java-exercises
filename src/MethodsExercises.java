public class MethodsExercises {
    public static void main(String[] args) {
//        Addition(2,3);
//        Subtraction(2,3);
//        Multiplication(2,3);
//        Division(2,3);
//        Modulus(2,3);
    }

    public static void Addition(int a , int b){
//        System.out.println(a+b);

    }
    public static void Subtraction(int a , int b){
        System.out.println(a-b);
    }
    public static void Multiplication(int a , int b){
//        System.out.println(a * b);
        int c = 0;
        for (int i = 0 ; i < b; i++){
            c += a ;
        }
        System.out.println(c);
    }
    public static void Division(int a , int b){
        System.out.println(a/b);
    }
    public static void Modulus(int a , int b){
        System.out.println(a % b);
    }
}
