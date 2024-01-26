package lv7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class lv7_1_C {
    //1934 최소공배수
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<N;i++){
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
            int a = Integer.parseInt(st.nextToken());
            int temp ;
            int b=  Integer.parseInt(st.nextToken());
            int mul=1;
            if(a>b) {
                temp = b;
                b = a;
                a = temp;
            }

                for (int j = 2; j <= b; j++) {

                    
                    if (a % j == 0 && b % j == 0) {
                        mul = mul * j;
                        a = a / j;
                        b = b / j;
                        j=1;
                    }

            }
                if(mul!=1){
                    sb.append(mul*a*b+"\n");
                }else{
                    sb.append(a*b+"\n");
                }
        }
        System.out.println(sb);
    }
}


