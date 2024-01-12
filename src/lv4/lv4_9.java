package lv4;

import java.util.Scanner;

public class lv4_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int two = 2;

        int a = sc.nextInt();
        for(int i=0;i<a;i++){
            two=two+(two-1);
        }
        System.out.println((int)Math.pow(two,2));
    }
}
