package lesson_3_ArrayList;

import java.util.ArrayList;

//        - Создать класс Person с полями firstName, lastName, age
//        - Создать геттеры и сеттеры для каждого поля
//        - Создать класс Company с полями companyName, и списком сотрудников (это будет лист класса Person состоящий из например 10 предефайнутых (предопределенных) сотрудников)
//        - В классе Company создать метод который будет возвращать количество сотрудников;
//        - В классе Company создать метод который будет возвращать есть ли сотрудник с данным именем
//        - В классе Company создать метод который будет возвращать есть ли сотрудник с данной фамилией;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> tempEmployees = new ArrayList<>();

        tempEmployees.add(new Person("Andrey", "Dorokhin", 36));
        tempEmployees.add(new Person("Andrey", "Dorokhin", 36));
        tempEmployees.add(new Person("Andrey", "Dorokhin", 36));
        tempEmployees.add(new Person("Andrey", "Dorokhin", 36));
        tempEmployees.add(new Person("Andrey", "Dorokhin", 36));
        tempEmployees.add(new Person("Andrey", "Dorokhin", 36));
        tempEmployees.add(new Person("Andrey", "Dorokhin", 36));
        tempEmployees.add(new Person("Andrey", "Dorokhin", 36));
        tempEmployees.add(new Person("Andrey", "Dorokhin", 36));
        tempEmployees.add(new Person("Andrey", "Dorokhin", 36));

        Company myCompany = new Company("Bytes");
        myCompany.setEmployees(tempEmployees);

        myCompany.checkFirstName("Andrey");
        myCompany.checkFirstName("And");

        myCompany.checkLastName("Dorokhin");
        myCompany.checkLastName("Dor");

        myCompany.numberOfEmployeesInCompany();
    }
}

