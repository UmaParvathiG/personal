package com.uma.array;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/***
 * The basic idea is that we iterate through the input array and mark elements as negative using nums[nums[i] -1] = -nums[nums[i]-1].
 * In this way all the numbers that we have seen will be marked as negative.
 * In the second iteration, if a value is not marked as negative, it implies we have never seen that index before, so just add it to the return list.
 */

public class FindDisappearedNumbers {

    /****
     * Given an array of integers where 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others appear once.
     Find all the elements of [1, n] inclusive that do not appear in this array.
     Could you do it without extra space and in O(n) runtime? You may assume the returned list does not count as extra space.
     */

    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ret = new ArrayList<Integer>();

        for(int i = 0; i < nums.length; i++) {
            int val = Math.abs(nums[i]) - 1;
            if(nums[val] > 0) {
                nums[val] = -nums[val];
            }
        }

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > 0) {
                ret.add(i+1);
            }
        }
        return ret;
    }
    @Test
    public void test()
    {
        List<Integer> expResult= new ArrayList<Integer>();
        expResult.add(4);
        expResult.add(5);
        expResult.add(7);
        expResult.add(8);

        int[] nums = {9,3,2,6,1,2,1,9,3};
        Assert.assertEquals(expResult,findDisappearedNumbers(nums));

    }

}

