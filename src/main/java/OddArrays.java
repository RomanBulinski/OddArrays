import java.lang.reflect.Array;
import java.util.Arrays;

public class OddArrays {

    public int oddInt( int[] arr){

        Arrays.sort(arr);
        int start = 1;

        while( start < arr.length-1  ){
            if( arr[start-1]!=arr[start] ){
                return arr[start-1];
            }
            start = start+2;
        }
        return arr[arr.length-1];
    }

}
