public class ArrayExample {

    public static void main(String[] args) {
        int[] arr = { 3, 4, 1 , 5, 2};
        int n = arr.length;

        System.out.println("Linear Traversal : ");
        for ( int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }

        System.out.println();
    }
    
}
