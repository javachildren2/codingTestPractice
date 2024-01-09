package lv3;

import java.util.Scanner;

public class lv3_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] rnum = new int[num];
        String[] wordArr = new String[num];
        int[] size = new int[num];
        int rsize=0;
        int cnt=0;
        int mplus=0;
        int rplus=0;
        int wplus=0;
        for (int i = 0; i < num; i++) {

            rnum[i] = sc.nextInt();
            wordArr[i] = sc.next();


            size[i] = rnum[i]* wordArr[i].length();

            rsize=rsize+size[i];

        }
        char[] rword=new char[rsize];


        for(int i=0;i<rsize;i++){
            for(int k=i;;k++){

                rword[k]=wordArr[rplus].charAt(wplus);
                System.out.print(k+"="+rword[k]);
                cnt++;

                if(cnt==rnum[rplus]){
                    wplus++;
                    cnt=0;
                }

                if(k==size[rplus]-1){
                        System.out.println();
                        i=k;
                        rplus++;
                        wplus=0;
                        size[rplus]=size[rplus]+(k+1);
                        System.out.println("i="+i);
                    System.out.println(size[rplus]);


                        break;
                }
            }

        }

    }
}


