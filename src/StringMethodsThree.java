
public class StringMethodsThree {
    public static void main(String[] args) {
        //String s="this is java code";
        
        String s="ABCDEF";
        byte b[]=s.getBytes();
        for(byte val:b){
            System.out.println(val);
        }
        
        /*
        String s="this is java code";
        int count=0;
        char chars[]=s.toCharArray();
        for(char ch:chars){
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                count++;
            }
        }
        */
        /*
        for(int i=0; i<s.length(); i++){
            char ch=s.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                count++;
            }
        }
        */
        //System.out.println("TOTAL VOWELS : "+count);
    }
}
/*
    char charAt(int)
    char[] toCharArray();
    byte[] getBytes()
*/
