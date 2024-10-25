 abstract public class Person {
    String firstName;
    String lastName;
    String gender;
    int yearOfBirth;

    public Person(String firstName, String lastName, String gender, int yearOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.yearOfBirth = yearOfBirth;
    }
    abstract void talk();
    abstract int calcAge();

    public void print(){
        System.out.printf("firstName: %s\n lastName: %s\n Gender: %s\n YearOfBirth: %d\n Age: %d \n" +
                "",firstName,lastName,gender,yearOfBirth,calcAge());
    }


}
