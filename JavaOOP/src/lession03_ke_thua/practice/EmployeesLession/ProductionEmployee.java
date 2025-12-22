package lession03_ke_thua.practice;

import java.util.Scanner;

public class ProductionEmployee extends Employee {
    private double numberProduct;

    public ProductionEmployee(double numberProduct) {
        this.numberProduct = numberProduct;
    }

    public ProductionEmployee(String id, String name, String date, String address, double numberProduct) {
        super(id, name, date, address);
        this.numberProduct = numberProduct;
    }

    public double getNumberProduct() {
        return numberProduct;
    }

    public void setNumberProduct(double numberProduct) {
        this.numberProduct = numberProduct;
    }

    @Override
    public void input(Scanner sc) {
        super.input(sc);
        System.out.print("Nhap vao so san pham: ");
        this.numberProduct = Double.parseDouble(sc.nextLine());
    }

    @Override
    public void output(){
       super.output();
        System.out.print("So luong san pham: "+this.numberProduct);
    }


}
