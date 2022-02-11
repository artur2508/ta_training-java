package fundamental.main_task;

import java.util.Random;
import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        System.out.println("Write count!");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int counter = Integer.parseInt(str);

        Random rnum = new Random();
        int[] randomArr = new int[counter];

        for (int i = 0; i < randomArr.length; i++) {
            randomArr[i] = rnum.nextInt(0, 100);
        }
        for (int i = 0; i < randomArr.length; i++) {
            System.out.print(randomArr[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < randomArr.length; i++) {
            System.out.println(randomArr[i]);
        }
    }
}
