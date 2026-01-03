package lession10_Exception.excercice.phoneExcercie;

import lession10_Exception.excercice.validation.PhoneValidation;

import java.util.Scanner;

public class OldPhone extends Phone implements KhuyenMai {

    private int batteryPercentage;
    private String description;

    @Override
    public double totalPrice() {
        return (batteryPercentage * getPrice()/100);
    }

    public OldPhone() {
    }

    public OldPhone(String id, String name, double price, int warranty,
                    String manufacturer, int batteryPercentage, String description) {
        super(id, name, price, warranty, manufacturer);
        this.batteryPercentage = batteryPercentage;
        this.description = description;
    }

    @Override
    public void input() {
        super.input();

        try {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Nhập vào tình trạng pin (%): ");
            this.batteryPercentage = Integer.parseInt(scanner.nextLine());
            PhoneValidation.checkBattery(batteryPercentage);

            System.out.print("Nhập vào mô tả thêm: ");
            this.description = scanner.nextLine();
            PhoneValidation.checkDescription(description);

        } catch (NumberFormatException e) {
            System.out.println("Pin phải là số!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void output() {
        super.output();
        System.out.println("Tình trạng pin (%): " + this.batteryPercentage);
        System.out.println("Mô tả thêm: " + this.description);
    }

    // Getters and setters

    public int getBatteryPercentage() {
        return batteryPercentage;
    }

    public void setBatteryPercentage(int batteryPercentage) {
        this.batteryPercentage = batteryPercentage;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public void khuyenMai(double percent) {
        if (percent <= 0 || percent >= 100) {
            return;
        }
        double newPrice = getPrice() * (100 - percent) / 100;
        setPrice(newPrice);
    }

}
