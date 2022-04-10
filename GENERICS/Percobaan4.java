public class Percobaan4 { 
    public static<E> void printArray(E[] inputArray){ 
        for(E element : inputArray) 
        System.out.printf("%s",element); 
     System.out.println(""); 
     } 
     public static void main(String[] args) { 
         Integer[] intArray = {1,2,3,4,5} ; 
         Double[] doubleArray = {1.1,2.2,3.3,4.4,5.5}; 
         Character[] charArray = {'J','A','V','A'}; 
         printArray(intArray); 
         printArray(doubleArray); 
         printArray(charArray); 
           } 
} 