import java.lang.StringBuffer;

public class Console {
    public static void main(String args[]){
        String s1 = "Hello";
        String s2 = "World";
        
        StringBuffer s1_B = new StringBuffer(s1);
        StringBuffer s2_B = new StringBuffer(s2);

        s1_B = s1_B.reverse();
        s2_B = s2_B.reverse();
        
        String output = s2_B + " " + s1_B;
        System.out.println(output);
    }
}
