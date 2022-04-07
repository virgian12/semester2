import java.util.*;

class Employee{

 private int age;
 private String name;

 public void setAge(int age){
 this.age=age;
 }

 public int getAge(){
 return this.age;
 }

 public void setName(String name){
 this.name=name;
 }

 public String getName(){
 return this.name;
 }
}

class AgeComparator implements Comparator{

 public int compare(Object emp1, Object emp2){

 int emp1Age = ((Employee)emp1).getAge();
 int emp2Age = ((Employee)emp2).getAge();

 if(emp1Age > emp2Age)
 return 1;
 else if(emp1Age < emp2Age)
 return -1;
 else
 return 0; 
}
}

class NameComparator implements Comparator{

 public int compare(Object emp1, Object emp2){

 //parameter are of type Object, so we have to downcast it to
Employee objects

 String emp1Name = ((Employee)emp1).getName();
 String emp2Name = ((Employee)emp2).getName();

 //uses compareTo method of String class to compare names of the
employee
 return emp1Name.compareTo(emp2Name);
 }
}

public class JavaComparatorExample{

 public static void main(String args[]){

 //Employee array which will hold employees
 Employee employee[] = new Employee[2];

 //set different attributes of the individual employee.
 employee[0] = new Employee();
 employee[0].setAge(40);
 employee[0].setName("Joe");

 employee[1] = new Employee();
 employee[1].setAge(20);
 employee[1].setName("Mark");

 System.out.println("Order of employee before sorting is");
 //print array as is.
 for(int i=0; i < employee.length; i++){
 System.out.println( "Employee " + (i+1) + " name :: " +
employee[i].getName() + ", Age :: " + employee[i].getAge());
 }

 //Sorting array on the basis of employee age by passing
AgeComparator
 Arrays.sort(employee, new AgeComparator());
 System.out.println("\n\nOrder of employee after sorting by
employee age is");

 for(int i=0; i < employee.length; i++){
 System.out.println( "Employee " + (i+1) + " name :: " +
employee[i].getName() + ", Age :: " + employee[i].getAge());
 } 
//Sorting array on the basis of employee Name by passing
NameComparator
 Arrays.sort(employee, new NameComparator());

 System.out.println("\n\nOrder of employee after sorting by
employee name is");
 for(int i=0; i < employee.length; i++){
 System.out.println( "Employee " + (i+1) + " name :: " +
employee[i].getName() + ", Age :: " + employee[i].getAge());
 }

 }

} 
