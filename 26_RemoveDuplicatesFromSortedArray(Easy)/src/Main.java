import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 2, 3, 3};
        int k = removeDuplicates(numbers);
        System.out.println("The first " + k + " elements are unique");
        Arrays.stream(numbers).forEach(num -> System.out.print(num + " "));

    }

    public static int removeDuplicates(int[] nums) {
        int k = 1;
        for ( int i = 1; i<nums.length; i++) {
            if (nums[i-1] != nums[i]) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }

}
