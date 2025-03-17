 interface  Info{
        void  start();
        default void took(){
        System.out.println("Haaa tora..");

        }
}

abstract class Whole implements Info{
        abstract void buy();

}

public class Machine extends Whole {
        @Override
        public void start(){
                System.out.println("Start it now .....");

        }
        @Override
        public void buy(){
        System.out.print("Lets buy now ......");
}
        public static void main(String[] args){
                Info info = new Machine();
                info.took();


                Machine mac = new Machine();
                mac.start();
                mac.buy();

        }


}
 
