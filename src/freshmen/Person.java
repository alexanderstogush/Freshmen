package freshmen;

abstract class Person {

    private String firstName, lastName, sex;
    private int age;

    Person(String firstName, String lastName, int age, String  sex){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return firstName + " " + lastName;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }
}
