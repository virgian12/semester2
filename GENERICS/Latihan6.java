public class Latihan6{
    class Node<T> implements Comparable<T> { 
    public int compareTo(T obj) { /* ... */ } 
    // ... 
    } 
    Node<String> node = new Node<>(); 
    Comparable<String> comp = node; 

}