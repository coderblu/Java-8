package streams;

import Data.Student;
import Data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {
        Predicate<Student> studentPredicate = (student -> student.getGradeLevel()>=3);
       Map<String, List<String>> studentMap = StudentDataBase.getAllStudents().stream()
               .filter((student -> student.getGradeLevel())>=3)
                .collect(Collectors.toMap(Student::getName,Student::getActivities));
        System.out.println(studentMap);
    }
}
