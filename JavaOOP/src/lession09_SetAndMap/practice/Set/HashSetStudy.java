package lession09_SetAndMap.practice.Set;

import java.util.HashSet;
import java.util.Set;

public class HashSetStudy {
    public static void main(String[] args) {
      /*  Set<Integer> intergeSet = new HashSet<>();
        intergeSet.add(10);
        intergeSet.add(20);
        intergeSet.add(30);
        System.out.println(intergeSet);

        Set<Integer> integerSet1 = new HashSet<>(17, 0.25f);
        integerSet1.add(1);
        integerSet1.add(2);
        integerSet1.add(3);
        integerSet1.add(30);
        System.out.println(integerSet1);

        for (Integer e : integerSet1) {
            System.out.println(e);
        }*/

        Set<Integer> integerSet2 = new HashSet<>(17, 0.25f);
        integerSet2.add(1);
       integerSet2.add(1);
        System.out.println(integerSet2);
        System.out.println("Size: "+integerSet2.size()); // size = 1
    }




}
