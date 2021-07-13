package JavaArraylist;
import java.util.*;
import java.io.*;

public class Solution {
    public static void main(String ...args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<Integer> integers = new ArrayList<Integer>();
        List<List<Integer>> a = new ArrayList<>();

        int d;
        for (int i = 0; i < n; i++) {
            d = sc.nextInt();
            integers = new ArrayList<Integer>();
            for (int j = 0; j < d; j++)
                integers.add(sc.nextInt());
            a.add(integers);
        }

        int l = sc.nextInt();
        for (int i = 0; i < l; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            try {
                System.out.println(a.get(x - 1).get(y - 1));
            } catch (Exception e) {
                System.out.println("ERROR!");
            }
        }
    }
}
