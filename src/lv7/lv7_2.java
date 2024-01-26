package lv7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class lv7_2 {
    //13241 최소공배수2
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        long a = Long.parseLong(st.nextToken());
        long temp ;
        long b=  Long.parseLong(st.nextToken());
        long mul=1;
        if(a>b) {
            temp = b;
            b = a;
            a = temp;
        }
        for (long j = 2; j <= b; j++) {


            if (a % j == 0 && b % j == 0) {
                mul = mul * j;
                a = a / j;
                b = b / j;
                j=1;
            }

        }if(mul!=1){
            System.out.print(mul*a*b);
        }else if(mul==1){
            System.out.print(a*b);
        }
    }
}


