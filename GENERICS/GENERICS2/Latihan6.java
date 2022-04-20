interface Box<T> {
  public T get();
  public void put(T element);
  public void put(Box<? extends T> box);
  EqualityComparator<T> comparator) other,
  public interface EqualityComparator<T> {
  public boolean compare(T first, T second);
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

 public class Latihan6 {
  public static EqualityComparator<Object> sameObject = new
EqualityComparator<Object>() {
 public boolean compare(Object o1, Object o2) {
 return o1 == o2;
 }
 }; 

  
  public static void main(String[] args) {
  Box<Number> nBox = new BoxImpl<Number>();
  Box<Integer> iBox = new BoxImpl<Integer>();
  nBox.put(iBox);
  
  boolean b = nBox.containsSame(iBox, sameObject);
  }
 } 
 