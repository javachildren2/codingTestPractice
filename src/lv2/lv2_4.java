package lv2;

import java.util.Scanner;

public class lv2_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total = sc.nextInt();
        int num = sc.nextInt();
        int[] basket=new int[total];
        int[] arr=new int[num];

        for (int i=0;i <num;i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

          for(int j=a;j<=b;j++){
              int k=j-1;
              basket[k]=c;

          }

        }
        for(int i=0;i< basket.length;i++){
            System.out.println(basket[i]);
        }
    }
}
