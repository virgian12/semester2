interface Box<T> {
  public T get();
  public void put(T element);
  public void put(Box<T> box);
 } 
 
 

 public class BoxImpl<T> implements Box<T> {
  private T element ;
  public T get() {
    return element;
  }
  public void put(T element) {
    this.element=element;
  }
  public void put(Box<T> box) {
    this.element=(T)box;
  }
 
 } 

 public class Latihan3 {
  public static void main(String[] args) {
  Box<Number> nBox = new BoxImpl<Number>();
  Box<Integer> iBox = new BoxImpl<Integer>();
  nBox.put(iBox); // ERROR
  }
 } 
 