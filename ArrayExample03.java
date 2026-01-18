public class ArrayExample03 {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1};
        int n = arr.length;
        int i = 0;

        System.out.println("Traversal using while loop : ");
        while ( i < n) {
            System.out.println(arr[i] + " ");
            i++;
        }
        System.out.println();
    }
    
}
