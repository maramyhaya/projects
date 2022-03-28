import java.util.Arrays;

/**
 * Created by TGC on 18/03/2022.
 */
public class ReversLab2Q1 {
    public static void main(String[] args) {
        int []o={10,20,30,40,50,60};

        int [] b=o;
        System.out.println("v="+ Arrays.toString((o)));
        System.out.println("w="+ Arrays.toString((b)));
    }
    public static int[] revers(int[]r)
    {
        int s= r.length-1;
        for (int i = 0; i < r.length/2; i++) {
            int t=r[i];
            r[i]=r[s-i];
            r[s-i]=t;
        }
        return r;
    }
}
