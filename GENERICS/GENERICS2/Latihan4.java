interface Box<T> {
  public T get();
  public void put(T element);
  public void put(Box<? extends T> box);
 } 
 

 public class Latihan4 {
  public static void main(String[] args) {
  Box<Number> nBox = new BoxImpl<Number>();
  Box<Integer> iBox = new BoxImpl<Integer>();
  nBox.put(iBox); // ERROR
  }
 } 
 