import java.util.*;

class Displays {
    public void displayArray(int arr[], int size) {
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }
    }
}

class Sorting1 {
    public void bubbleSort(int arr[], int size) {
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}

public class BubbleSort1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Size of Array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the Array Elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Before Array Sorting: ");
        Displays displayObj = new Displays();
        displayObj.displayArray(arr, size);

        Sorting1 sortingObj = new Sorting1();
        sortingObj.bubbleSort(arr, size);

        System.out.println("After Array Sorting:");
        displayObj.displayArray(arr, size);
    }
}
