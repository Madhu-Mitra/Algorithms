import java.util.Arrays;

public class twoSum_simpleApproach {
    public static int[] twoSum(int[] nums, int target) {
        int[] val={0,0};
        boolean notFound=true;
        for (int i=0; i<nums.length && notFound;i++){
            for(int j=i+1;j<nums.length && notFound;j++){
                if(nums[i]+nums[j]==target) {


                    val[0]=i;
                    val[1]=j;
                    notFound=false;

                }
            }

        }
        return val;
    }

    public static void main(String[] args) {
        int [] input={4,2,5,4,6};
        int [] output=twoSum(input,10);
        System.out.println(Arrays.toString(output));

    }


}

