class ArrayOfTwoSum {
  public int[] resultingSum(int[] nums) {
     int n = nums.length;
     for(int i = 0; i <= n; i++) {
         if(nums[i] + nums[i+1] == 9) {
           System.out.println(int[]{i,i+1});
         }
      }
      return new int[]{};
   }
  public static void main(String[] args) {
    ArrayOfTwoSum r = new ArrayOfTwoSum();
    int[] nums = {1,2,3,4,5};
    int[] result = r.resultingSum(nums);
  }
}

     