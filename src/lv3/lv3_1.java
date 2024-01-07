package lv3;

import java.util.Scanner;

public class lv3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        int num = sc.nextInt();
        System.out.println(word.charAt(num-1));
        System.out.println(word.length());


    }
}
