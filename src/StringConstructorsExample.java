
public class StringConstructorsExample {
    
    public static void display(String s){
        System.out.println(s);
    }
    
    public static void main(String[] args) {
        String s=new String();
        String s1=new String("indore");
        char ch[]={'a','b','c','d','e','f','g','h'};
        byte b[]={65,66,67,68,69,70,71,72,73,74,75};
        String s2=new String(ch);
        String s3=new String(ch,1,3);
        String s4=new String(b);
        String s5=new String(b,0,5);
        display(s);
        display(s1);
        display(s2);
        display(s3);
        display(s4);
        display(s5);
    }
}
/*
    String class constructors
    -------------------------------
    String()
    String(String)
    String(char[])
    String(char[],int,int)
    String(byte[])
    String(byte[],int,int)
*/