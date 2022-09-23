package main.codility;

import java.util.HashSet;
import java.util.Set;

public class Demo {

    public int solution(int[] A){

        Set<Integer> set = new HashSet<>();

        for (int j : A) {
            set.add(j);
        }

        int i = 1;
        for( i = 1; i<= A.length; i++){
            if(!set.contains(i)){
                return i;
            }
        }

        return i;

    }
}
