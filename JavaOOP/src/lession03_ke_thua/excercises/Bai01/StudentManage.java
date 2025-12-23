package lession03_ke_thua.excercises.Bai01;

public class StudentManage {
    public static void main(String[] args) {
        Student s1 = new Student("SV01", "Nam", 8.5);
        Student s2 = new Student("SV02", "An", 7.0);
        Student s3 = new Student("SV03", "Bình", 9.0);
        Student s4 = new Student("SV04", "Nam", 8.5);
        Student s5 = new Student("SV05", "An", 7.0);
        Student s6 = new Student("SV06", "Bình", 9.0);
        System.out.println("So luong sinh vien: "+Student.getStudentCount());
    }
}
