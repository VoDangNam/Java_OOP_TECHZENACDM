package lession11_file.excercice.excercice_Study.Bai03;

import lession11_file.excercice.excercice_Study.Bai03.exception.ValidationException;
import lession11_file.excercice.excercice_Study.Bai03.validation.Validation;

import java.util.Scanner;

public class NewPhone extends Phone {
    private int quantity;

    @Override
    public double totalPrice() {
        return quantity * getPrice();
    }

    public NewPhone() {
    }

    public NewPhone(String id, String name, double price, int warranty, String manufacturer, int quantity) {
        super(id, name, price, warranty, manufacturer);
        this.quantity = quantity;
    }

    @Override
    public void input() {
        super.input();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Nhập vào số lượng: ");
                this.quantity = Validation.validationInt(scanner.nextLine(), "So luong");
                break;
            } catch (ValidationException e) {
                System.out.println(e.getMessage());
            }
        }

    }

    @Override
    public void output() {
        super.output();
        System.out.println("Số lượng: " + this.quantity);
    }

    // Getters and setters
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
