import java.util.Arrays;
class OneDimensionalArray {
    public static int[] IterationThrough1DArr(int[] arr){
       for(int i = 0; i < arr.length; i++) {
           System.out.println(arr[i]);
       }
       return arr;
    }
    public static void main(String args[]) {
        OneDimensionalArray one = new OneDimensionalArray();
        int[] arr = {2,4,6,8,10};
        Arrays.toString(IterationThrough1DArr(arr));
    }
}