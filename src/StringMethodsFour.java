
public class StringMethodsFour {
    public static void main(String[] args) {

        String cities="indore,bhopal,delhi,chennai";
        String s[]=cities.split("o");
        for(String city:s){
            System.out.println(city);
        }
        
        
        //String s1="java is powerful language and java is object oriented";
        //String s2=s1.replace('a', '@');
        //String s2=s1.replace("java", "python");
        //String s2=s1.substring(5,16);
        //System.out.println(s1);
        //System.out.println(s2);
        
        
        /*
        String s1="  this is java  ";
        System.out.println(s1.length());
        String s2=s1.trim();
        System.out.println("After Trim");
        System.out.println(s1.length());
        System.out.println(s2.length());
        */
        /*
        String s1="indore";
        System.out.println(s1);
        String s2=s1.toUpperCase();
        System.out.println("After Method  Call : ");
        System.out.println(s1);
        System.out.println(s2);
        */
    }
}
/*
    String toUpperCase()
    String toLowerCase()
    String trim();
    String substring(int)
    String substring(int,int)
    String replace(char,char) 
        truncates the leading and trailing white spaces.
        ------------------------------------------------

*/