public class Addition {
    static void main(String[] args) {
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        int num3 = Integer.parseInt(args[2]);
        add(num1, num2, num3);

    }
    static void add(int num1, int num2, int num3) {
        System.out.println(num1 + num2 + num3);
    }

}
