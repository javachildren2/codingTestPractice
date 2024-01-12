package lv4;

import java.util.Scanner;

public class lv4_6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = {25,10,5,1};
        int[] money = new int[num];
        int[][] cArr =new int[num][4];
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<num;i++){
            money[i]= sc.nextInt();
        }
        for(int i=0;i<num;i++){
            for(int j=0;j<4;j++){

            cArr[i][j] = (int)Math.floor(money[i] / arr[j]);
            money[i]=money[i]%arr[j];

            sb.append(cArr[i][j]+" ");
            }
            sb.append("\n");
        }
        System.out.println(sb);

        }

    }


