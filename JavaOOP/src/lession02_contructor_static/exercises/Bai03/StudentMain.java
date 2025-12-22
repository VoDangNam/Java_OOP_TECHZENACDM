package lession02_contructor_static.exercises.Bai03;

public class StudentMain {
    public static void main(String[] args) {
        Student s = new Student(0, "", -5);
        Student s2 = new Student();

        Student s3 = new Student();
        Student s4 = new Student();

        s.setName("   ");
        s.setScore(11);
        s.ouputStd();


        s2.setName("Nam");
        s2.setScore(10);
        s2.ouputStd();

        s3.setName("Nam");
        s3.setScore(10);
        s3.ouputStd();

        s4.setName("Nam4");
        s4.setScore(10);
        s4.ouputStd();
    }
}
