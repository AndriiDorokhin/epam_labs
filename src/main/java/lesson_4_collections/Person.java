package lesson_4_collections;

public class Person {
    private String name, secondName, fathersName;
    private String address;
    private String phoneNumber;
    private String birthdayDate;

    public Person(String name, String secondName, String fathersName, String birthdayDate) {
        this.name = name;
        this.secondName = secondName;
        this.fathersName = fathersName;
        this.birthdayDate = birthdayDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getFathersName() {
        return fathersName;
    }

    public String getBirthdayDate() {
        return birthdayDate;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", second name='" + secondName + '\'' +
                ", fathers name='" + fathersName + '\'' +
                ", address='" + address + '\'' +
                ", phone number='" + phoneNumber + '\'' +
                ", birthday='" + birthdayDate + '\'' +
                '}';
    }
}
