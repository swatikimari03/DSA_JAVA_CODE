public class TwopointerExample03 {
    public static void main(String[] args) {

        int[] arr = { 5, 1, 3, 7, 2, 8, 4};
        int target = 9;
        int left = 0 , right = arr.length - 1;

        while( left < right) {
            int sum = arr[left] + arr[right];
            if( sum == target) {
                System.out.println(arr[left] + "," + arr[right]);
                break;
            }
            else if( sum < target)
                left++;
            else 
                right--;
        }

        
    }
    
}
