package neetcode150.arraysandhashing;

import java.util.HashSet;
import java.util.Set;

class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i: nums) {
            if (!set.add(i))
                return true;
        }
        return false;
    }
}
