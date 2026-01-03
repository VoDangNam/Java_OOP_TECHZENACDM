package lession09_SetAndMap.practice.Set;

import java.util.Collections;
import java.util.Set;

public class TreeSet {

    public static void main(String[] args) {
        Set<Integer> intergeTree1 = new java.util.TreeSet<>(Collections.reverseOrder());
        intergeTree1.add(10);
        intergeTree1.add(40);
        intergeTree1.add(20);
        intergeTree1.add(30);

        for(Integer e : intergeTree1){
            System.out.println(e);
        }
    }
}
