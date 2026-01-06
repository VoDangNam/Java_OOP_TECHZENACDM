package lession11_file.excercice.excercice_Study.Bai03;

import lession11_file.excercice.excercice_Study.Bai03.exception.ValidationException;
import lession11_file.excercice.excercice_Study.Bai03.validation.Validation;

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
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Nhập vào tình trạng pin (%): ");
                this.batteryPercentage = Validation.validationInt(
                        scanner.nextLine(), "Tình trạng pin"
                );
                break;
            } catch (ValidationException e) {
                System.out.println(e.getMessage());
            }
        }

        while (true) {
            try {
                System.out.print("Nhập vào mô tả thêm: ");
                this.description = scanner.nextLine();
                Validation.validateDescription(this.description);
                break;
            } catch (ValidationException e) {
                System.out.println(e.getMessage());
            }
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
