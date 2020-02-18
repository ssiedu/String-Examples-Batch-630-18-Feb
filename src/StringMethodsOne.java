
public class StringMethodsOne {
    public static void main(String[] args) {
        String s1="indore";
        String s2="Indore";
        
        int n=s1.compareTo(s2);
        System.out.println(n);
        
        //String s="indiaonline";
        //String s="indoreonline";
        //boolean res=s.startsWith("ind");
        //System.out.println(res);
        //boolean res=s.endsWith("online");
        //System.out.println(res);
        
        /*
        //equals-equalsIgnoreCase
        String s1=new String("indore");
        String s2=new String("Indore");
        boolean b1=s1.equals(s2);//case-sensitive
        boolean b2=s1.equalsIgnoreCase(s2);//case-insensitive
        System.out.println(b1);
        System.out.println(b2);
        */
        
    }
}
/*
    String Methods (Non-Static) (we need to call them on String object)
    //comparison operations
    boolean equals(String)
    boolean equalsIgnoreCase(String)
    boolean startsWith(String)//checks the begining 
    boolean endsWith(String)//checks the end
    int compareTo(String)
    
        int n=s1.compareTo(s2);

        s1>s2   +ve no
        s1<s2   -ve no
        s1=s2   0


*/
