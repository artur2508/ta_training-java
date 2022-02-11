package fundamental.main_task;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {

        String[] monthArr = new String[]{"Jan", "Feb", "March", "april" ,"May", "june", "july", "august", "sept", "oct", "nov","Dec"};
        for (int i=0;i<monthArr.length;i++){
            System.out.println(monthArr[i]);
        }
        System.out.println("Write index of month");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int index = Integer.parseInt(str);
        if (index>1&&index<13) {
            System.out.println(index + " month is: " + monthArr[index - 1]);
        }else {
            System.out.println("The number will be beetwen 1-12");
        }
    }

}
