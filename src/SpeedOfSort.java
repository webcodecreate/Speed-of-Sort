import java.util.*;
import java.io.*;

public class SpeedOfSort {
    static void shuffleArray(int[] ar) {
        Random rnd = new Random();
        for (int j = ar.length - 1; j > 0; j--)
        {
            int index = rnd.nextInt(j + 1);
            int a = ar[index];
            ar[index] = ar[j];
            ar[j] = a;
        }
    }
    static void printArray(int arr[]) {
            int n = arr.length;
            for (int i=0; i<n; ++i)
                System.out.print(arr[i] + " ");
            System.out.println();
        }



    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Start of the program " + java.time.LocalTime.now());

        Scanner scanner = new Scanner(new File("textfile.txt"));
        int[] array = new int[1000];
        int n = array.length;
        int i = 0;
        while (scanner.hasNextInt()) {
            array[i++] = scanner.nextInt();
        }


            //Bubble Sort
            shuffleArray(array);
            System.out.println();
            long timeBubbleSortStart = new Date().getTime();

            BubbleSort bubbleSort = new BubbleSort();
            bubbleSort.bubbleSort(array);

            long timeBubbleSortFinish = new Date().getTime();
            long timeBubbleSort = timeBubbleSortFinish - timeBubbleSortStart;
            System.out.println("Bubble Sort time is " + timeBubbleSort);


        //Recursive Bubble Sort
        shuffleArray(array);
        System.out.println();
        long timeRecursiveBubbleSortStart = new Date().getTime();

        RecursiveBubbleSort recursiveBubbleSort = new RecursiveBubbleSort();
        recursiveBubbleSort.bubbleSort(array, n);

        long timeRecursiveBubbleSortFinish = new Date().getTime();
        long timeRecursiveBubbleSort = timeRecursiveBubbleSortFinish - timeRecursiveBubbleSortStart;
        System.out.println("Recursive Bubble Sort time is " + timeRecursiveBubbleSort + " milliseconds");


            //Selection Sort
            shuffleArray(array);
            System.out.println();
            long timeSelectionSortStart = new Date().getTime();

            SelectionSort selectionSort = new SelectionSort();
            selectionSort.sort(array);

            long timeSelectionSortFinish = new Date().getTime();
            long timeSelectionSort = timeSelectionSortFinish - timeSelectionSortStart;
            System.out.println("Selection Sort time is " + timeSelectionSort + " milliseconds");


        //Insertion Sort
        shuffleArray(array);
        System.out.println();
        long timeInsertionSortStart = new Date().getTime();

        InsertionSort insertionSort = new InsertionSort();
        insertionSort.sort(array);

        long timeInsertionSortFinish = new Date().getTime();
        long timeInsertionSort = timeInsertionSortFinish - timeInsertionSortStart;
        System.out.println("Insertion Sort time is " + timeInsertionSort + " milliseconds");


            //Recursive Insertion Sort
            shuffleArray(array);
            System.out.println();
            long timeRecursiveInsertionSortStart = new Date().getTime();

            RecursiveInsertionSort recursiveInsertionSort = new RecursiveInsertionSort();
            recursiveInsertionSort.sort(array, n);

            long timeRecursiveInsertionSortFinish = new Date().getTime();
            long timeRecursiveInsertionSort = timeRecursiveInsertionSortFinish - timeRecursiveInsertionSortStart;
            System.out.println("Recursive Insertion Sort time is " + timeRecursiveInsertionSort + " milliseconds");


        //Merge Sort
        shuffleArray(array);
        System.out.println();
        long timeMergeSortStart = new Date().getTime();

        MergeSort mergeSort = new MergeSort();
        mergeSort.sort(array, 0, n - 1);

        long timeMergeSortFinish = new Date().getTime();
        long timeMergeSort = timeMergeSortFinish - timeMergeSortStart;
        System.out.println("Merge Sort time is " + timeMergeSort + " milliseconds");


