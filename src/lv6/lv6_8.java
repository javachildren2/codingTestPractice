package lv6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class lv6_8 {
        //7785 회사에 있는사람
        public static <K, V> List<K> getKeysByValue(Map<K, V> map, V value) {
            List<K> keys = new ArrayList<>();
            for (Map.Entry<K, V> entry : map.entrySet()) {
                if (entry.getValue().equals(value)) {
                    keys.add(entry.getKey());
                }
            }
            return keys;
        }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        HashMap<String, String> elMap = new HashMap<>();
        for(int i=0;i<N;i++){
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        String name = st.nextToken();
        String situation=st.nextToken();
            elMap.put(name, situation);
        }
        List<String> keys = getKeysByValue(elMap, "enter");
        Collections.sort(keys, Collections.reverseOrder());

        for(String key:keys){
            System.out.println(key);
        }


    }
}
