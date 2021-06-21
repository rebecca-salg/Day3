package git;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello");
        System.out.println(minus(1));

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
}
