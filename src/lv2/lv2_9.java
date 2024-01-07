package lv2;

import java.util.Arrays;
import java.util.Scanner;

public class lv2_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int[] arr = new int[num];
        int sum=0;
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
            sum+=arr[i];
        }
        Arrays.sort(arr);
        System.out.println((sum/(double)num)/arr[num-1]*100);
    }
}
