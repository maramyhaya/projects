import java.util.Arrays;

/**
 * Created by TGC on 18/03/2022.
 */

//quation about copy Array
public class ReversLab2Q3 {
    public static void main(String[] args) {


System.out.println("copyArray="+Arrays.toString(copy()));


}
public static int []copy(){
    int [] f={1,2,3,4,5};
    int [] c=new int[f.length];
    c=f;
    return c;
}}