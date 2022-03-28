import java.util.Arrays;

/**
 * Created by TGC on 18/03/2022.
 */
public class Lab2Q2 {
    public static void main(String[] args) {
        System.out.println("copy the array="+ Arrays.toString(copy()));
    }
    public static int[] copy() {
        int[] m={10,92,34,42,51};
        int[] c=new int[m.length];
        c=m;
        return c;
    }
}
