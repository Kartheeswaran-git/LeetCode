// Last updated: 26/03/2026, 16:19:33
class Solution {
    public int reversePairs(int[] nums) {
        Set<Long> set = new HashSet<>();

        for (int num : nums) {
            set.add((long) num);
            set.add(2L * num);
        }

        List<Long> list = new ArrayList<>(set);
        Collections.sort(list);

        Map<Long, Integer> map = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            map.put(list.get(i), i + 1);
        }

        Fenwick tree = new Fenwick(list.size());

        int count = 0;

        for (int i = nums.length - 1; i >= 0; i--) {

            int index = map.get((long) nums[i]);
            count += tree.query(index - 1);

            int updateIndex = map.get(2L * nums[i]);
            tree.update(updateIndex, 1);
        }

        return count;
    }
}

class Fenwick {

    int[] tree;
    int n;

    Fenwick(int n) {
        this.n = n;
        tree = new int[n + 1];
    }

    void update(int i, int val) {
        while (i <= n) {
            tree[i] += val;
            i += i & (-i);
        }
    }

    int query(int i) {
        int sum = 0;
        while (i > 0) {
            sum += tree[i];
            i -= i & (-i);
        }
        return sum;
    }
}