public class TwopointerExample02 {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 2, 1};
        int left = 0 , right = arr.length - 1;

        boolean isPalindrome = true;
        while( left < right) {
            if( arr[left] != arr[right]) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        if( isPalindrome) {
            System.out.println("the array is palindrome");
        } else {
            System.out.println("the array is not palindrome");
        }


    }
    
}
