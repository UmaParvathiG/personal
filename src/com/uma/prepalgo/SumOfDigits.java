package com.uma.prepalgo;

import org.junit.Assert;
import org.junit.Test;

public class SumOfDigits {

    public int sum(int val) {

        int sum = 0, tempSum = 0;
        while (val > 0) {
            if (sum + (val % 10) < 10)
                sum += val % 10;
            else {
                tempSum = sum + val % 10;
                sum = tempSum % 10 + tempSum / 10;
            }
            val = val / 10;
        }

        return sum;
    }

    @Test
    public void sumTest() {

        Assert.assertEquals(6,sum(123));

    }
}