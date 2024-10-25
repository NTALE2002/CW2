import java.time.Year;

public class Student extends Person{
    String RegNo;
    int yearOfStudy;

    public Student(String firstName, String lastName, String gender, int yearOfBirth,int yearOfStudy,String RegNo) {
        super(firstName, lastName, gender, yearOfBirth);
        this.yearOfStudy=yearOfStudy;
        this.RegNo=RegNo;
    }

    @Override
    void talk() {
        System.out.println("Students are not allowed to talk in class");
    }

    @Override
    int calcAge() {
        return Year.now().getValue()-this.yearOfBirth;
    }

    @Override
    public void print() {
        super.print();
        System.out.printf("Year_Of_Study: %d\n RegNo: %s\n",yearOfStudy,RegNo);
        System.out.println(".........................................");
    }


}
