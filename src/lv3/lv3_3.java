package lv3;

import java.util.Scanner;

public class lv3_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        int[] alphabet = new int[26];
        for (int i = 0; i < alphabet.length; i++) {
            alphabet[i] = -1;
        }

        String word = sc.next();
        char[] wordArr = new char[word.length()];
        for (int i = 0; i < word.length(); i++) {
            wordArr[i] = word.charAt(i);
        }
        for (int j = 0; j < word.length(); j++) {
            for (Integer k = 1; k <= 26; k++) {
                if (((int) wordArr[j] - 96 )== k) {
                    if(alphabet[k-1]!=-1){
                        cnt++;
                        break;
                    }
                    alphabet[k-1]=cnt;
                    cnt++;

                    break;
                }

            }
        }
        for (int i = 0; i < alphabet.length; i++) {
            System.out.print(alphabet[i]+" ");
        }
    }
}




