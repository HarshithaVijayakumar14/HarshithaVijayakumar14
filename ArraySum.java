import java.util.Scanner;
import java.util.Arrays;
public class ArraySum{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the arry :");
        int size = scanner.nextint();
        int[]numbers = newInt[size];
        System.out.println("Enter" + size + "numbers:");
        for(int i = 0;i<size;i++)numbers[i] = scanner.nextInt();
        System.out.println("Entered array elements:"+ Arrays.toString(numbers));
        int Sum = 0;
        for(int num : numbers)sum += num;
        System.out.println("Sum of array elements:"+sum);
        scanner.close();    }
}
