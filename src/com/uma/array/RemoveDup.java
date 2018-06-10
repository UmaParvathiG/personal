package com.uma.array;

import org.junit.*;

/****
 * Complexity analysis

 Time complexity : O(n)O(n). Assume the array has a total of nn elements, both ii and jj traverse at most 2n2n steps.

 Space complexity : O(1)O(1).
 */


public class RemoveDup {

    /****
     * Given an array and a value, remove all instances of that value in place and return the new length.

     Do not allocate extra space for another array, you must do this in place with constant memory.

     The order of elements can be changed. It doesn't matter what you leave beyond the new length.

     Example:
     Given input array nums = [3,2,2,3], val = 3

     Your function should return length = 2, with the first two elements of nums being 2.
     */

        public int removeGivenElement(int[] A, int val) {
            int newIndex = 0;
            for(int i = 0; i < A.length; i++){
                if(A[i] != val){
                    A[newIndex] = A[i];
                    newIndex++;
                }
            }
            return newIndex;
        }

        @Test
        public void test(){
            int[] testData= {3,3,2,3};
            System.out.println(removeGivenElement(testData,3));

        }



    /**
     * Given a sorted array, remove the duplicates in place such that each element appear only once and return the new length.

     Do not allocate extra space for another array, you must do this in place with constant memory.

     For example,
     Given input array nums = [1,1,2],

     Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively. It doesn't matter what you leave beyond the new length.
     * @param nums
     * @return
     */

public int removeDuplicatesFromSortedArray(int[] nums) {

    if(nums.length>0)
    {
        int val= nums[0];
        int newIndex=0;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]!=val)
            {
                nums[++newIndex] =nums[i];
                val=nums[i];
            }
        }
        return (newIndex+1);
    }
    else
        return 0;
}

    /***
     * Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

     For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].

     Note:
     You must do this in-place without making a copy of the array.
     Minimize the total number of operations.
     * @param nums
     */

    public void moveZeroes(int[] nums) {
        int newIndex=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=0)
            {
                nums[newIndex]=nums[i];
                newIndex++;
            }
        }
        if(newIndex != nums.length)
        {
            for(int j=newIndex;j<nums.length;j++)
                nums[j]=0;
        }

    }
}
