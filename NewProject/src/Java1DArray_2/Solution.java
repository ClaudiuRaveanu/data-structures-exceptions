package Java1DArray_2;
import java.util.*;

public class Solution {
    // 5/10 failed cases
    public static boolean canWin(int leap, int[] game) {
        int aux = 0, i = 0, j = -1;

        if (i + leap >= game.length || i + 1 == game.length)
            return true;

        while (i + leap < game.length && i + 1 < game.length) {
            if (game[i + leap] == 0) { j = i; i += leap; }
            else if (game[i + 1] == 0 && aux == 0) i++;
            else if (i > 0 && game[i - 1] == 0 && i - 1 != j) { i--; aux = 1; }
            else break;

            if (i + leap >= game.length || i + 1 == game.length) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}
