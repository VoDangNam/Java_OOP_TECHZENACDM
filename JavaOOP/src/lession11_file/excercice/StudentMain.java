package lession11_file.excercice;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class StudentMain {
    private static final Logger logger = Logger.getLogger(StudentMain.class.getName());
    private static final String path = "JavaOOP/src/lession11_file/data/student.csv";

    public static void main(String[] args) {
        showList();
        created();
        showList();
    }

    public static List<Student> readFile(String path) {
        File file = new File(path);
        List<Student> students = new ArrayList<>();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            bufferedReader.readLine(); //Bo dong dau di
            String line;
            Student student;
            while ((line = bufferedReader.readLine()) != null) {
                String[] data = line.split(",");
                student = new Student();
                student.setId(data[0]);
                student.setName(data[1]);
                student.setScore(Double.parseDouble(data[2]));
                students.add(student);
            }
        } catch (IOException e) {
            logger.log(Level.SEVERE, ">>>Doc file that bai");
        }
        return students;
    }

    public static void showList() {
        List<Student> students = readFile(path);
        for (Student student : students) {
            System.out.println("Thong tin sinh vien voi ID la: " + student.getId());
            student.output();
            System.out.println("===============");
        }
    }

    public static void writeFile(List<Student> listStudent) {
        StringBuilder stringBuilder = new StringBuilder("id,name,score");
        for (Student student : listStudent) {
            stringBuilder.append("\n").append(student.toString());
        }
        File file = new File(path);
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path))) {
            bufferedWriter.write(stringBuilder.toString());
        } catch (IOException e) {
            logger.log(Level.SEVERE, ">>>Loi khi ghi file!!!");
        }
    }

    public static void created() {
        List<Student> students = readFile(path);

        Student student = new Student();
        student.input();
        students.add(student);

        writeFile(students);
    }

}
