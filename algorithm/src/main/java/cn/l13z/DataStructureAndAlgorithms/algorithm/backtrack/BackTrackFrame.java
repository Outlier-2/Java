package cn.l13z.DataStructureAndAlgorithms.algorithm.backtrack;

import java.util.LinkedList;
import java.util.List;;

// 以全排列作为框架
public class BackTrackFrame<T> {
    List<List<Integer>> res = new LinkedList<>();

    List<List<Integer>> permute(int[] nums) {
        // 记录路径
        LinkedList<Integer> track = new LinkedList();

        // 标记路径中的元素
        boolean[] used = new boolean[nums.length];

        // 回溯
        backtrack(nums, track, used);
        return res;
    }

    void backtrack(int[] nums, LinkedList<Integer> track, boolean[] used) {
        if (track.size() == nums.length) {
            res.add(new LinkedList(track));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (used[i]) {
                continue;
            }

            track.add(nums[i]);
            used[i] = true;
            backtrack(nums, track, used);
            track.removeLast();
            used[i] = false;
        }
    }
}
