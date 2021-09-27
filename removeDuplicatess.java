
public class removeDuplicatess {


    public static int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int i = 0;

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }

        return i + 1;
        // Time Complextiy: O(n)
        // Space Complexity: O(1)
    }

    public static void main (String[] args){

        System.out.println("what"+removeDuplicates(new int[]{1,1,1,1,1,1,2,2,2,2,2,2,3,3,3,4,5}));

    }
}