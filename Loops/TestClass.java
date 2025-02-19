class TestClass{
   public static void main(String args[]){
      boolean b = false;
      int i = 1;
      do{
         i++ ;
      } while (b = !b);
      System.out.println( i );
   }
}

/*
🔹 Why is the Output 3?
Loop runs twice:

First time: i becomes 2, b flips to true.
Second time: i becomes 3, b flips to false and loop stops.
Common Mistake:

b = !b is an assignment (=), NOT a condition (==).
This updates b rather than just checking its value.
*/
