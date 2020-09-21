package Array2;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class Ex2 {
    public int[] addToNewArray (int[] arrNum, int n) {
        ArrayList<Integer> newArr = new ArrayList<>();
        for (int i = 0; i < arrNum.length; i++) {
            if (arrNum[i]>n) {
                newArr.add(arrNum[i]);
            }
        }
        int[] newArr1 = new int[newArr.size()];
        for (int i = 0; i < newArr.size(); i++) {
            newArr1[i]= newArr.get(i);
        }
        return newArr1;
    }
    @Test
    public void test_AddToNewArray_Existed () {
//        Assume
        int[] arrNum = {1, 2, 3, 1, 5, 7, 9, 4};
        int number = 3;
        int[] expected = {5, 7, 9, 4};
//        Action
        int[] actual = this.addToNewArray(arrNum, number);

//        Assertion
        Assert.assertArrayEquals(expected, actual);
    }
    @Test
    public void test_AddToNewArray_NotExisted () {
//        Assume
        int[] arrNum = {1, 2, 3, 1, 5, 7, 9, 4};
        int number = 10;
        int[] expected = {};
//        Action
        int[] actual = this.addToNewArray(arrNum, number);

//        Assertion
        Assert.assertArrayEquals(expected, actual);
    }
}
