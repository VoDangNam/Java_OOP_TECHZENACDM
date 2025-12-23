package lession03_ke_thua.excercises.Bai02;

public class MathManager {
    public static void main(String[] args) {
        double a = 10;
        double b = 5;

        System.out.println("Cong: " + MathUtil.add(a, b));
        System.out.println("Tru: " + MathUtil.subtract(a, b));
        System.out.println("Nhan: " + MathUtil.multiply(a, b));
        System.out.println("Chia: " + MathUtil.divide(a, b));
    }
}
