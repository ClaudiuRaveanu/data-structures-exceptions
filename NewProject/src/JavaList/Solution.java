package JavaList;
import java.util.*;
import java.io.*;

public class Solution {

    public static void main(String ...args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<Integer> L = new ArrayList<>();
        for (int i = 0; i < N; i++)
            L.add(sc.nextInt());
        int Q = sc.nextInt();
        for (int i = 0; i < Q; i++) {
            String op = sc.next();
            if (op.equals("Insert")) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                L.add(x, y);
            }
            else if (op.equals("Delete")) {
                int x = sc.nextInt();
                L.remove(x);
            }
        }
        for (int i = 0; i < L.size(); i++)
            System.out.print(L.get(i) + " ");
    }
}
