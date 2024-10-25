import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void message(Person person){
        person.talk();
    }
    public static void main(String[] args) {

     Student stud1=new Student("Aita","Ryan","Male",
                        2004,1,"23/UG/346/BSCE");
        Student stud2=new Student("Captain","Mwase","Male",
                2008,4,"23/UG/133/BSCS");
        Student stud3=new Student("Ariel","Wandera","Male",
                        2001,1,"23/UG/789/BSCS");
        Student stud4= new Student("Chol","Chol","Male",
                        2006,2,"23/UG/39/BSCS");

       List<Student> students=Arrays.asList(stud1,stud2,stud3,stud4);


         Teacher teach1=new Teacher("Francis","Bootstrap","Male",
                        1980,"OOAD","23/IUEA/890");
        Teacher  teach2=new Teacher("Kisakye","Babra","Female",
                        1987,"DBMS","23/IUEA/9876");
        Teacher  teach3= new Teacher("BazzeKetta","S","Male",
                        1990,"Java","23/898y");
        Teacher  teach4= new Teacher("Sunshine","Brown","female",
                        1994,"HR","23/8907");
        List<Teacher> teachers=Arrays.asList(teach1,teach2,teach3,teach4);


        ArrayList<Person> people=new ArrayList<>();
        people.addAll(teachers);
        people.addAll(students);

        people.stream().forEach(n->n.print());
        message(stud1);
        message(teach3);


    }
}