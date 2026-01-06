package lession11_file.excercice.excercice_Study.Bai03;

import lession11_file.excercice.excercice_Study.Bai03.exception.ValidationException;
import lession11_file.excercice.excercice_Study.Bai03.validation.Validation;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DTManager {

    private static final String ERROR_PATH = "JavaOOP/src/lession11_file/excercice/excercice_Study/data/error.txt";
    static Scanner scanner = new Scanner(System.in);

    static ArrayList<OldPhone> oldPhones = new ArrayList<>();
    static ArrayList<NewPhone> newPhones = new ArrayList<>();
    static ArrayList<Phone> phone = new ArrayList<>();
    private static final Logger logger = Logger.getLogger(DTManager.class.getName());


    public static void readFile(String path) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(ERROR_PATH))
        ) {
            String line;
            int lineNum = 0;
            bufferedReader.readLine();

            while ((line = bufferedReader.readLine()) != null) {
                lineNum++;
                String[] d = line.split(",");
                List<String> errors = new ArrayList<>();


                try {
                    Validation.validateId(d[0]);
                } catch (Exception e) {
                    errors.add(e.getMessage());
                }

                for (int i = 0; i < d.length; i++) {
                    try {
                        Validation.notEmpty(d[i], "Trường dữ liệu không được trống");
                    } catch (ValidationException e) {
                        errors.add(e.getMessage());
                    }
                }

                double price = 0;
                int warranty = 0;

                try {
                    price = Validation.validationDouble(d[2], "Giá bán");
                } catch (ValidationException e) {
                    errors.add(e.getMessage());
                }

                try {
                    warranty = Validation.validationInt(d[3], "Thời gian bảo hành");
                } catch (ValidationException e) {
                    errors.add(e.getMessage());
                }

                if (d[0].startsWith("DTC")) {
                    if (d.length != 8) {
                        errors.add("Sai định dạng dữ liệu DTC");
                    } else {
                        int pin = 0;
                        int quantity = 0;

                        try {
                            pin = Validation.validationInt(d[5], "Tình trạng pin");
                        } catch (ValidationException e) {
                            errors.add(e.getMessage());
                        }

                        try {
                            Validation.validateDescription(d[6]);
                        } catch (ValidationException e) {
                            errors.add(e.getMessage());
                        }

                        try {
                            quantity = Validation.validationInt(d[7], "Số lượng");
                        } catch (ValidationException e) {
                            errors.add(e.getMessage());
                        }

                        if (errors.isEmpty()) {
                            OldPhone p = new OldPhone(d[0], d[1], price, warranty, d[4], pin, d[6]);
                            oldPhones.add(p);
                            phone.add(p);
                        }
                    }
                }

                if (d[0].startsWith("DTM")) {
                    if (d.length != 6) {
                        errors.add("Sai định dạng dữ liệu DTM");
                    } else {
                        int quantity = 0;
                        try {
                            quantity = Validation.validationInt(d[5], "Số lượng");
                        } catch (ValidationException e) {
                            errors.add(e.getMessage());
                        }

                        if (errors.isEmpty()) {
                            NewPhone p = new NewPhone(d[0], d[1], price, warranty, d[4], quantity);
                            newPhones.add(p);
                            phone.add(p);
                        }
                    }
                }

                if (!errors.isEmpty()) {
                    bufferedWriter.write("Dòng " + lineNum + ": " + String.join(", ", errors));
                    bufferedWriter.newLine();
                }
            }

        } catch (IOException e) {
            logger.log(Level.SEVERE, ">>Loi khong doc duoc file!!!", e);
        }
    }

    public static void main(String[] args) {
        readFile("JavaOOP/src/lession11_file/excercice/excercice_Study/data/phone.csv");

        int choose;

        while (true) {
            do {
                System.out.println("-- CHƯƠNG TRÌNH QUẢN LÝ ĐIỆN THOẠI --");
                System.out.println("1. Xem danh sách điện thoại");
                System.out.println("2. Thêm mới");
                System.out.println("3. Cập nhật");
                System.out.println("4. Xóa");
                System.out.println("5. Sắp xếp theo giá");
                System.out.println("6. Tìm kiếm");
                System.out.println("7. Tính tổng tiền");
                System.out.println("8. Giảm giá cho điện thoại cũ");
                System.out.println("9. Thoát");

                System.out.print("Mời bạn lựa chọn: ");
                choose = Integer.parseInt(scanner.nextLine());

                switch (choose) {
                    case 1:
                        menuShowList();
                        break;
                    case 2:
                        menuAddNew();
                        break;
                    case 3:
                        update();
                        break;
                    case 4:
                        delete();
                        break;
                    case 5:
                        menuSort();
                        break;
                    case 6:
                        menuSearch();
                        break;
                    case 7:
                        totalMoney();
                        break;
                    case 8:
                        discountOldPhone();
                        break;
                    case 9:
                        return;
                    default:
                        System.out.println("Lựa chọn không hợp lệ, xin chọn lại");
                }

            } while (choose < 1 || choose > 5);
        }
    }

    private static void discountOldPhone() {
        System.out.print("Nhập % giảm giá cho điện thoại cũ: ");
        double percent = Double.parseDouble(scanner.nextLine());

        boolean found = false;

        for (Phone p : phone) {
            if (p instanceof KhuyenMai) {
                System.out.println("Giá cũ: " + p.getPrice());
                ((KhuyenMai) p).khuyenMai(percent);
                System.out.println("Giá mới: " + p.getPrice());
            }
        }

    }

    private static void totalMoney() {
        double total = 0;

        for (Phone p : phone) {
            total += p.totalPrice();
        }

        System.out.printf("Tổng tiền tất cả điện thoại: %,.0f VND%n", total);
    }

    private static void menuShowList() {
        int choose;
        while (true) {
            do {
                System.out.println("DANH SÁCH ĐIỆN THOẠI");
                System.out.println("1. Xem tất cả");
                System.out.println("2. Xem điện thoại cũ");
                System.out.println("3. Xem điện thoại mới");
                System.out.println("4. Trở về menu chính");

                System.out.print("Mời bạn lựa chọn: ");

                choose = Integer.parseInt(scanner.nextLine());

                switch (choose) {
                    case 1:
                        System.out.println("==== Danh sách tất cả điện thoại ====");
                        // Hiển thị danh sách điện thoại cũ
                        int index = 0;
                        for (Phone phone1 : phone) {
                            phone1.output();
                            System.out.println("----------------");
                        }
                        break;

                    case 2:
                        System.out.println("==== Danh sách điện thoại cũ ====");
                        for (int i = 0; i < oldPhones.size(); i++) {
                            System.out.println("Thông tin điện thoại thứ " + (i + 1));
                            oldPhones.get(i).output();
                        }
                        break;

                    case 3:
                        System.out.println("==== Danh sách điện thoại mới ====");
                        for (int i = 0; i < newPhones.size(); i++) {
                            System.out.println("Thông tin điện thoại thứ " + (i + 1));
                            newPhones.get(i).output();
                        }
                        break;

                    case 4:
                        return; // Thoát khỏi phương thức, quay lại menu chính

                    default:
                        System.out.println("Lựa chọn không hợp lệ, xin chọn lại!");
                        break;
                }
            } while (choose < 0 || choose > 4);
        }
    }

    private static void menuAddNew() {
        int choose;
        while (true) {
            do {
                System.out.println("THÊM MỚI ĐIỆN THOẠI");
                System.out.println("1. Thêm mới điện thoại cũ");
                System.out.println("2. Thêm mới điện thoại mới");
                System.out.println("3. Trở về menu chính");

                System.out.print("Mời bạn lựa chọn: ");
                choose = Integer.parseInt(scanner.nextLine());

                switch (choose) {
                    case 1:
                        OldPhone oldPhone = new OldPhone();
                        oldPhone.input();

                        oldPhone.setId(getIdOldPhone());
                        oldPhones.add(oldPhone);
                        phone.add(oldPhone);
                        System.out.println("Thêm mới thành công");
                        break;
                    case 2:
                        NewPhone newPhone = new NewPhone();
                        newPhone.input();
                        newPhone.setId(getIdNewPhone());
                        newPhones.add(newPhone);
                        phone.add(newPhone);
                        System.out.println("Thêm mới thành công");
                        break;
                    case 3:
                        return;
                    default:
                        System.out.println("Lựa chọn không hợp lệ, xin chọn lại");
                }
            } while (choose < 1 || choose > 3);
        }
    }

    private static String getIdOldPhone() {
        // max id => id + 1
        if (oldPhones.isEmpty()) {
            return "DTC001";
        }

        int max = Integer.parseInt(oldPhones.getFirst().getId().substring(3)); // 1

        for (int i = 1; i < oldPhones.size(); i++) {
            int id = Integer.parseInt(oldPhones.get(i).getId().substring(3));
            if (max < id) {
                max = id;
            }
        }

        // 1 => DTC002
        return String.format("DTC%3d", max + 1).replace(" ", "0");
    }

    private static String getIdNewPhone() {
        // max id => id + 1
        if (newPhones.isEmpty()) {
            return "DTM001";
        }

        int max = Integer.parseInt(newPhones.getFirst().getId().substring(3));

        for (int i = 1; i < newPhones.size(); i++) {
            int id = Integer.parseInt(newPhones.get(i).getId().substring(3));
            if (max < id) {
                max = id;
            }
        }

        return String.format("DTM%3d", max + 1).replace(" ", "0");
    }

    private static void update() {
        System.out.print("Nhập vào mã muốn cập nhật: ");
        String id = scanner.nextLine();

        if (id.startsWith("DTC")) {
            boolean isExistPhone = false;
            for (OldPhone oldPhone : oldPhones) {
                if (oldPhone.getId().equals(id)) {
                    isExistPhone = true;
                    oldPhone.input();
                    System.out.println("Cập nhật thành công!");
                    break;
                }
            }

            if (!isExistPhone) {
                System.out.println("Không tìm thấy mã muốn cập nhật!");
            }

        } else if (id.startsWith("DTM")) {
            boolean isExistPhone = false;
            for (NewPhone newPhone : newPhones) {
                if (newPhone.getId().equals(id)) {
                    isExistPhone = true;
                    newPhone.input();
                    System.out.println("Cập nhật thành công!");
                    break;
                }
            }

            if (!isExistPhone) {
                System.out.println("Không tìm thấy mã muốn cập nhật!");
            }

        } else {
            System.out.println("Mã không hợp lệ!");
        }
    }

    private static void delete() {
        System.out.print("Nhập vào mã muốn xóa: ");
        String id = scanner.nextLine();

        if (id.startsWith("DTC")) {
            boolean isExistPhone = false;
            for (OldPhone oldPhone : oldPhones) {
                if (oldPhone.getId().equals(id)) {
                    isExistPhone = true;
                    System.out.printf("Bạn có xóa điện thoại có mã %s không?\n", id);
                    System.out.println("Chọn Yes để xác nhận xóa, No để hủy");

                    if ("yes".equalsIgnoreCase(scanner.nextLine())) {
                        oldPhones.remove(oldPhone);
                        System.out.println("Xóa thành công!");
                    } else {
                        System.out.println("Đã hủy việc xóa!");
                    }
                    break;
                }
            }

            if (!isExistPhone) {
                System.out.println("Không tìm thấy mã muốn xóa!");
            }

        } else if (id.startsWith("DTM")) {
            boolean isExistPhone = false;
            for (NewPhone newPhone : newPhones) {
                if (newPhone.getId().equals(id)) {
                    isExistPhone = true;
                    System.out.printf("Bạn có xóa điện thoại có mã %s không?\n", id);
                    System.out.println("Chọn Yes để xác nhận xóa, No để hủy");

                    if ("yes".equalsIgnoreCase(scanner.nextLine())) {
                        newPhones.remove(newPhone);
                        System.out.println("Xóa thành công!");
                    } else {
                        System.out.println("Đã hủy việc xóa!");
                    }
                    break;
                }
            }

            if (!isExistPhone) {
                System.out.println("Không tìm thấy mã muốn xóa!");
            }

        } else {
            System.out.println("Mã không hợp lệ!");
        }
    }

    private static void menuSort() {
        int choose;
        while (true) {
            do {
                System.out.println("SẮP XẾP ĐIỆN THOẠI THEO GIÁ");
                System.out.println("1. Tăng dần");
                System.out.println("2. Giảm dần");
                System.out.println("3. Trở về menu chính");

                System.out.print("Mời bạn lựa chọn: ");
                choose = Integer.parseInt(scanner.nextLine());

                switch (choose) {
                    case 1:
                        for (int i = 0; i < phone.size() - 1; i++) {
                            for (int j = 0; j < phone.size() - 1 - i; j++) {
                                if (phone.get(j).getPrice() > phone.get(j + 1).getPrice()) {
                                    Phone temp = phone.get(j);
                                    phone.set(j, phone.get(j + 1));
                                    phone.set(j + 1, temp);
                                }
                            }
                        }
                        System.out.println("Danh sách sau khi sắp xếp:");
                        for (Phone p : phone) {
                            p.output();
                            System.out.println("---------------");
                        }
                        break;
                    case 2:
                        for (int i = 0; i < phone.size() - 1; i++) {
                            for (int j = 0; j < phone.size() - 1 - i; j++) {
                                if (phone.get(j).getPrice() < phone.get(j + 1).getPrice()) {
                                    Phone temp = phone.get(j);
                                    phone.set(j, phone.get(j + 1));
                                    phone.set(j + 1, temp);
                                }
                            }
                        }
                        System.out.println("Danh sách sau khi sắp xếp:");
                        for (Phone p : phone) {
                            p.output();
                            System.out.println("---------------");
                        }
                        break;
                    case 3:
                        return;
                    default:
                        System.out.println("Lựa chọn không hợp lệ, xin chọn lại!");
                }

            } while (choose < 0 || choose > 3);
        }
    }

    private static void menuSearch() {
        int choose;
        while (true) {
            do {
                System.out.println("TÌM KIẾM ĐIỆN THOẠI");
                System.out.println("1. Tìm kiếm tất cả điện thoại");
                System.out.println("2. Tìm kiếm điện thoại cũ");
                System.out.println("3. Tìm kiếm điện thoại mới");
                System.out.println("4. Trở về menu chính");

                System.out.print("Mời bạn lựa chọn: ");
                // Chuyển đổi từ String sang Integer để tránh lỗi trôi dòng của Scanner
                choose = Integer.parseInt(scanner.nextLine());

                switch (choose) {
                    case 1:
                        menuSearchAllPhone();
                        break;
                    case 2:
                        menuSearchOldPhone();
                        break;
                    case 3:
                        menuSearchNewPhone();
                        break;
                    case 4:
                        return; // Thoát khỏi phương thức và quay lại menu chính
                    default:
                        System.out.println("Lựa chọn không hợp lệ, xin chọn lại!");
                }
            } while (choose < 1 || choose > 4);
        }
    }

    private static void menuSearchAllPhone() {
        int choose;
        while (true) {
            do {
                System.out.println("TÌM KIẾM THEO TẤT CẢ ĐIỆN THOẠI");
                System.out.println("1. Tìm kiếm theo giá");
                System.out.println("2. Tìm kiếm theo tên");
                System.out.println("3. Tìm kiếm theo hãng");
                System.out.println("4. Trở về menu Tìm kiếm");

                System.out.print("Mời bạn lựa chọn: ");
                try {
                    // Sử dụng Integer.parseInt(scanner.nextLine()) để tránh trôi lệnh
                    choose = Integer.parseInt(scanner.nextLine());
                } catch (NumberFormatException e) {
                    // Gán giá trị mặc định nếu người dùng nhập không phải là số
                    choose = -1;
                }

                switch (choose) {
                    case 1:
                        System.out.print("Nhập giá MIN: ");
                        double min = Double.parseDouble(scanner.nextLine());

                        System.out.print("Nhập giá MAX: ");
                        double max = Double.parseDouble(scanner.nextLine());

                        for (Phone p : phone) {
                            if (p.getPrice() >= min && p.getPrice() <= max) {
                                p.output();
                            }
                        }
                        break;
                    case 2:
                        String findName;
                        System.out.print("Nhap vao Ten ban can tim: ");
                        findName = scanner.nextLine();
                        System.out.println("Cac dien thoai co ten " + findName);
                        for (Phone value : phone) {
                            if (value.getName().toLowerCase().contains(findName.toLowerCase())) {
                                value.output();
                            }
                        }
                        break;
                    case 3:
                        String HangTim;
                        System.out.print("Nhap vao hang ban can tim: ");
                        HangTim = scanner.nextLine();
                        System.out.println("Cac dien thoai co hang " + HangTim);
                        for (Phone value : phone) {
                            if (value.getManufacturer().equalsIgnoreCase(HangTim)) {
                                value.output();
                            }

                        }
                        break;
                    case 4:
                        // Thoát khỏi hàm và trở về menu trước đó
                        return;
                    default:
                        System.out.println("Lựa chọn không hợp lệ, xin chọn lại!");
                        break;
                }
            } while (choose < 1 || choose > 4);
        }
    }

    private static void menuSearchOldPhone() {
        int choose;
        while (true) {
            do {
                System.out.println("TÌM KIẾM THEO ĐIỆN THOẠI CŨ");
                System.out.println("1. Tìm kiếm theo giá");
                System.out.println("2. Tìm kiếm theo tên");
                System.out.println("3. Tìm kiếm theo hãng");
                System.out.println("4. Trở về menu Tìm kiếm");

                System.out.print("Mời bạn lựa chọn: ");
                choose = Integer.parseInt(scanner.nextLine());

                switch (choose) {
                    case 1:
                        System.out.print("Nhập giá MIN: ");
                        double min = Double.parseDouble(scanner.nextLine());

                        System.out.print("Nhập giá MAX: ");
                        double max = Double.parseDouble(scanner.nextLine());

                        for (Phone p : phone) {
                            if (p.getPrice() >= min && p.getPrice() <= max && p instanceof OldPhone) {
                                p.output();
                            }
                        }
                        break;
                    case 2:
                        String findName;
                        System.out.print("Nhap vao Ten ban can tim: ");
                        findName = scanner.nextLine();
                        System.out.println("Cac dien thoai co ten " + findName);
                        for (Phone value : phone) {
                            if (value.getName().toLowerCase().contains(findName.toLowerCase()) && value instanceof OldPhone) {
                                value.output();
                            }
                        }
                        break;
                    case 3:
                        String HangTim;
                        System.out.print("Nhap vao hang ban can tim: ");
                        HangTim = scanner.nextLine();
                        System.out.println("Cac dien thoai co hang " + HangTim);
                        for (Phone value : phone) {
                            if (value.getManufacturer().equalsIgnoreCase(HangTim) && value instanceof OldPhone) {
                                value.output();
                            }

                        }
                        break;
                    case 4:
                        return;
                    default:
                        System.out.println("Lựa chọn không hợp lệ, xin chọn lại!");
                }
            } while (choose < 0 || choose > 4);
        }
    }

    private static void menuSearchNewPhone() {
        int choose;
        while (true) {
            do {
                System.out.println("TÌM KIẾM THEO ĐIỆN THOẠI MỚI");
                System.out.println("1. Tìm kiếm theo giá");
                System.out.println("2. Tìm kiếm theo tên");
                System.out.println("3. Tìm kiếm theo hãng");
                System.out.println("4. Trở về menu Tìm kiếm");

                System.out.print("Mời bạn lựa chọn: ");
                choose = Integer.parseInt(scanner.nextLine());

                switch (choose) {
                    case 1:
                        System.out.print("Nhập giá MIN: ");
                        double min = Double.parseDouble(scanner.nextLine());

                        System.out.print("Nhập giá MAX: ");
                        double max = Double.parseDouble(scanner.nextLine());

                        for (Phone p : phone) {
                            if (p.getPrice() >= min && p.getPrice() <= max && p instanceof NewPhone) {
                                p.output();
                            }
                        }
                        break;
                    case 2:
                        String findName;
                        System.out.print("Nhap vao Ten ban can tim: ");
                        findName = scanner.nextLine();
                        System.out.println("Cac dien thoai co ten " + findName);
                        for (Phone value : phone) {
                            if (value.getName().toLowerCase().contains(findName.toLowerCase()) && value instanceof NewPhone) {
                                value.output();
                            }
                        }
                        break;
                    case 3:
                        String HangTim;
                        System.out.print("Nhap vao hang ban can tim: ");
                        HangTim = scanner.nextLine();
                        System.out.println("Cac dien thoai co hang " + HangTim);
                        for (Phone value : phone) {
                            if (value.getManufacturer().equalsIgnoreCase(HangTim) && value instanceof NewPhone) {
                                value.output();
                            }

                        }
                        break;
                    case 4:
                        return;
                    default:
                        System.out.println("Lựa chọn không hợp lệ, xin chọn lại!");
                }

            } while (choose < 0 || choose > 4);
        }
    }
}

