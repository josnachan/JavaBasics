public class ArithmeticOperations {
    public static void main(String[] args) {
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        add(num1, num2);
        sub(num1, num2);
        mul(num1, num2);
        div(num1, num2);
    }

    public static void add(int num1, int num2) {
        int sum = num1 + num2;
        System.out.println("sum = " + sum);
    }
    public static void sub(int num1, int num2) {
        int sub = num1 - num2;
        System.out.println("sub = " + sub);
    }
    public static void mul(int num1, int num2) {
        int mul = num1 * num2;
        System.out.println("mul = " + mul);
    }
    public static void div(int num1, int num2) {
        int div = num1 / num2;
        System.out.println("div  = " + div);
    }
}
