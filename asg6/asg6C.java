import java.util.Scanner;

public class asg6C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        

        System.out.println("\n1. Bubble Sort\n2. Selection Sort\n3. Insertion Sort\n4. Exit");
            
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();


        switch (choice) {
            case 1:
                bubbleSort(arr);
                System.out.println("Sorted using Bubble Sort:");
                printArray(arr);
                break;
            case 2:
                selectionSort(arr);
                System.out.println("Sorted using Selection Sort:");
                printArray(arr);
                break;
            case 3:
                insertionSort(arr);
                System.out.println("Sorted using Insertion Sort:");
                printArray(arr);
                break;
            case 4:
                System.out.println("Exiting program.");
                break;
            default:
                System.out.println("Invalid choice. Try again.");
        }

        sc.close();
    }

    // Bubble Sort
    static void bubbleSort(int[] a) 
    {
        int n = a.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (a[j] > a[j + 1]) 
                {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
    }

    // Selection Sort
    static void selectionSort(int[] a) {
        int n = a.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++)
                if (a[j] < a[minIdx])
                    minIdx = j;
            int temp = a[minIdx];
            a[minIdx] = a[i];
            a[i] = temp;
        }
    }

    // Insertion Sort
    static void insertionSort(int[] a)
     {
        int n = a.length;
        for (int i = 1; i < n; i++) {
            int key = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > key) 
            {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = key;
        }
    }

    // Print Array
    static void printArray(int[] a) {
        for (int num : a)
            System.out.print(num + " ");
        System.out.println();
    }
}