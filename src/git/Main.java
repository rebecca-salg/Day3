package git;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello");
        System.out.println(minus(1));
        System.out.println(add(4));
        System.out.println(multiplication(4, 6));

        int count = 1;

        for(int i = 1; i <= 40; i++) {
            System.out.println(i);

            if (i == 3) {
                System.out.println("Quack");
                count = 0;
            }

            count++;
        }

        System.out.println("Goodbye");
    }

    public static int minus(int a) {
        return a--;
    }

    public static int add(int b) {
        return b++;
    }

    public static int multiplication(int c, int d) {
        return c + d;
    }
}
