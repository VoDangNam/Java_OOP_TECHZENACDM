Winz
winz314
Vô hình

Đây là sự khởi đầu của kênh #exercises.
thienhh — 11:40 21/11/25
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

        // Bước 1: Nhập vào tháng và năm từ bàn phím
        System.out.print("Nhập tháng (1-12): ");
        int month = scanner.nextInt();

        System.out.print("Nhập năm: ");
        int year = scanner.nextInt();

        // Bước 2: Xác định số ngày trong tháng
        int daysInMonth;

        switch (month) {
            case 4:
            case 6:
            case 9:
            case 11:
                daysInMonth = 30;
                break;
            case 2:
                // Năm nhuận: Chia hết cho 4 nhưng không chia hết cho 100, hoặc năm chia hết cho 400
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    daysInMonth = 29; // Năm nhuận
                } else {
                    daysInMonth = 28; // Năm không nhuận
                }
                break;
            default:
                daysInMonth = 31;
                break;
        }

        // Bước 3: In ra màn hình console số ngày trong tháng
        System.out.printf("Số ngày trong tháng %d năm %d là %d ngày.", month, year, daysInMonth);
    }
thienhh — 22:23 21/11/25
A gửi bài tập buổi 3
# Bài tập 1: Kiểm tra số chính phương

## Đề bài:
> Kiểm tra 1 số nguyên dương x có phải là số chính phương hay không?
> * Định nghĩa số chính phương: Là số mà kết quả khai căn bậc 2 của nó là 1 số nguyên. vd: 0, 1, 4, 9, 16, 25, 36 ...
    Mở rộng
    homework_lesson03.md
    3 KB
    kyokokanata — 13:33 23/11/25
    https://github.com/NguyenThanhNhan-7068/hoc_backend_techzen
    GitHub
    GitHub - NguyenThanhNhan-7068/hoc_backend_techzen
    Contribute to NguyenThanhNhan-7068/hoc_backend_techzen development by creating an account on GitHub.
    GitHub - NguyenThanhNhan-7068/hoc_backend_techzen
    thienhh — 14:16 23/11/25
    Ok e
    Winz — 00:00 24/11/25
    https://github.com/VoDangNam/Java_Backend_Techzen/blob/main/src/Bai02.java
    GitHub
    Java_Backend_Techzen/src/Bai02.java at main · VoDangNam/Java_Backe...
    Contribute to VoDangNam/Java_Backend_Techzen development by creating an account on GitHub.
    thienhh — 06:12 24/11/25
    Ok e
    thienhh — 16:10 24/11/25
# Bài tập 1: In dãy số lẻ từ 1 đến n

> **Đề bài:**
> In dãy số 1, 3, 5, 7, 9, ... n (n là số nhập vào từ bàn phím)

### Hướng dẫn các bước thực hiện
Mở rộng
exercises.md
10 KB
thienhh — 14:42 26/11/25
Bài tập bài 5: Method
# Bài tập 1: Câu lệnh điều kiện và rẽ nhánh

> **Đề bài:**
> Bài tập chương câu lệnh điều kiện và rẽ nhánh: <br>
> a. Viết phương thức đổi một ký tự hoa sang ký tự thường <br>
> b. Viết phương thức giải phương trình bậc nhất <br>
Mở rộng
exercises05.md
11 KB
thienhh — 16:02 28/11/25
Bài tập buổi 6: Chuỗi trong Java
# Bài tập 1: Xử lý chuỗi trong Java

> **Đề bài:**
> Cho chuỗi `String str = "Hello World"` <br>
> a. Lấy ra chữ World <br>
> b. Thay o thành f <br>
Mở rộng
exercises06.md
10 KB
thienhh — 15:59 1/12/25
Bài tập buổi 7: Mảng một chiều - #01
# Bài tập 1: Mảng một chiều và các thao tác trên mảng

> **Đề bài:**
> Hãy viết một chương trình Java thực hiện các chức năng sau liên quan đến mảng một chiều: <br>
> 1. Các thao tác nhập xuất
     >    * a. Nhập mảng
            Mở rộng
            exercises07.md
            9 KB
            thienhh — 15:48 3/12/25
            Bài tập buổi 8: Mảng một chiều - #02
# Bài tập 1: Các thao tác xử lý mảng 1 chiều

> **Đề bài:**
> Hãy viết một chương trình Java thực hiện các thao tác xử lý sau liên quan đến mảng một chiều:
>* a. Tách các số nguyên tố có trong mảng a đưa vào mảng b
>* b. Tách mảng a thành 2 mảng b (chứa các số nguyên dương) và c (chứa các số còn lại)
   Mở rộng
   exercises08.md
   6 KB
   thienhh — 17:13 8/12/25
   Bài tập buổi 9: Mảng 2 chiều & ArrayList
