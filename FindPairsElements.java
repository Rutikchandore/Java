package DSAChallenge;
import java.util.*;

class TwoSum {
    public void findPairs(int arr[], int target) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println("Indexes: " + i + " & " + j + ", Elements: " + arr[i] + " & " + arr[j]);
                }
            }
        }
    }
}

public class FindPairsElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of Array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter Array Elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the Target Sum:");
        int target = sc.nextInt();

        TwoSum twoSum = new TwoSum();
        twoSum.findPairs(arr, target);
    }
}
