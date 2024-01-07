package lv2;

import java.util.Arrays;
import java.util.Scanner;

public class lv2_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr=  new int[10];
        int[] distinctArr=new int[0];
        for(int i=0;i<10;i++){
            arr[i]=sc.nextInt()%42;
           distinctArr= Arrays.stream(arr).distinct().toArray();

            }
        System.out.println(distinctArr.length);
        }
}