# Bài tập 1: Các thao tác xử lý mảng 1 chiều

> **Đề bài:**
> Viết chương trình thực hiện công việc sau:
>* a. Nhập/Xuất ma trận vuông A (n dòng, n cột) gồm các phần tử kiểu int
>* b. Tính tích các số là bội số của 3 nằm trên dòng đầu tiên của ma trận
   Mở rộng
   exercises09.md
   7 KB
   thienhh — 10:01 12/12/25
   Bài tập buổi 11: OOP
# Bài tập 1: Quản lý thông tin học sinh

## Đề bài

> Viết chương trình cho phép nhập thông tin học sinh, bao gồm:
> * Các thuộc tính: tên học sinh, điểm toán, và điểm văn
    Mở rộng
    exercises01.md
    5 KB
    thienhh — 13:47 15/12/25
    Sheet tracking điểm lớp Java Backend 04
    https://1drv.ms/x/c/bfca24873e8adce2/IQB-zAplVAStQZZraL7buuZVAQrNGCr4Z-_2y2w7UWmu8XQ?e=cCZJab
    thienhh — 14:55 15/12/25
    Bài tập 1 (Constructor)
    Hình ảnh
    Hình ảnh
    Nhuw — 15:48 15/12/25
    Bài tập về nhà buổi 12: Contructors, Access modifier, Encapsulation
# Bài 1: Xây dựng và sử dụng các contructors của lớp Phân Số

> **Đề bài:**
> Tạo lớp **PhanSo** có các constructor và phương thức xử lý để đáp ứng đoạn mã chạy thử bên dưới.
>
>   * **Thuộc tính:** `tuSo`, `mauSo`
      Mở rộng
      ss2_exercises.md
      4 KB
      thienhh — 20:15 15/12/25
      @everyone Mọi người làm bài tập xong thì nhắn vào đây để @Nhuw review code nhé
      ko nhắn riêng cho a nữa
      Nhuw — 17:04 16/12/25
      @everyone mọi người nộp bài tập trong hôm nay nha
      leanhtai — 18:48 16/12/25
      https://github.com/leanhtai2284/OPP/tree/Lesson2
      GitHub
      GitHub - leanhtai2284/OPP at Lesson2
      Contribute to leanhtai2284/OPP development by creating an account on GitHub.
      Contribute to leanhtai2284/OPP development by creating an account on GitHub.
      𝕻𝖍𝖎 — 23:31 16/12/25
      https://github.com/ngnhphj/TechZen_Java_Exercise_OOP.git
      GitHub
      GitHub - ngnhphj/TechZen_Java_Exercise_OOP
      Contribute to ngnhphj/TechZen_Java_Exercise_OOP development by creating an account on GitHub.
      Contribute to ngnhphj/TechZen_Java_Exercise_OOP development by creating an account on GitHub.
      Winz — 23:54 16/12/25
      https://github.com/VoDangNam/Java_OOP_TECHZENACDM/tree/Bai02/JavaOOP/src/lession02_contructor_static/exercises
      GitHub
      Java_OOP_TECHZENACDM/JavaOOP/src/lession02_contructor_static/exerci...
      Contribute to VoDangNam/Java_OOP_TECHZENACDM development by creating an account on GitHub.
      Contribute to VoDangNam/Java_OOP_TECHZENACDM development by creating an account on GitHub.
      e gửi bt ạ
      kyokokanata — 13:48 17/12/25
      https://github.com/NguyenThanhNhan-7068/hoc_backend_techzen/tree/main
      GitHub
      GitHub - NguyenThanhNhan-7068/hoc_backend_techzen
      Contribute to NguyenThanhNhan-7068/hoc_backend_techzen development by creating an account on GitHub.
      GitHub - NguyenThanhNhan-7068/hoc_backend_techzen
      Nhuw — 14:23 17/12/25
      Bài tập về nhà buổi 13
      Nhuw — 17:02 17/12/25
      @everyone Mình gửi lại BTVN buổi 13 (gồm static và kế thừa), các bạn nộp trước 19h ngày mai giúp mình. Bài khá nhiều nên các bạn tranh thủ làm sớm nha
      Mình mới đc nắm thông tin các bạn được nghỉ thứ 6 và thứ 2, nên các bạn nộp trước 19h thứ 2 tuần sau giúp mình nha @everyone
      Nhuw — 19:41 18/12/25
# Bài 1: Đếm số lượng đối tượng Student được tạo ra

## Đề bài

