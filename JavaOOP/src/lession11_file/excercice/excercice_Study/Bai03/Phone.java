package lession11_file.excercice.excercice_Study.Bai03;

import lession11_file.excercice.excercice_Study.Bai03.exception.ValidationException;
import lession11_file.excercice.excercice_Study.Bai03.validation.Validation;

import java.util.Scanner;

abstract class Phone {

    private String id;
    private String name;
    private double price;
    private int warranty;
    private String manufacturer;

    public abstract double totalPrice();
    public Phone() {
    }

    public Phone(String id, String name, double price, int warranty, String manufacturer) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.warranty = warranty;
        this.manufacturer = manufacturer;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Nhập vào tên điện thoại: ");
                this.name = scanner.nextLine();
                Validation.notEmpty(this.name, "Tên điện thoại");
                break;
            } catch (ValidationException e) {
                System.out.println(e.getMessage());
            }
        }

        while (true) {
            try {
                System.out.print("Nhập vào giá bán: ");
                this.price = Validation.validationDouble(scanner.nextLine(), "Giá bán");
                break;
            } catch (ValidationException e) {
                System.out.println(e.getMessage());
            }
        }

        while (true) {
            try {
                System.out.print("Nhập vào thời gian bảo hành: ");
                this.warranty = Validation.validationInt(scanner.nextLine(), "Thời gian bảo hành");
                break;
            } catch (ValidationException e) {
                System.out.println(e.getMessage());
            }
        }

        while (true) {
            try {
                System.out.print("Nhập vào hãng sản xuất: ");
                this.manufacturer = scanner.nextLine();
                Validation.notEmpty(this.manufacturer, "Hãng sản xuất");
                break;
            } catch (ValidationException e) {
                System.out.println(e.getMessage());
            }
        }
    }


    public void output() {
        System.out.println("ID: " + this.id);
        System.out.println("Tên điện thoại: " + this.name);
        System.out.println("Giá bán: " + this.price);
        System.out.println("Thời gian bảo hành: " + this.warranty);
        System.out.println("Hãng sản xuất: " + this.manufacturer);
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getWarranty() {
        return warranty;
    }

    public void setWarranty(int warranty) {
        this.warranty = warranty;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

}
