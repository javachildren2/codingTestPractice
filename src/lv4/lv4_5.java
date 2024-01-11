package lv4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class lv4_5 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int a= sc.nextInt();
        int b = sc.nextInt();

        int[][] matrix=new int[a*2][b];
        int[][] sum = new int[a][b];

        for(int i=0;i<a*2;i++){
            for(int j=0;j<b;j++){
                matrix[i][j] = sc.nextInt();
            }
        }



        for(int x=0;x<b;x++){
           for(int y=0;y<b;y++){
               sum[x][y]=matrix[x][y]+matrix[x+b][y];
           }
       }
        for(int x=0;x<b;x++){
            for(int y=0;y<b;y++){
                System.out.print(sum[x][y]+" ");
            }
            System.out.println();
        }

    }
}
