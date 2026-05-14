package Leetcode.array;

import java.util.Arrays;

public class p977 {
    public static void main(String[] args) {
        int[] nums={-4,-1,0,3,10};
        int[] res = sortedSquares(nums);
        for (int i : res) {
            System.out.println(i);
        }
    }

    //sort 时间复杂度O(n log n)
    public static int[] sortedSquares(int[] nums) {
        int[] arr=new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i]=nums[i]*nums[i];
        }
        Arrays.sort(arr);
        return arr;
    }
    //平方后最大值一定在两端->
    //可以用双指针优化 优化到O(n)  双指针适合解决"每一步都能确定一个最终位置"
    public static int[] sortedSquares2(int[] nums) {
        int[] arr=new int[nums.length];
        //left right 负责找最大的数
       int left=0;
       int right=nums.length-1;
       //从后往前放数据
       int index=nums.length-1;
       while (left<=right){
           if(nums[left]*nums[left]>nums[right]*nums[right]){
               arr[index]=nums[left]*nums[left];
               left++;
           }
           else {
               arr[index]=nums[right]*nums[right];
               right++;
           }
           index--;

       }
       return arr;

    }

}
