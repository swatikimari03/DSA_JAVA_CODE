public class TwopointerExample04 {
    public static void main(String[] args) {

        int[] arr = { 0, 1, 0, 3, 12};
        int left = 0 , right = arr.length - 1;


        while(left < right) {
            if( arr[left] == 0 && arr[right] != 0) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
            if(arr[left] != 0) left++;
            if(arr[right] == 0) right--;
        }

        for( int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    
}