> Viết một lớp `Student` đại diện cho sinh viên, bao gồm các thông tin sau:
> * Mã số sinh viên
    Mở rộng
    ss03_exercises.md
    11 KB
    Nhuw — Hôm qua lúc 09:33
    @everyone Mọi người lưu ý Bài 4 – Quản lý điện thoại:
    Hiện tại, chỉ cần thực hiện các chức năng 1, 2, 3 và 4.
    Những chức năng còn lại sẽ được bổ sung và hoàn thiện sau, khi chúng ta học đến các bài tiếp theo
    Hình ảnh
    thienhh — Hôm qua lúc 13:22
    @everyone Mọi người cần nộp bài tập trong chiều nay giúp a
    Nhuw — Hôm qua lúc 20:27
    @everyone mọi người gửi bài tập về nhà giúp mình để kịp review nha
    𝕻𝖍𝖎 — Hôm qua lúc 21:04
    em  push lên link github rồi nha chị ơi
    leanhtai — Hôm qua lúc 22:41
    em moi push len roi ay a
    Winz — 00:33
    Dạ. Em push bài tập lên rồi ạ
    Nhuw — 16:18
    Bài tập về nhà buổi 14 - polymorphism
# Ứng dụng quản lý điện thoại - Bổ sung thêm chức năng

## Đề bài

Bổ sung thêm chức năng bên dưới cho bài `ứng dụng quản lý điện thoại`

#### `5. Sắp xếp theo giá`
#### `6. Tìm kiếm`

## Hướng dẫn cơ bản

### 5. Sắp xếp theo giá

**Mô tả**

* Đầu tiên, cần chuyển từ hai ArrayList (cho điện thoại cũ và mới) sang một ArrayList duy nhất chứa cả hai loại.
* Tạo một ArrayList mới có kiểu dữ liệu là Điện Thoại. Nhớ rằng, bạn có thể lưu cả Điện thoại cũ và Điện thoại mới trong danh sách này nhờ khả năng đa hình.
* Điều chỉnh chương trình để chấp nhận ArrayList mới này. Sử dụng từ khóa `instanceof` để xác định loại điện thoại khi cần.
* Sắp xếp ArrayList dựa trên giá. Dùng thuật toán sắp xếp đổi chỗ trực tiếp (Interchange Sort).

### 6. Tìm kiếm

**Mô tả**

* **Tìm kiếm theo loại:** Dùng từ khóa `instanceof` để lọc ra các điện thoại cũ hoặc mới.
* **Tìm kiếm theo giá:** Cho phép người dùng nhập khoảng giá. duyệt qua ArrayList và lọc ra các điện thoại nằm trong khoảng giá này.
* **Tìm kiếm theo tên:** Nhận đầu vào từ người dùng, duyệt qua ArrayList và sử dụng phương thức `contains` trên tên của mỗi điện thoại để tìm kiếm gần đúng.
  Thu gọn
  ss4_exercises.md
  2 KB
  Mọi người nộp bài trước 22h tối nay giúp mình nha @everyone
  ﻿
# Ứng dụng quản lý điện thoại - Bổ sung thêm chức năng

## Đề bài

Bổ sung thêm chức năng bên dưới cho bài `ứng dụng quản lý điện thoại`

#### `5. Sắp xếp theo giá`
#### `6. Tìm kiếm`

## Hướng dẫn cơ bản

### 5. Sắp xếp theo giá

**Mô tả**

* Đầu tiên, cần chuyển từ hai ArrayList (cho điện thoại cũ và mới) sang một ArrayList duy nhất chứa cả hai loại.
* Tạo một ArrayList mới có kiểu dữ liệu là Điện Thoại. Nhớ rằng, bạn có thể lưu cả Điện thoại cũ và Điện thoại mới trong danh sách này nhờ khả năng đa hình.
* Điều chỉnh chương trình để chấp nhận ArrayList mới này. Sử dụng từ khóa `instanceof` để xác định loại điện thoại khi cần.
* Sắp xếp ArrayList dựa trên giá. Dùng thuật toán sắp xếp đổi chỗ trực tiếp (Interchange Sort).

### 6. Tìm kiếm

**Mô tả**

* **Tìm kiếm theo loại:** Dùng từ khóa `instanceof` để lọc ra các điện thoại cũ hoặc mới.
* **Tìm kiếm theo giá:** Cho phép người dùng nhập khoảng giá. duyệt qua ArrayList và lọc ra các điện thoại nằm trong khoảng giá này.
* **Tìm kiếm theo tên:** Nhận đầu vào từ người dùng, duyệt qua ArrayList và sử dụng phương thức `contains` trên tên của mỗi điện thoại để tìm kiếm gần đúng.
  ss4_exercises.md
  2 KB