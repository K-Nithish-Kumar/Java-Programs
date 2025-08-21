import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

public class ArrayOfSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> pairIdx = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            
            if (pairIdx.containsKey(target - num)) {
                return new int[] {i, pairIdx.get(target - num)};
            }
            
            pairIdx.put(num, i);
        }
        
        return new int[] {}; // return empty array if no solution found
    }

    // main method to test
    public static void main(String[] args) {
        ArrayOfSum sol = new ArrayOfSum();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        
        int[] result = sol.twoSum(nums, target);
        
        if (result.length > 0) {
            System.out.println("Indices: " + Arrays.toString(result));
        } else {
            System.out.println("No two numbers found!");
        }
    }
}

     
  

   