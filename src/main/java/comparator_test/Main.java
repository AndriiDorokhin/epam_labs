package comparator_test;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Comparator<Person> personComparator = new PersonNameComparator().thenComparing(new PersonAgeComparator().reversed());

        TreeSet<Person> personTreeSet = new TreeSet<>(personComparator);
        personTreeSet.add(new Person("Andrey", 36));
        personTreeSet.add(new Person("Andrey", 35));
        personTreeSet.add(new Person("Andrey", 46));
        personTreeSet.add(new Person("Oleg", 36));
        personTreeSet.add(new Person("Andrey", 35));
        personTreeSet.add(new Person("Evgen", 36));
        personTreeSet.add(new Person("Evgen", 46));

//        System.out.println(personTreeSet);

        Iterator<Person> personIterator = personTreeSet.iterator();

        while (personIterator.hasNext())
            System.out.println(personIterator.next());
    }
}
