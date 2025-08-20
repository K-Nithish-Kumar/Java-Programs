class OneDArray {
  public int[] resultSum(int[] nums) {
    for(int i = 1; i < nums.length; i++) {
      nums[i] += nums[i-1];
    }
    return nums;
  }

public static void main(String[] args) {
     OneDArray d = new OneDArray();
     int[] nums = {1,2,3,4};
     int[] result = d.resultSum(nums);

     for(int num : result) {
       System.out.print(num + " ");
     }
}
}