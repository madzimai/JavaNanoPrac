public class DaysTest{

    static String[] days = {"monday", "tuesday", "wednesday", "thursday",
    "friday", "saturday", "sunday" };
    
    public static void main(String[] args) {
        
        int index = 0;
        for(String day : days){
            
            if(index == 3){
                continue;
            }
		index++;                     

            if(days[index].length()>3){
                days[index] = day.substring(0,3);
            }
break;
        }
        System.out.println(days[index]);
    }
}
//if --else block is causing failure to compile because all code below is un reachable
/*
What will the following code print when compiled and run?
public class DaysTest{

    static String[] days = {"monday", "tuesday", "wednesday", "thursday",
    "friday", "saturday", "sunday" };
    
    public static void main(String[] args) {
        
        int index = 0;
        for(String day : days){
            
            if(index == 3){
                break;
            }else {
                 continue;
            }
            index++;
            if(days[index].length()>3){
                days[index] = day.substring(0,3);
            }
        }
        System.out.println(days[index]);
    }
}
*/
