public class OderTest {
   
    public void printData(String[] arr){
        for(String str : arr){
            System.out.println(str);
        }
    }
    
    public static void main(String[] args) {
        OderTest ot = new OderTest();
        String[] arr = new String[2];
//        ot.initData(arr);
        ot.printData(arr);
    }
}

