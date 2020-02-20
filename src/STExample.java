
import java.util.StringTokenizer;

public class STExample {

    public static void main(String[] args) {
        String s = "java,python;oracle,php;linux,mysql";
        StringTokenizer st = new StringTokenizer(s,",;", false);
        System.out.println(st.countTokens());
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
        System.out.println(st.countTokens());
        

    }
}
/*
    Constructor
    ----------------
    StringTokenizer(String)
    StringTokenizer(String,String)
    StringTokenizer(String,String,boolean)
        if you pass true in 3rd parameter
            delimeters will also be taken as a token
                
    Methods
    ----------------
    String nextToken()
    boolean hasMoreTokens()
    int countTokens()



*/
