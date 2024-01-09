package lv3;

import java.util.Scanner;

public class lv3_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int cnt =0;
        String word="";
        char[] wordArr = new char[0];
        int plus=0;
        for(int i=0;i<num;i++) {
            cnt = sc.nextInt();
            word = sc.next();
            plus=0;

            wordArr = new char[cnt*word.length()];

            for(int j=0;j<word.length();j++){
                for(int k=j*2+plus;k<cnt*(j+1);k++){       // 0 3 5  , 3  6  9

                    wordArr[k]=word.charAt(j);
                    System.out.print(wordArr[k]);

                }plus=plus+(cnt-2);



           }
        }



    }
}
