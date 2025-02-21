public class DatabaseWrapper

{
 int x;
  static String url = "jdbc://derby://localhost:1527//mydb";
  static DatabaseWrapper getDatabase()
  {
     System.out.println("Getting DB");
     return null;
  }
  public static void main(String[ ] args)
  {
    System.out.println( getDatabase().url );
  //  System.out.println( this.x );non-static members cannot be access direct 
//in static main method
  }
}
