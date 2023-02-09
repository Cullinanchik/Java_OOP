public class Obolochka {
    public static void main(String[] args) {
        String s = "This is John. He is 27 years old.";
        String name = s.substring(8, 12);
        String age_s = s.substring(20,22);
        int age_int = Integer.parseInt(age_s);
        Person person = new Person(name, age_int);
        System.out.println(person.getName());
        System.out.println(person.getAge());
    }
}
