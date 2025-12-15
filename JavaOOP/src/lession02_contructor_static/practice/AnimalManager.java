package lession02_contructor_static.practice;

import java.util.ArrayList;
import java.util.Scanner;

public class AnimalManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Animal animal = new Animal();
        animal.setId(123);
        animal.setName("Cow");
        animal.setColor("Yellow");
        animal.setAge(17);

        animal.output();
    }
}
