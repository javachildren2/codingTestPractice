package lv5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class lv5_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x=0;
        for(;;){
        StringTokenizer st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            if(a==-1){
                break;
            }
            int sum=0;
            StringBuilder sb = new StringBuilder();
            for(int i=1;i<=a;i++) {
                if (i == a) {
                    break;
                }

                if (a % i == 0) {
                    if (i == 1) {
                        sb.append(a + " = " + i);
                        sum = sum + i;
                    } else {
                        sb.append(" + " + i);
                        sum = sum + i;
                        x++;
                    }
                }
            }
            System.out.println(sum);
            if(sum==a) {
                System.out.println(sb);

                }else{
                System.out.println(a+" is NOT perfect");
            }

            }
        }
    }

