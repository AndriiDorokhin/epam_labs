package lesson_3_ArrayList;

import java.util.ArrayList;

public class Company {
    private String companyName;
    private ArrayList<Person> employees;

    public ArrayList<Person> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<Person> employees) {
        this.employees = employees;
    }

    public String getCompanyName() {
        return companyName;
    }

    public Company (String companyName) {
        this.companyName = companyName;
    }

    public boolean checkFirstName (String firstNameForChecking) {
        boolean isHas = false;

        for (Person employe : this.employees) {
            if (employe.getFirstName().equals(firstNameForChecking)) {
                isHas = true;
                break;
            }
        }

        System.out.printf("Has company employe with firstname: %s ->", firstNameForChecking);
        System.out.println(isHas);

        return isHas;
    }

    public boolean checkLastName (String lastNameForChecking) {
        boolean isHas = false;

        for (Person employe : this.employees) {
            if (employe.getLastName().equals(lastNameForChecking))
                isHas = true;
        }

        System.out.printf("Has company employe with lastname: %s ->", lastNameForChecking);
        System.out.println(isHas);

        return isHas;
    }

    public int numberOfEmployeesInCompany () {
        System.out.println("Number Of Employees In Company -> " + getEmployees().size());

        return getEmployees().size();
    }
}
