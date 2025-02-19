/*Which statements about the following code contained in BankAccount.java are correct?
answer: It will compile if class BankAccount provides an implementation for getId method.
*/
interface Account{
  public static String getId(){
     return "0000";
  }
}

interface PremiumAccount extends Account{
  public  String getId();
}

public class BankAccount implements PremiumAccount{
  public static void main(String[] args) {
      PremiumAccount acct = new BankAccount();
      System.out.println(acct.getId());
  }

public String getId(){
  return "new fix";
}
}
