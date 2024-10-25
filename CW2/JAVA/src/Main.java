import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void printHello(Person person){
        if(person.getClass().getName()=="Student"){
            System.out.println("I am a student");
        }else{
            System.out.println("I am a Teacher");
        }
    }
    public static void main(String[] args) {

     Student stud1=new Student("Ntale","Swamad","Male",
                        2002,2,"23/UG/346/BIT-S");
        Student stud2=new Student("Alexander","Mwase","Male",
                2000,2,"23/UG/133/BIT-S");
        Student stud3=new Student("Arafat","Kyazze","Male",
                        2003,2,"23/UG/1302/BIT-S");
        Student stud4= new Student("Chol","Chol","Male",
                        2002,2,"23/UG/390/BIT-S");

       List<Student> students=Arrays.asList(stud1,stud2,stud3,stud4);


         Teacher teach1=new Teacher("Francis","Bootstrap","Male",
                        1980,"OOAD","23/IUEA/890");
        Teacher  teach2=new Teacher("Kisakye","Babra","Female",
                        1987,"DBMS","23/IUEA/9876");
        Teacher  teach3= new Teacher("BazzeKetta","S","Male",
                        1990,"Java","23/898y");
        Teacher  teach4= new Teacher("Sunshine","Brown","female",
                        1994,"HR","23/8907");
        List< Teacher > teachers=Arrays.asList(teach1,teach2,teach3,teach4);


        ArrayList<Person> people=new ArrayList<>();
        people.addAll(teachers);
        people.addAll(students);

        people.stream().forEach(n->n.print());
        
        printHello(teach1);
        printHello(stud1);


    }
}