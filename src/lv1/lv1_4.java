package lv1;

import java.util.Scanner;

public class lv1_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num= sc.nextInt();
        String s = "";

        for(int i=1;i<=num/4;i++){
           s+="long ";
        }
        s+="int";
        System.out.println(s);
    }
}
