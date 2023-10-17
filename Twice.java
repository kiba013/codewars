package codewars;

import java.util.Arrays;

public class Twice {
    public static void main(String[] args) {
        int[] array = {1,1,1,3,3,4,3,2,4,2};
        contain(array);
    }

    public static void contain(int[] nums) {
        int number = 0;
        int[] array = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= number) {
                nums[i] = number;
                array[i] = number;
            }
        }
        System.out.println(Arrays.toString(array));
    }

}
