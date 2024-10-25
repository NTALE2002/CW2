import java.time.Year;

public class Teacher extends Person{
    String expertise;
    String EmployeeID;

    public Teacher(String firstName, String lastName, String gender,
                   int yearOfBirth,
                   String expertise,String employeeID) {
        super(firstName, lastName, gender, yearOfBirth);
        this.EmployeeID=employeeID;
        this.expertise=expertise;
    }


    @Override
    void talk() {
        System.out.println("He/she can talk in class");
    }

    @Override
    int calcAge() {
        return Year.now().getValue()-yearOfBirth;
    }



    @Override
    public void print() {
        super.print();
        System.out.printf("Expertise: %s\n EmployeeID: %s \n ",expertise,EmployeeID);
        System.out.println(".........................................");
    }
}
