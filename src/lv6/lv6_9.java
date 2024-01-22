package lv6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class lv6_9 {
    //1620 나는야 포켓몬 마스터
    private static Object getIntegerOrString(BufferedReader reader) throws IOException {
        String input = reader.readLine().trim();

        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            return input;
        }
    }
    public static <K, V> K getFirstKeyByValue(Map<K, ? extends V> map, V value) {
        for (Map.Entry<K, ? extends V> entry : map.entrySet()) {
            if (entry.getValue().equals(value)) {
                return entry.getKey();
            }
        }
        return null; // 해당 값에 대한 키를 찾지 못한 경우
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int pDic = Integer.parseInt(st.nextToken());
        int Q = Integer.parseInt(st.nextToken());

        HashMap<Integer, String> pMap = new HashMap<>();

        for (int i = 0; i < pDic; i++) {
            pMap.put(i, br.readLine());
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < Q; i++){
            Object s = getIntegerOrString(br);
            if(pMap.containsKey(s)){
                sb.append(pMap.get(s)+"\n");
            }else{
                Integer x = getFirstKeyByValue(pMap, s) + 1;
                sb.append(x+"\n");
            }
        }
            System.out.print(sb);
    }
}


//public class lv6_9 {
//    //1620 나는야 포켓몬 마스터
//    private static Object getIntegerOrString(BufferedReader reader) throws IOException {
//        String input = reader.readLine().trim();
//
//        try {
//            return Integer.parseInt(input);
//        } catch (NumberFormatException e) {
//            return input;
//        }
//    }
//
//
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//
//        int pDic = Integer.parseInt(st.nextToken());
//        int Q = Integer.parseInt(st.nextToken());
//
//        HashMap<String, Integer> pMap = new HashMap<>();
//        HashMap<Integer, String> reversePMap = new HashMap<>();
//
//        for (int i = 0; i < pDic; i++) {
//            String name = br.readLine();
//            pMap.put(name, i + 1);
//            reversePMap.put(i + 1, name);
//        }
//
//        StringBuilder sb = new StringBuilder();
//
//        for (int i = 0; i < Q; i++) {
//            Object s = getIntegerOrString(br);
//
//            if (s instanceof Integer) {
//                sb.append(reversePMap.get(s) + "\n");
//            } else {
//                sb.append(pMap.get(s) + "\n");
//            }
//        }
//
//        System.out.print(sb);
//    }
//}
