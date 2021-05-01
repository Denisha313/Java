import java.util.ArrayList;

interface Visitable
{
 public void accept(Visitor visitor);
}

class Student implements Visitable
{

 private String nameOfStudent;

 private String healthStatus;

 public Student( String nameOfStudent )
 {
 super();
 this.nameOfStudent = nameOfStudent;
 }

 public String getName()
 {
 return nameOfStudent;
 }

 public String getHealthStatus()
 {
 return healthStatus;
 }

 public void setHealthStatus( String healthStatus )
 {
 this.healthStatus = healthStatus;
 }

 @Override
 public void accept( Visitor visitor )
 {
 visitor.visit(this);
 }

}

interface Visitor
{
 public void visit(Visitable visitable);
}

class Doctor implements Visitor
{

 private String nameOfDoctor;

 public Doctor( String nameOfDoctor )
 {
 super();
 this.nameOfDoctor = nameOfDoctor;
 }

 public String getName()
 {
 return nameOfDoctor;
 }

 @Override
 public void visit( Visitable visitable )
 {
 Student student = (Student) visitable;
 student.setHealthStatus("Bad");
 System.out.println("Doctor: '" + this.getName() + "' does the checkup of the student: '"
                 + student.getName()
                 + "' and Reported health is not good so updated the health status as 'Bad'\n");

 }

}





class School
{

 static ArrayList<Student> studentList;
 
 static
 {
 studentList = new ArrayList<Student>();

 Student kishan = new Student("Kishan");
 Student karan = new Student("Karan");
 Student vishal = new Student("Vishal");
 Student kapil = new Student("Kapil");

 studentList.add(kishan);
 studentList.add(karan);
 studentList.add(vishal);
 studentList.add(kapil);
 }
 
 
 public static void doHealthCheckup()
 {
 Doctor doctor = new Doctor("Dr.Sumit");
 for( Student student : studentList )
                {
                 student.accept(doctor);
                }
 }

}
public class VisitorDesignPattern {
	 public static void main( String[] args )
	 {
	 School.doHealthCheckup();
	 }

}
