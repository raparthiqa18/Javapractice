package Pactice2.Java8;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
/*
Usage Of Java Stream API In Selenium – Retrieving Text From A List Of WebElements
http://makeseleniumeasy.com/2019/11/09/usage-of-java-stream-api-in-selenium-retrieving-text-from-a-list-of-webelements/
 */

public class Stream {

    public static void main(String[] args) {
        //Imperative programming
        List<Person> people=getPeople();
        List<Person> females;
        System.out.println(people);

//        for (Person p: people){
//            if (p.getGender().equals(Gender.FEMALE)){
//                females.add(p);
//            }
//        }
//       females.forEach(System.out::println);
//        //or
//        for (Person f: females){
//            System.out.println(f);
//        }

        //Declarative programming

        //Filter
        females=people.stream()
                .filter(person -> person.getGender().equals(Gender.FEMALE))
                .collect(Collectors.toList());
//        females.forEach(f-> System.out.println(f));
        females.forEach(System.out::println);
        System.out.println("******************************");

        //Sort
        //acscending
        List<Person> sorted=people.stream().sorted(Comparator.comparing(Person::getAge)).collect(Collectors.toList());
        //descending
//        List<Person> sorted=people.stream().sorted(Comparator.comparing(Person::getAge).reversed()).collect(Collectors.toList());
        //comparing
//        List<Person> sorted=people.stream().sorted(Comparator.comparing(Person::getAge).thenComparing(Person::getGender)).collect(Collectors.toList());
        sorted.forEach(System.out::println);
        System.out.println("******************************");
        //All match
        System.out.println(people.stream().allMatch(person->person.getAge()>5));

        //Any match
        System.out.println(people.stream().anyMatch(person->person.getAge()>20));
        //No Match
        System.out.println(people.stream().noneMatch(person->person.getAge()>20));
        //Max
        people.stream().max(Comparator.comparing(Person::getAge)).ifPresent(System.out::println);
        //Min
        people.stream().min(Comparator.comparing(Person::getAge)).ifPresent(System.out::println);
        //Group
        System.out.println(people.stream().collect(Collectors.groupingBy(Person::getGender)));

    }

    private static List<Person> getPeople(){
        return List.of(
                new Person("Tom", 29, Gender.MALE),
                new Person("Alina", 33, Gender.FEMALE),
                new Person("Bernie", 57, Gender.FEMALE),
                new Person("Alen", 14, Gender.MALE),
                new Person("Alan", 99, Gender.MALE),
                new Person("Rachel", 7, Gender.FEMALE),
                new Person("Pennie", 110, Gender.FEMALE)
        );
    }

}
