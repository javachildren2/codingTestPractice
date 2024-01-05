package lv2;

import java.util.Scanner;

public class lv2_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalCnt= sc.nextInt();
        int num= sc.nextInt();

        int[] arr=new int[totalCnt];

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]<num){
        System.out.print(arr[i]+" ");

            }
        }



    }


}
