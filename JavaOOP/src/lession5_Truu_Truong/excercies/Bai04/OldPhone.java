package lession5_Truu_Truong.excercies.Bai04;

import java.util.Scanner;

public class OldPhone extends Phone implements KhuyenMai{

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
        System.out.print("Nhập vào tình trạng pin (%): ");
        this.batteryPercentage = Integer.parseInt(scanner.nextLine());

        System.out.print("Nhập vào mô tả thêm: ");
        this.description = scanner.nextLine();
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
