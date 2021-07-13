package JavaMap;
import java.util.*;

public class Solution {
    // timeout error in last case
    public static void main(String ...args) {
        Scanner in = new Scanner(System.in);
        Map<String, Integer> map = new HashMap<>();
        int n = in.nextInt();
        in.nextLine();
        for(int i = 0; i < n; i++) {
            String name = in.nextLine();
            int phone = in.nextInt();
            in.nextLine();
            map.put(name, phone);
        }
        while(in.hasNext()) {
            String s = in.nextLine();
            try {
                int value = map.get(s);
                System.out.println(s + "=" + value);
            } catch (Exception e) {
                System.out.println("Not found");
            }
        }
    }
}
