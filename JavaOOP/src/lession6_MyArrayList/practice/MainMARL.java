package lession6_MyArrayList.practice;

import java.util.ArrayList;

public class MainMARL {
    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList();
        ArrayList<Integer> test = new ArrayList<>();
        myArrayList.add(10);
        myArrayList.add(20);
        myArrayList.add(30);
        myArrayList.add(40);
        myArrayList.add(10);
        myArrayList.add(20);
        myArrayList.add(30);
        myArrayList.add(40);
        myArrayList.add(10);
        myArrayList.add(20);
        myArrayList.add(30);
        myArrayList.add(40);
        myArrayList.add(10);
        myArrayList.add(20);
        myArrayList.add(30);
        myArrayList.add(40);
        System.out.println("Size: " + myArrayList.size());
//        System.out.println(myArrayList.capacity());
        System.out.println(myArrayList);
        myArrayList.add(2, 20);
        System.out.println(myArrayList);
        System.out.println("Size: " + myArrayList.size());
//        System.out.println("Capacity: " + myArrayList.capacity());

        myArrayList.set(16, 50);
        System.out.println("Set tai vi tri 16, ki tu,50: \n" + myArrayList);

        System.out.println("Phan tu tai vi tri so 2 la: " + myArrayList.get(7));
        int getIndexOf =myArrayList.indexOf(30);
        if (getIndexOf < 0) {
            System.out.println("Khong tim thay phan tu do!!!");
        } else {
            System.out.println("Phan tu dau tien tai vi tri: "+getIndexOf);
        }

        int getLastIndexOf =myArrayList.lastIndexOf(30);
        if (getLastIndexOf < 0) {
            System.out.println("Khong tim thay phan tu do!!!");
        } else {
            System.out.println("Phan cuoi cung tai vi tri: "+getLastIndexOf);
        }

        myArrayList.remove(3);
        System.out.println("ArrayList sau xoa\n"+myArrayList);

        myArrayList.removeElement(20);
        System.out.println("ArrayList sau xoa tat ca cac phan tu do\n "+myArrayList);

    }
}
