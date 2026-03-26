// Last updated: 26/03/2026, 16:18:18
import java.util.*;

class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {

        Arrays.sort(deck);

        int n = deck.length;
        int[] result = new int[n];
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            q.offer(i);
        }

        for (int card : deck) {
            int idx = q.poll();
            result[idx] = card;

            if (!q.isEmpty()) {
                q.offer(q.poll());
            }
        }

        return result;
    }
}
