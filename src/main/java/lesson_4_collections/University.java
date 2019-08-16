package lesson_4_collections;

import java.util.ArrayList;
import java.util.List;

public class University {
    private String nameOfUniversity;
    private List<Student> studentsList;

    public List<Student> getStudentsListByFacultet (String facultetName) {
        return null;
    }

    public List<Student> getStudentsListByGroupe (String groupetName) {
        return null;
    }

    public List<Student> getStudentsListWhoBornAfter (String borneDate) {
        List<Student> studentsListWhoBornAfter = new ArrayList<>();

        for (Student student : studentsList) {
//            if (student.getBirthdayDate() > borneDate)
        }
        return null;
    }

    @Override
    public String toString() {
        return "University{" +
                "name='" + nameOfUniversity + '\'' +
                ", list of students {'" + studentsList + "}\'" +
                '}';
    }

//    b) списка студентов для каждого факультета и курса;

}
