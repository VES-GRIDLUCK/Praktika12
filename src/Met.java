import java.util.Arrays;

public class Met {
    static int[] initArr(int a){
        int arr[] = new int[a];
        for (int i = 0; i < arr.length; i++){
            arr[i] = ((int)(Math.random()*10));
        }
        return arr;
    }
    static int sumArr(int[] initArr){

        int sum= 0;
        for (int i = 0; i < initArr.length;i++){
            sum = sum + initArr[i];
        }
        return sum;
    }
    static  int maxArr( int[] initArr){
        int max = Arrays.stream(initArr).max().getAsInt();
        return max;
    }

    static int sortArr( int[] initArr){
        
    }
}
