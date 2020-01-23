package generics;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.*;

public class WildCard {
    public static void main(String[] args) {
        List<? extends Number> numbers0 = new ArrayList<Number>();

        Number[] number = new Integer[]{1,2,3};
//        Integer i = number[0]; will compilation error
        System.out.println(number[0].getClass());


        // producer
        List<? extends Number> numbers = new ArrayList<Double>();
//        numbers.add(1);
//        numbers.add(1L);
//        numbers.add(1F); можем доб-ть ток тип Number
        numbers.add(null);
        // consumer
        List<? super Number> numbers1 = new ArrayList<Object>();
        Number number1 = 1;
        numbers1.add(number1);
        numbers1.add(1);
        numbers1.add(1L);
        numbers1.add(1F);
        numbers1.add(null);

        List<Person> people = Arrays.asList(new Person("A", 1), new Person("B", 2));
        List<Student> students = Arrays.asList(new Student("sdf", 1,2)
                                             , new Student("zxc", 2,2)
                                             , new Student("tyu", 2,2));

        Comparator<Person> sortByName = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.name.compareTo(o2.name);
            }
        };

        Comparator<Student> sortByYear = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return Integer.compare(o1.year, o2.year);
            }
        };

        sortBy(students, sortByName);

        for (Person p : students) {
            System.out.println(p.name);
        }

        sortBy(students, sortByYear);


    }

    static void sortBy(List<? extends Person> people, Comparator<Person> comparator) {
        Collections.sort(people, comparator);
    }

    @Data
    @AllArgsConstructor
    @EqualsAndHashCode
    static class Person {
        String name;
        int age;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    static class Student extends Person {
        int year;

        public Student(String name, int age, int year) {
            super(name, age);
            this.year = year;
        }
    }

}
