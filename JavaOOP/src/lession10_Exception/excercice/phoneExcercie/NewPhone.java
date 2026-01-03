package lession10_Exception.excercice.phoneExcercie;

import lession10_Exception.excercice.exception.NegativeNumberException;
import lession10_Exception.excercice.validation.CommonValidation;

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
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Nhập vào số lượng: ");
            this.quantity = scanner.nextInt();

            CommonValidation.checkNegative(quantity, "So luong");
        } catch (NumberFormatException e) {
            System.out.println("Số lượng phải là số!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
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
