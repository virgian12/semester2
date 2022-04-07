import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@SuppressWarnings("unchecked")
class percobaan8 implements Comparator {
 public int compare(Object obj1, Object obj2) {
 Person emp1 = (Person) obj1;
 Person emp2 = (Person) obj2;
 int nameComp = emp1.getFirstName().compareTo(emp2.getFirstName());
 return ((nameComp == 0) ? emp1.getLastName().compareTo(
 emp2.getLastName()) : nameComp);
 }
 public static void main(String args[]) {
 String names[] = { "Bart", "Hugo", "Lisa", "Marge", "Homer",
"Maggie",
 "Roy" };
 // Convert to list
 List list = new ArrayList(Arrays.asList(names));
 // Ensure list sorted
 Collections.sort(list);
 System.out.println("Sorted list: [length: " + list.size() + "]");
 System.out.println(list);
 // Search for element in list
 int index = Collections.binarySearch(list, "Maggie");
 System.out.println("Found Maggie @ " + index);
 // Search for element not in list
 index = Collections.binarySearch(list, "Jimbo Jones");
 System.out.println("Didn't find Jimbo Jones @ " + index);
 // Insert
 int newIndex = -index - 1;
 list.add(newIndex, "Jimbo Jones");
 System.out.println("With Jimbo Jones added: [length: " +
list.size()
 + "]");
 System.out.println(list);
 System.out.println(Collections.min(list));
 System.out.println(Collections.max(list)); 
 Comparator comp = Collections.reverseOrder();
 System.out.println(Collections.min(list, comp));
 System.out.println(Collections.max(list, comp));
 }
} 

class Person implements Comparable {
  String firstName, lastName;
  public Person(String f, String l) {
  this.firstName = f;
  this.lastName = l;
  }
  public String getFirstName() {
  return firstName;
  }
  public String getLastName() {
  return lastName;
  }
  public String toString() {
  return "[ name=" + firstName + ",name=" + lastName + "]";
  }
  public int compareTo(Object obj) {
  Person emp = (Person) obj;
  int deptComp = firstName.compareTo(emp.getFirstName());
  return ((deptComp == 0) ? lastName.compareTo(emp.getLastName())
  : deptComp);
  }
  public boolean equals(Object obj) {

    if (!(obj instanceof Person)) {
      return false;
      }
      Person emp = (Person) obj;
      return firstName.equals(emp.getFirstName())
      && lastName.equals(emp.getLastName());
      }
     } 
     