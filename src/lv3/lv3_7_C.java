package lv3;

import java.util.Scanner;

public class lv3_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String number = sc.nextLine();
        StringBuilder sb = new StringBuilder(number);
        sb.reverse();

        int cnt =0;
        for(int i=0;i<number.length();i++){
            if(number.charAt(i)==' '){
                break;
            }
            cnt++;
        }
        String numb1=sb.substring(0,cnt);
        String numb2=sb.substring(cnt+1,number.length());
        System.out.println(Integer.parseInt(numb1)>Integer.parseInt(numb2)?numb1:numb2);

    }
}
