package Array2;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class Ex3 {
    public int[] checkPrimeNum (int[] arr) {
        ArrayList<Integer> primeNum = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<=1) {
            }
            else {
                boolean check = false;
                for (int j = 2; j <= Math.sqrt(arr[i]); j++) {
                    if (arr[i] % j == 0) {
                        check = true;
                    }
                }
                if(check == false)
                    primeNum.add(arr[i]);
            }
        }
        int[] arrPrimeNum = new int[primeNum.size()];
        for (int i = 0; i < primeNum.size(); i++) {
            arrPrimeNum[i]= primeNum.get(i);
        }
        return arrPrimeNum;
    }
    @Test
    public void test_CheckPrimeNum () {
//        Assume
        int[] arrNum = {1, 2, 3, 1, 5, 7, 9, 4};
        int[] expected = {2, 3, 5, 7};


//        Action
        int[] actual = this.checkPrimeNum(arrNum);
        System.out.println(actual+"");
        System.out.println(expected+"");

//        Assertion
        Assert.assertArrayEquals(expected, actual);

    }
}
