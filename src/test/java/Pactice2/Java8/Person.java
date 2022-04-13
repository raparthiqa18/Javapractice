package Pactice2.Java8;

/*
POJO Object
https://www.softwaretestinghelp.com/types-of-classes-in-java/#:~:text=POJO%20class%3A%20This%20is%20%E2%80%9CPlain,one%20or%20more%20abstract%20methods.&text=Static%20class%3A%20A%20class%20containing%20only%20static%20members
 */
public class Person {

    private final String name;
    private final int age;
    private final Gender gender;

    public Person(String name, int age, Gender gender) {
        this.age = age;
        this.name = name;
        this.gender = gender;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public Gender getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }



}
