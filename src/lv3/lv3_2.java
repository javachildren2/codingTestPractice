package lv3;

import java.util.Scanner;

public class lv3_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String s = sc.next();
        int sum = 0;
        for(int i = 0;i< s.length();i++){
            sum=sum+(s.charAt(i)-48);
        }
        System.out.println(sum);
    }
}
