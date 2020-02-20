
public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("abcdefgh");
        System.out.println(sb);
        //sb.append("XYZ");
        //sb.insert(2, "XYZ");
        sb.delete(1, 4);
        System.out.println(sb);
    }
}
