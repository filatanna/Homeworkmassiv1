import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задача 1.");
        int[] weigts = new int[3];
        weigts[0] = 1;
        weigts[1] = 2;
        weigts[2] = 3;
        double[] drobi = {1.57, 7.654, 9.986};
        System.out.println(drobi[0]);
        System.out.println(drobi[1]);
        System.out.println(drobi[2]);
        int numbers[] = new int[5];
        numbers[0] = 5;
        numbers[1] = 15;
        numbers[2] = 30;
        numbers[3] = 45;
        numbers[4] = 60;
    }

    public static void task2() {
        System.out.println("Задача 2.");
        int[] weigts = new int[3];
        weigts[0] = 1;
        weigts[1] = 2;
        weigts[2] = 3;
        System.out.print(weigts[0] + ", " + weigts[1] + ", " + weigts[2]);
        System.out.println();
        double[] drobi = {1.57, 7.654, 9.986};
        System.out.print(drobi[0] + ", " + drobi[1] + ", " + drobi[2]);
        System.out.println();
        int numbers[] = new int[5];
        numbers[0] = 5;
        numbers[1] = 15;
        numbers[2] = 30;
        numbers[3] = 45;
        numbers[4] = 60;
        for (int i = 0; i < 4; i++) {
            System.out.print(numbers[i] + ", ");
        }
        System.out.print(numbers[4]);
        System.out.println();
    }

    public static void task3() {
        System.out.println(" Задача 3.");
        int[] weigts = new int[3];
        weigts[0] = 1;
        weigts[1] = 2;
        weigts[2] = 3;
        System.out.print(weigts[2] + ", " + weigts[1] + ", " + weigts[0]);
        System.out.println();
        double[] drobi = {1.57, 7.654, 9.986};
        System.out.print(drobi[2] + ", " + drobi[1] + ", " + drobi[0]);
        System.out.println();
        int numbers[] = new int[5];
        numbers[0] = 5;
        numbers[1] = 15;
        numbers[2] = 30;
        numbers[3] = 45;
        numbers[4] = 60;
        for (int i = 4; i >= 1; i--) {
            System.out.print(numbers[i] + ", ");
        }
        System.out.print(numbers[0]);
        System.out.println();
    }

    public static void task4() {
        System.out.println("Задача 4.");
        int[] weigts = new int[3];
        weigts[0] = 1;
        weigts[1] = 2;
        weigts[2] = 3;
        for (int i = 0; i < weigts.length; i++) {
            if (weigts[i] % 2 != 0) {
             weigts[i] = weigts[i] + 1;
            }}
            System.out.println(Arrays.toString(weigts));
        }
    }
