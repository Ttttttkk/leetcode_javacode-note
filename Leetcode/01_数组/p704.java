package Leetcode.array;

import java.util.Scanner;

public class p704 {
    //二分
    public static void main(String[] args) {
        int[]arr={-1,0,3,5,9,12};
        int target;
        Scanner sc=new Scanner(System.in);
        target=sc.nextInt();
        int index = getIndex(arr, target);
        System.out.println(index);
    }
    public static int getIndex(int[]arr,int target){
        int start=0;
        int end=arr.length-1;
        while (start<=end){
            int mid=(start+end)/2;
            if(arr[mid]>target){
                end=mid-1;
            }
            else if(arr[mid]<target){
                start=mid+1;
            }
            else if(arr[mid]==target){
                return mid;
            }
        }
        return -1;
    }
}
