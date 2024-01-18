package lv3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class lv3_5_C {
    //문자열 반복 2675번
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] rnum = new int[num];
        String[] wordArr = new String[num];
        int[] size = new int[num];
        int rsize=0;
        int cnt=0;
        int rcnt=0;
        int rplus=0;
        int wplus=0;
        int[] sizebox = new int[num];
        for (int i = 0; i < num; i++) {

            rnum[i] = sc.nextInt();
            wordArr[i] = sc.next();


            size[i] = rnum[i]* wordArr[i].length();
            if(i==0){
                sizebox[i]=size[i];
            }else{
                sizebox[i]=sizebox[i-1]+size[i];
            }
            rsize=rsize+size[i];

        }
        char[] rword=new char[rsize];
        for(int i=0;i<rsize;i++){
            for(int k=i;;k++){

                rword[k]=wordArr[rplus].charAt(wplus);
                System.out.print(rword[k]);
                cnt++;
                rcnt++;

                if(cnt==rnum[rplus]){
                    wplus++;
                    cnt=0;
                }

                if(rcnt==sizebox[rplus]){
                        System.out.println();
                        i=k;
                        rplus++;
                        wplus=0;

                        break;
                }
            }

        }

    }
}



//public class Main {
//
//    public static void main(String[] args) throws IOException {
//
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder sb = new StringBuilder();
//
//        int T = Integer.parseInt(br.readLine());
//
//        for (int i = 0; i < T; i++) {
//
//            String[] str = br.readLine().split(" ");
//
//            int R = Integer.parseInt(str[0]);
//
//
//            for (byte val : str[1].getBytes()) {            =          for (int i = 0; i < str[1].length(); i++) {
//                for (int j = 0; j < R; j++) {                                  byte val = str[1].charAt(i);
//                    sb.append((char)val);                                         for (int j = 0; j < R; j++) {
//                }                                                                     sb.append((char)val);
//            }                                                                     }
//            sb.append('\n');                                           }
//        }
//        System.out.print(sb);
//    }
//
//}

