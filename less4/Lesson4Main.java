package less4;

import less4.controller.StudentController;
import less4.controller.TeatcherController;
import less4.model.Student;
import less4.model.Teatcher;

import java.util.List;

public class Lesson4Main {

    public static void main(String[] args) {

        new TeatcherController()
                .sendOnConsole(List.of(new Teatcher(1, "Sasha", "Ivanov"),
                        new Teatcher(1, "Ira", "Ivanova")));

    }

//    private static List<Student> getStudents() {
//        Student s1 = new Student(1, "Sasha", "Ivanov");
//        Student s2 = new Student(1, "Ira", "Ivanova");
//        return List.of(s1, s2);
//    }
}
