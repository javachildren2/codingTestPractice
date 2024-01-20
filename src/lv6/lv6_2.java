package lv6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;
import java.io.IOException;

public class lv6_2 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[][] arr = new int[N][2];

        StringTokenizer st;
        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr, (e1, e2) -> {              //  Arrays.sort(arr, new Comparator<int[]>() {
            if(e1[0] == e2[0]) {                    //	@Override
                return e1[1] - e2[1];               //      public int compare(int[] e1, int[] e2) {
            } else {                                //          if(e1[0] == e2[0]) {
                return e1[0] - e2[0];               //              return e1[1] - e2[1];
            }                                       //      }else{
        });                                         //          return e1[0] -e2[1];
                                                    //      }
                                                    //  }
                                                    //});
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i< N ; i++) {
            sb.append(arr[i][0] + " " + arr[i][1]).append('\n');
        }
        System.out.println(sb);
    }
}


//int c = sum(a, b);
//public int sum(int a, int b) {
//	return a + b;
//}
//
//// 람다식 표현
//int c = (int a, int b) -> {return a + b;}

// 기존 방식
//    List<String> myList = Arrays.asList("apple", "banana", "orange");
//      myList.forEach(new Consumer<String>() {
//          @Override
//          public void accept(String s) {
//          System.out.println(s);
//          }
//        });

// 람다 표현식
//        List<String> myList = Arrays.asList("apple", "banana", "orange");
//        myList.forEach(s -> System.out.println(s));

//  기존 방식
//    Runnable myRunnable = new Runnable() {
//        @Override
//        public void run() {
//            System.out.println("New thread is running!");
//        }
//    };
//    Thread myThread = new Thread(myRunnable);
//myThread.start();

// 람다 표현식으로 변경된 코드
//Runnable myRunnable = () -> System.out.println("New thread is running!");
//Thread myThread = new Thread(myRunnable);
//myThread.start();

//기존 방식
//String[] myArray = {"apple", "banana", "orange", "kiwi"};
//Arrays.sort(myArray, new Comparator<String>() {
//    @Override
//    public int compare(String s1, String s2) {
//        return s1.compareTo(s2);
//    }
//});

//람다 표현식
//String[] myArray = {"apple", "banana", "orange", "kiwi"};
//Arrays.sort(myArray, (s1, s2) -> s1.compareTo(s2));

//기존 표현방식
//List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//    List<Integer> evenNumbers = new ArrayList<>();
//for (Integer number : numbers) {
//        if (number % 2 == 0) {
//        evenNumbers.add(number);
//        }
//        }

//람다 표현식
//List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//List<Integer> evenNumbers = numbers.stream()
//                                    .filter(number -> number % 2 == 0)
//                                    .collect(Collectors.toList());

//정렬 시작:
//
//먼저, compare 메서드에 따라 첫 번째 열 값으로 정렬이 시작됩니다.
//
//비교: {3, 4}와 {1, 1} - 첫 번째 열 값으로 비교. (3과 1 비교)
//결과: {1, 1}, {3, 4}
//다음으로, {1, 1}와 {1, -1}를 비교합니다.
//
//비교: {1, 1}와 {1, -1} - 첫 번째 열 값으로 비교. (1과 1 비교)
//결과: {1, -1}, {1, 1}, {3, 4}
//이제 {1, -1}와 {2, 2}를 비교합니다.
//
//비교: {1, -1}와 {2, 2} - 첫 번째 열 값으로 비교. (1과 2 비교)
//결과: {1, -1}, {2, 2}, {1, 1}, {3, 4}
//마지막으로, {2, 2}와 {3, 3}를 비교합니다.
//
//비교: {2, 2}와 {3, 3} - 첫 번째 열 값으로 비교. (2와 3 비교)
//결과: {1, -1}, {2, 2}, {3, 3}, {1, 1}, {3, 4}