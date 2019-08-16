public class MedianSortedArray {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] newArr= new int[(nums1.length+nums2.length)];
        int firstCount=0,secondCount=0,newCount=0;
        while(firstCount<nums1.length && secondCount<nums2.length){
            if(nums1[firstCount]<nums2[secondCount]){
                newArr[newCount++]=nums1[firstCount++];

            }
            else{
                newArr[newCount++]=nums2[secondCount++];
            }}

                while(firstCount<nums1.length)newArr[newCount++]=nums1[firstCount++];
                while(secondCount<nums2.length)newArr[newCount++]=nums2[secondCount++];
        int len=newArr.length;
        if(len%2==0){

            return (double)((newArr[(int)(len/2)]+newArr[(int)(((len/2)-1))])/2);

        }
        else{
            return (double) newArr[(int)len/2];
        }

    }
    public static void main(String[] args){
        int[] num1={1, 4};
        int[] num2={3,5};
        System.out.println(findMedianSortedArrays(num1,num2));
    }
}
