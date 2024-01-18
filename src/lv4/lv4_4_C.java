package lv4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;


public class lv4_4_C {
    //1157 단어 공부
    public static String wordDistinct(String s) {
        if (s == null || s.isBlank()) {
            return s;
        }
        StringBuilder sb = new StringBuilder();
        Set<Character> set = new HashSet<>();
        for (char c : s.toCharArray()) {            //  for (int i = 0; i < s.length(); i++) {
            if (set.add(c)) {                       //  char c = s.charAt(i);
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static int indexOf(int[] arr, int target) {
        for (int i =0; i <arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        word=word.toLowerCase();
        StringBuilder sb = new StringBuilder(wordDistinct(word));

        int max=0;
        int count=0;
        int[] maxArr = new int[word.length()];
        for(int i=0;i<sb.length();i++){
            int cnt=0;
            for(int j=0;j<word.length();j++){
               if(sb.charAt(i)==word.charAt(j)){
                    cnt++;
                }
                maxArr[i]=cnt;
                if(max<maxArr[i]){
                    max=maxArr[i];
                }

            }
        }for(int i=0;i<sb.length();i++){
            if(max==maxArr[i]) {
                count++;
            }
            }
        if(count==1){
            char upper=(char)(sb.charAt(indexOf(maxArr,max))-32);
            System.out.println(upper);
        }else{
            System.out.println("?");
        }
        }
   }
