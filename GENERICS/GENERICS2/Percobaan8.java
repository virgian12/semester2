import java.util.*;
import java.io.*;

class BoxImpl<T> implements Box<T> {
  private T element;
  public T get() {
  return element;
  }
  public void put(T element) {
  this.element = element;
  }
 } 
 
 public class Percobaan8 {
  public static void main(String[] args) {
  BoxKu<Integer> bIn = new BoxKu<Integer>(7);
  BoxKu<Number> bNum = new BoxKu<Number>(10);
 
  System.out.println(bIn.toString());
  System.out.println(bNum.toString()); 

  bIn.copyTo(bNum);

 System.out.println(bIn.toString());
 System.out.println(bNum.toString());
 }
} 
