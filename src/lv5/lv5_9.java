package lv5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class lv5_9 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer sc = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(sc.nextToken());

        int a=N%3==0?N/3:-9999;
        int b=N%5==0?N/5:-9999;
        int c=0;
        int d=0;
        int min=0;
        if(N%3!=0){
            System.out.println("1."+((N%3)/5));
            if((N%3)%5==0){
                c=a+((N%3)/5);
            }else{
                c=-9999;
            }
        }else{
            c=a;
        }
        if(N%5!=0){
            System.out.println("2."+((N%5)/3==0));
            if((N%5)%3==0){
                d=b+((N%5)/3);
            }else {
                d = -9999;
            }
        }else{
            d=b;
        }

        int[] arr = new int[4];
        arr[0]=a;
        arr[1]=b;
        arr[2]=c;
        arr[3]=d;

        for(int i =0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i]==-9999){

                }
            }
        }




    }
}
