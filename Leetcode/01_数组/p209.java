package Leetcode.array;
import java.util.Arrays;

public class p209 {
    //5.10
    public static void main(String[] args) {
        int[] arr={12,28,83,4,25,26,25,2,25,25,25,12};
        int i = minSubArrayLen(213, arr);
        System.out.println(i);

    }
    //题目 子数组：连续!
    /*public static int minSubArrayLen(int target, int[] nums) {
        Arrays.sort(nums);
        for (int num : nums) {
            System.out.print(num+" ");
        }
        int index=nums.length-1;
        int sum=0;
        int res=0;
        while (true){
            if(index<0){
                res=0;
                break;
            }

         sum+=nums[index];
            res++;
            if(sum>=target){
                break;
            }
            index--;
        }
        return res;
    }*/

    //滑动窗口->边移动边更新状态->一边扩一边缩
    public static int minSubArrayLen(int target, int[] nums){
        int left=0;
        int sum=0;
        int res=0;
        for (int right = 0; right < nums.length; right++) {
            sum+=nums[right];
            while (sum>=target){
                res=(res==0)?right-left+1:Math.min(res,right-left+1);
                sum-=nums[left];
                left++;
            }
        }
        return res;


    }

}
