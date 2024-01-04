package lv1;

import java.util.Scanner;

public class lv1_4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int number = scan.nextInt();
        String str = "";

        for(int i=1; i<=number/4; i++) {
            str += "long ";
        }
        System.out.println(str + "int");

    }
}
