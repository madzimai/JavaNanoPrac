import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;


public class Data{
    int value;
    Data(int value){
        this.value = value;
    }
    public String toString(){ return ""+value; }
    
    public static void main(String[] args) {
        Data[] dataArr = { new Data(1), new Data(2),
              new Data(3), new Data(4) };

        List<Data> dataList =  new ArrayList<>(Arrays.asList(dataArr)); 

      
            dataList.removeIf( d -> {
		boolean isEven = d.value % 2 == 0;

 		if(isEven){
		System.out.println("Removed" + d);
		}
		return isEven;

	});

            System.out.println("Remaing list " +dataList +", "); 
        
   }      
}
