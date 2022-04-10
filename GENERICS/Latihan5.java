public class Latihan5{
class Shape { /* ... */ } 
class Circle extends Shape { /* ... */ } 
class Rectangle extends Shape { /* ... */ } 
class Node<T> { /* ... */ } 
 
Node<Circle> nc = new Node<>(); 
Node<Shape> ns = nc;

}