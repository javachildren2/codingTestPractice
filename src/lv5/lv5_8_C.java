package lv5;

import java.util.Scanner;

public class lv5_8_C {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        int num = 666;
        int count = 1;

        while(count != N) {
            num++;
            System.out.println(num);
            if(String.valueOf(num).contains("666")) {
                count++;
            }
        }
        System.out.println(num);
    }
}