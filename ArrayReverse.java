package academy.devonline.java.basic.section01_setup.section06_setup;

import java.util.Arrays;

public class ArrayReverse {
    public static void main(String[] args) {
        int [] Array ={1,2,3,4,5,6};
        for (int i = 0; i < Array.length/2; i++) {
            var temp = Array[i];
            Array[i]=Array[Array.length-i-1];
            Array[Array.length-i-1]= temp;
        }
        System.out.println(Arrays.toString(Array));
    }
}
