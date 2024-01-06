package lv2;

import java.util.Scanner;

public class lv2_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr=new int[30];
        int[] pass=new int[30];

        for(int i=1;i<=arr.length;i++){
            arr[i-1]=i-1;
        }
        for(int i=0;i<pass.length-2;i++){
            int num=sc.nextInt();
            for(int j=0;j< arr.length;j++){
                if(arr[j]==num-1){
                    pass[num-1]=9999;
                    break;
                }
            }
        }
        for(int i=0;i<pass.length;i++){
            if(pass[i]!=9999){
                System.out.println(i+1);
            }
        }

    }
}
