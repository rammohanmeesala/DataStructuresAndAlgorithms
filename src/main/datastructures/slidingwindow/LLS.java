package main.datastructures.slidingwindow;

import java.util.HashSet;
import java.util.Set;

public class LLS {

    public int lengthOfLongestSubstring(String s) {

        Set<Character> set = new HashSet<Character>();

        int res = 0;
        int left = 0;

        for(int right = 0; right <s.length(); right++){

            if(set.contains(s.charAt(right))){
                res = Math.max(res, set.size());
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));

        }

        return res == 0 ? set.size() : res;
    }
}
