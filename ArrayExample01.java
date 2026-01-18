public class ArrayExample01 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5};
        int n = arr.length;


        System.out.println("Reverse Traversal :");
        for ( int i = n - 1; i >= 0; i--) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }
    
}
