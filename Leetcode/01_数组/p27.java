package Leetcode.array;

public class p27 {
    //移除元素 ->双指针
    public static void main(String[] args) {
        int[] nums ={1}; // 输入数组
        int val = 1; // 要移除的值
        int k = removeElement(nums, val);
        System.out.println(k);
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i]+" ");
        }
    }

    //交换法 内循环会越界 边界容易卡
    public static int removeElement(int[] nums, int val) {
        int left=0;
        int right=nums.length-1;
        while (left<=right){
            while (left<=right&&nums[left]!=val){//左指针找到目标值
                left++;
            }
            while (left<=right&&nums[right]==val){//右指针找非目标值
                right--;
            }
            if (left<right) {
                int temp=nums[left];//交换
                nums[left]=nums[right];
                nums[right]=temp;
                left++;
                right--;
            }
            else break;
        }

        return right+1;
    }
    //优化 快慢指针
    //题目不用管后面的 直接覆盖
    public static int removeElement2(int[] nums, int val){
        int slow=0;
        for(int fast=0;fast<nums.length;fast++){
            if(nums[fast]!=val){
                nums[slow]=nums[fast];
                slow++;
            }
        }
        return slow;
    }
}
