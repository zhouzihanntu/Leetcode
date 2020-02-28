public class decompressRLElist{
    public int[] decompressRLElist(int[] nums){
        int numLength = nums.length;
        int arrLength = 0;
        for (int i=0; i < numLength; i = i+2){
            arrLength = arrLength + nums[i];
        }
        int[] arr = new int[arrLength];
        int flag = 0;
        for (int i=0; i < numLength; i = i+2){
            int a = nums[i];
            while(a > 0){
                arr[flag] = nums[i+1];
                flag = flag + 1;
                a = a - 1;
            }
        }
        return arr;
    }
    public static void main(String[] argvs){
        decompressRLElist test = new decompressRLElist();
        int[] nums = {1,2,3,4};
        int[] result = test.decompressRLElist(nums);
        for (int i=0; i<result.length; i++ ){
            System.out.println(result[i]);
        }
    }
}