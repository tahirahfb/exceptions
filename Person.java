package ValidatingParameters;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        if(name.equals(null) || name.isEmpty() || name.length() > 40){
            throw new IllegalArgumentException("Name can't be null, empty, or greater than 40 characters!");
        }

        this.name = name;

        if(age < 0 || age > 120){
            throw new IllegalArgumentException("The age should be between 0 and 120!");
        }
        
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
