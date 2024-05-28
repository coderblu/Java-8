package FunctionalInterface;

import Data.Student;
import Data.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void printName()
    {
        Consumer<Student> c2 = (student) -> {
            System.out.println(student);
        };
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(c2);
    }
    public static void main(String[] args) {
        Consumer<String> c1 = (s) -> {
            System.out.println(s.toUpperCase());
        };
    }
}
