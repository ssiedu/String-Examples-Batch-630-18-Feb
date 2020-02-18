
public class Test {
    public static void main(String[] args) {

        Demo d=new Demo(10,20);
        d.print();
        //can you change x or y of above object now.
        
        d.setX(15);
        d.setY(25);
        d.print();
        /*
        String s1=new String("indore");
        StringBuffer s2=new StringBuffer("indore");
        System.out.println(s1);
        System.out.println(s2);
        */
    }
}
