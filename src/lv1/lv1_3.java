package lv1;

import java.util.Scanner;

public class lv1_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total=sc.nextInt();
        int count = sc.nextInt();

        for(int i=1;i<=count;i++){
            int price =sc.nextInt();
            int num= sc.nextInt();

            total=total-(price*num);

        }
        System.out.println(total==0?"Yes":"No");

    }
}
