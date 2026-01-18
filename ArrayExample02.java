public class ArrayExample02 {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50};
        int n = arr.length;

        System.out.println("Traversal using for loop");
        for ( int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }
    
}
