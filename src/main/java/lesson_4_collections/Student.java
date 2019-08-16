package lesson_4_collections;

public class Student extends Person{
//    id, Адрес, Телефон, Факультет, Курс, Группа.
    private int id;
    private String facultyName;
    private String courseName;
    private String groupeName;

    public int getId() {
        return id;
    }

    public String getFacultyName() {
        return facultyName;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getGroupeName() {
        return groupeName;
    }

    public Student(String name, String secondName, String fathersName, String birthdayDate, int id, String facultyName, String courseName, String groupeName) {
        super(name, secondName, fathersName, birthdayDate);
        this.id = id;
        this.facultyName = facultyName;
        this.courseName = courseName;
        this.groupeName = groupeName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                "name='" + getName() + '\'' +
                ", second name='" + getSecondName() + '\'' +
                ", fathers name='" + getFathersName() + '\'' +
                ", address='" + getAddress() + '\'' +
                ", phone number='" + getPhoneNumber() + '\'' +
                ", birthday='" + getBirthdayDate() + '\'' +
                ", faculty='" + facultyName + '\'' +
                ", course='" + courseName + '\'' +
                ", groupe='" + groupeName + '\'' +
                '}';
    }
}