            //Recursive Merge Sort
            shuffleArray(array);
            System.out.println();
            long timeRecursiveMergeSortStart = new Date().getTime();

            RecursiveMergeSort recursiveMergeSort = new RecursiveMergeSort();
            recursiveMergeSort.sort(array);

            long timeRecursiveMergeSortFinish = new Date().getTime();
            long timeRecursiveMergeSort = timeRecursiveMergeSortFinish - timeRecursiveMergeSortStart;
            System.out.println("Recursive Merge Sort time is " + timeRecursiveMergeSort + " milliseconds");


        //Quick Sort
        shuffleArray(array);
        System.out.println();
        long timeQuickSortStart = new Date().getTime();

        QuickSort quickSort = new QuickSort();
        quickSort.sort(array, 0, n-1);

        long timeQuickSortFinish = new Date().getTime();
        long timeQuickSortSort = timeQuickSortFinish - timeQuickSortStart;
        System.out.println("Quick Sort time is " + timeQuickSortSort + " milliseconds");


            //Iterative Quick Sort
            shuffleArray(array);
            System.out.println();
            long timeIterativeQuickSortStart = new Date().getTime();

            IterativeQuickSort iterativeQuickSort = new IterativeQuickSort();
            iterativeQuickSort.sort(array, 0, n-1);

            long timeIterativeQuickSortFinish = new Date().getTime();
            long timeIterativeQuickSort = timeIterativeQuickSortFinish - timeIterativeQuickSortStart;
            System.out.println("Iterative Quick Sort time is " + timeIterativeQuickSort + " milliseconds");


        //Recursive Quick Sort
        shuffleArray(array);
        System.out.println();
        long timeRecursiveQuickSortStart = new Date().getTime();

        RecursiveQuickSort recursiveQuickSort = new RecursiveQuickSort();
        recursiveQuickSort.sort(array, 0, n-1);

        long timeRecursiveQuickSortFinish = new Date().getTime();
        long timeRecursiveQuickSort = timeRecursiveQuickSortFinish - timeRecursiveQuickSortStart;
        System.out.println("Recursive Quick Sort time is " + timeRecursiveQuickSort + " milliseconds");


            //Heap Sort
            shuffleArray(array);
            System.out.println();
            long timeHeapSortStart = new Date().getTime();

            HeapSort heapSort = new HeapSort();
            heapSort.sort(array);

            long timeHeapSortFinish = new Date().getTime();
            long timeHeapSort = timeHeapSortFinish - timeHeapSortStart;
            System.out.println("Heap Sort time is " + timeHeapSort + " milliseconds");


        //Radix Sort
        shuffleArray(array);
        System.out.println();
        long timeRadixSortStart = new Date().getTime();

        RadixSort radixSort = new RadixSort();
        radixSort.sort(array, n);

        long timeRadixSortFinish = new Date().getTime();
        long timeRadixSort = timeRadixSortFinish - timeRadixSortStart;
        System.out.println("Radix Sort time is " + timeRadixSort + " milliseconds");


            //Shell Sort
            shuffleArray(array);
            System.out.println();
            long timeShellSortStart = new Date().getTime();

            ShellSort shellSort = new ShellSort();
            shellSort.sort(array);

            long timeShellSortFinish = new Date().getTime();
            long timeShellSort = timeShellSortFinish - timeShellSortStart;
            System.out.println("Shell Sort time is " + timeShellSort + " milliseconds");


        //Comb Sort
        shuffleArray(array);
        System.out.println();
        long timeCombSortStart = new Date().getTime();

        CombSort combSort = new CombSort();
        combSort.sort(array);

        long timeCombSortFinish = new Date().getTime();
        long timeCombSort = timeCombSortFinish - timeCombSortStart;
        System.out.println("Comb Sort time is " + timeCombSort + " milliseconds");


        System.out.println();
        System.out.println("Finish of the program " + java.time.LocalTime.now());
    }
}
