public static void print(List<? extends Number> list) {
  for (Number n : list)
  System.out.print(n + " ");
  System.out.println();
 } 
 