package Array2;

import org.junit.Assert;
import org.junit.Test;

public class Ex1 {
    public int countNumber (int[] arrNum, int number) {
        int count = 0;
        for (int n: arrNum
             ) {
            if (n==number) {
                count++;
            }
        }
        return count;
    }
    @Test
    public void test_CountNumber_WithExistedValue () {
//        Assume
        int[] arrNum = {1, 2, 3, 1, 5, 7, 9, 4};
        int number = 2;
        int expected = 1;
//        Action
        int actual = this.countNumber(arrNum, number);
//        Assertion
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void test_CountNumber_WithNotExisted () {
//        Assume
        int[] arrNum = {1, 2, 3, 1, 5, 7, 9, 4};
        int number = 20;
        int expected = 0;
//        Action
        int actual = this.countNumber(arrNum, number);
//        Assertion
        Assert.assertEquals(expected,actual);
    }
}
