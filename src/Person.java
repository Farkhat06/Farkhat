public class Person {
    private String name;
    private String surname;
    private int age;
    private boolean gender;

    public Person(String name, String surname, int age, boolean gender) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
    }

    private String genderToString() {
        return gender ? "Male" : "Female";
    }

    @Override
    public String toString() {
        return "Hi, I am " + name + " " + surname + ", a " + age + "-year-old " + genderToString() + ".";
    }

    public static void main(String[] args) {
        Person person = new Person("John", "Doe", 30, true);
        System.out.println(person.toString());
    }
}
