package lv2;

import java.util.Scanner;

public class lv2_5 {
    public static void main(String[] args) {
        //21345
        Scanner sc = new Scanner(System.in);

        int total = sc.nextInt();
        int num = sc.nextInt();
        int[] basket=new int[total];
        for(int i =1;i<=total;i++){
            basket[i-1]=i;
        }

        for(int i=0;i<num;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();

            int temp=basket[a-1];
            basket[a-1]=basket[b-1];
            basket[b-1]=temp;

        }
        
        for(int i=0;i<total;i++){
            System.out.print(basket[i]+" ");
        }
    }
}
