package Array2;

import org.junit.Assert;
import org.junit.Test;

public class Ex4 {
    public int[] sumArr (int[] arr1, int[] arr2) {
        int[] arrSum = new int[arr1.length];
        if (arr1.length>=arr2.length) {
            for (int i = 0; i < arr1.length; i++) {
                if (i<=arr2.length) {
                    arrSum[i] = arr1[i] + arr2[i];
                }
                else if (i>arr2.length) {
                    arrSum[i] = arr1[i];
                }
            }
        }
        return arrSum;
    }
    @Test
    public void test_ArrSum () {
//        Assume
        int[] arr1 = {1, 5, 7, 8, 3};
        int[] arr2 = {8, 6, 8};
        int[] expected = {9, 11, 15, 8, 3};
//        Action
        int[] actual = this.sumArr(arr1, arr2);
//        Assertion
        Assert.assertArrayEquals(expected, actual);
    }
}
