public class ArrayExample06 {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50};
        int n = arr.length;

        for( int i = 0; i < n; i++) {
            arr[i] += 5;
        }

        System.out.println("Modified array : ");
        for ( int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
}
