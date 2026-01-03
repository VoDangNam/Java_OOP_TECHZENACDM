package lession09_SetAndMap.excercie.Set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExcercie {
    public static void main(String[] args) {
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        integerArrayList.add(10);
        integerArrayList.add(30);
        integerArrayList.add(50);
        integerArrayList.add(20);
        integerArrayList.add(80);
        integerArrayList.add(50);
        integerArrayList.add(20);


        /*  System.out.println("Arraylist ban dau: " + integerArrayList);
        System.out.println("Array List sau loai bo trung lap: " + removeDuplicates(integerArrayList));
        System.out.println("Tong cac phan tu khong tung lap: " + totalUniqueArrayL(integerArrayList));*/

     /*   int[] a = {1, 2, 3, 4};
        int[] b = {4, 3, 5, 6};
        System.out.println(timPhanTuChungCuaHaiMang(a, b));*/

        minAndMaxArray(integerArrayList);
    }


    public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> arrayList) {
        Set<Integer> uniqueSet = new HashSet<>(arrayList);
        return new ArrayList<>(uniqueSet);
    }

    public static int totalUniqueArrayL(ArrayList<Integer> arrayList) {
        int total = 0;
        Set<Integer> uniqueSet = new HashSet<>(arrayList);

        for (Integer e : uniqueSet) {
            total += e;
        }
        return total;
    }

    public static ArrayList<Integer> timPhanTuChungCuaHaiMang(int[] array1, int[] array2) {
        Set<Integer> uniqueArray1 = new HashSet<>();
        Set<Integer> chung = new HashSet<>();
        for (int e : array1) {
            uniqueArray1.add(e);
        }

        for (int e : array2) {
            if (uniqueArray1.contains(e)) {
                chung.add(e);
            }
        }

        return new ArrayList<>(chung);
    }

    public static void minAndMaxArray(ArrayList<Integer> a) {
        Set<Integer> integersTreeSet = new TreeSet<>(a);
        ArrayList<Integer> n = new ArrayList<>(integersTreeSet);
        System.out.println(integersTreeSet);
        System.out.println("Min: " + n.getFirst());
        System.out.println("Max: " + n.getLast());

    }


}
