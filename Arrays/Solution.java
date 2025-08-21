class ArrayOfTwoSum {
  public int[] resultingSum(int[] nums) {
     int n = nums.length;
     for(int i = 0; i < n; i++) {
         if(nums[i] + nums[i+1] == 9) {
           System.out.println(i + i+1);
         }
      }
   }
  public static void main(String[] args) {
    resultingSum r = new resultingSum();
    int[] nums = {1,2,3,4,5};
    int[] result = r.resultingSum(nums);
  }
}

     