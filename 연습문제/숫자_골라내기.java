import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for (int t = 1; t <= T; t++) {
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            HashSet<Integer> set = new HashSet<>();
            HashMap<Integer, Integer> map = new HashMap<>();

            for (int i = 0; i < n; i++) {
                int num = Integer.parseInt(st.nextToken());
                set.add(num);
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
            Iterator itr = set.iterator();
            int result = 0;
            while (itr.hasNext()) {
                int num = (int)itr.next();
                if (map.get(num) % 2 != 0) {
                    result ^= num;
                }
            }
            sb.append("Case #" + t + "\n").append(result).append("\n");
        }
        System.out.println(sb);
    }
}
