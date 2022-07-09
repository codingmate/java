package main.app;

public class SortingApp {
    
    static final int[][] INT_CASES = { {10, 9, 8, 7, 6, 5, 4, 3, 2, 1}
                                     , {10, 9, 8, 7, 6, 5, 4, 3, 2, 1}
                                     , {10, 9, 8, 7, 6, 5, 4, 3, 2, 1}
                                     , {10, 9, 8, 7, 6, 5, 4, 3, 2, 1}
                                     };
    public static void main (String[] args) {
        selectionSort(INT_CASES[0]);
        System.out.println();
        for ( int e : INT_CASES[0])
            System.out.print(e + " ");
        bubbleSort(INT_CASES[1]);
        System.out.println();
        for ( int e : INT_CASES[1])
            System.out.print(e + " ");
    }

    public static void bubbleSort(int[] arr) {
        int repeatCount = 0;
        int swapCount = 0;
        long startDt = System.currentTimeMillis();
        boolean isSorted = false;
        while ( !isSorted ) {
            isSorted = true;
            for ( int i = 0 ; i < arr.length - 1; i++ ) {
                repeatCount++;
                if ( arr[i] > arr[i+1] ) {
                    isSorted = false;
                    swapCount++;
                    swap(arr, i, i+1);
                } // if
            } // for
        } // while
        
        printSortResult( "Bubble Sort) Result : "
                       , (startDt - System.currentTimeMillis())
                       , repeatCount
                       , swapCount
                       );
    }

    public static void selectionSort(int[] arr) {
        int repeatCount = 0;
        int swapCount = 0;
        long startDt = System.currentTimeMillis();
        for ( int i = 0; i < arr.length; i++ ) {
            for ( int j = i + 1; j < arr.length; j++ ) {
                repeatCount++;
                if ( arr[i] > arr[j] ) {
                    swapCount++;
                    swap(arr, i, j);
                } // if
            } // for
        } // for
        printSortResult( "Selection Sort) Result : "
                       , (startDt - System.currentTimeMillis())
                       , repeatCount
                       , swapCount
                       );
    }
    public static void printSortResult(String s, long mills, int repeatCount, int swapCount) {
        System.out.printf("\n%s 총 소요 시간 : %d, 반복 횟수 : %d, 변경 횟수 : %d\n"
                         , s
                         , mills
                         , repeatCount
                         , swapCount);
    }
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
