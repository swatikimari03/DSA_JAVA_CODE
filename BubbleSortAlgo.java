public class BubbleSortAlgo {
    public static void main(String[] args) {

        int[] arr  = {5, 1, 4, 2, 8};
        int n = arr.length; 

        for ( int i = 0; i < n-1; i++) { // number of passes
            for ( int j = 0; j < n - i - 1; j++) { // comparisons

                if ( arr[j] > arr[j + 1 ] ) {

                    // swap

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[ j + 1] = temp;


                }

            }

        }

        // print sorted array 
        for ( int num : arr) {
            System.out.print(num + " ");
            
        }
    }
}