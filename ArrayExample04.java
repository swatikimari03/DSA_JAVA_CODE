public class ArrayExample04 {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1};

        System.out.println("Traversal using forEach loop :");
        for ( int value : arr) {
            System.out.println(value + " ");
        }
        System.out.println();
    }
    
}
