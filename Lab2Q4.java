import java.util.Arrays;
import java.util.Random;

/**
 * Created by TGC on 18/03/2022.
 */

//code about random
public class Lab2Q4 {
    public static void main(String[] args) {
        int [] z={1,2,3,4,5};
        System.out.println(Arrays.toString(r(z)));
    }
    public static int [] r(int[]x){
        Random r=new Random();
        int index=r.nextInt(x.length-1);
        System.out.println(index);
        for (int i = 0; i <x.length ; i++) {
         if (index<=i)
         {
             x[i]=-1;
         }

        }
        return x;
    }
}
