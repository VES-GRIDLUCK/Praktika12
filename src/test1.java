import java.util.Arrays;
import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int arr[] = Met.initArr(a);
        int sumArr = Met.sumArr(arr);
        int maxArr = Met.maxArr(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(sumArr);
        System.out.println(maxArr);
    }
}
