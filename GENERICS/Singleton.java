// error karena type parameter dipakai di public static
class Singleton<T> { 
 public static T getInstance() { 
 if (instance == null) 
 instance = new Singleton<T>(); 
 return instance; 
 } 
 private static T instance = null; 
}