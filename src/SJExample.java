
import java.util.StringJoiner;

public class SJExample {
    public static void main(String[] args) {
        
        String cities[]={"indore","chennai","bhopal","mumbai"};
    
        //StringJoiner sj=new StringJoiner(",");
        StringJoiner sj=new StringJoiner("#","--->","<---");
        for(String city:cities){
            sj.add(city);
        }
        
        String info=sj.toString();
        //info="["+info+"]";
        
        System.out.println(info);
        /*
        String info="";
        for(String city:cities){
            info=info+city+",";
        }
        System.out.println(info);    
        */
            
    }
}
