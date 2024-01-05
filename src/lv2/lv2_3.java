package lv2;

import java.util.Arrays;
import java.util.Scanner;

public class lv2_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalCnt = sc.nextInt();
        int[] arr = new int[totalCnt];

        int max=0;
        int min=0;
        for(int i=0;i<totalCnt;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);

        min=arr[0];
        max=arr[totalCnt-1];

        System.out.println(min+" "+max);
    }
}