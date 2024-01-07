package lv2;

import java.util.Scanner;

public class lv2_8 {
    public static void main(String[] args) {
//        1 2 3 4 5
//        2 1 3 4 5
//        2 1 4 3 5
//        3 4 1 2 5
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int cnt= sc.nextInt();
        int[] basket = new int[num];
        for(int i =0;i<num;i++){
            basket[i]=i+1;
        }
        for(int i=0;i<cnt;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();

            double x = a;
            double y = b;
            double cntcnt=Math.ceil((y-x)/2);
            int cnt2=(int)cntcnt;
            System.out.println("cnt2 = " + cnt2);

            for(int j=0;j<cnt2;j++) {
                int tem = basket[a-1];
                basket[a-1] = basket[b-1];
                basket[b-1] = tem;
                System.out.println("tem = " + tem);
                System.out.println("basket["+(a-1)+"]= " + basket[a-1]);
                System.out.println("basket["+(b-1)+"]= " + basket[b-1]);
                a++;
                b--;
            }
        }
        for(int i=0;i<basket.length;i++){
            System.out.print(basket[i]+" ");
        }

    }

}

