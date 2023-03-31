import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, Teacher! Please, choose task to check:");
        for(int i = 1; i<=10; i++) System.out.println(i + ") Task " + i);
        Scanner sc = new Scanner(System.in);
        int task = sc.nextInt();
        if (task > 10 && task < 1) {
            System.out.println("Out choose task outside of the range!");
            System.exit(-1);
        }
        switch (task) {
            case 1 -> task1.main();
            case 2 -> task2.main();
            case 3 -> task3.main();
            case 4 -> task4.main();
            case 5 -> task5.main();
            case 6 -> task6.main();
            case 7 -> task7.main();
            case 8 -> task8.main();
            case 9 -> task9.main();
            case 10 -> task10.main();
        }
    }
}
