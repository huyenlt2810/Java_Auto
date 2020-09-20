import org.junit.Test;

import java.util.ArrayList;

public class BaiTapArray {
    //    Cho một mảng các số nguyên bất kỳ và một số n. Hãy đếm xem số n xuất hiện bao nhiêu lần trong mảng
    @Test
    public void countN () {
        int[] arr1 = new int[10];
        arr1[0]=1;
        arr1[1]=2;
        arr1[2]=1;
        int n = 1;
        int count = 0;
        for (int i = 0; i < arr1.length; i++) {
            if (n==arr1[i]) {
                count += 1;
            }
        }
        System.out.printf("có " + count+" lan so "+n+" xuat hien trong mang");
    }

//    Bài 2: cho một mảng số nguyên, và một số nguyên n, hãy lọc ra các số lớn hơn số n cho vào một mảng khác
    @Test
    public void addNToNewArray () {
        int[] arr2 = {1, 2, 3, 1, 5, 7, 9, 4};
        int n = 1;
        ArrayList<Integer> newArr = new ArrayList<>();
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i]>n) {
                newArr.add(arr2[i]);
            }
        }
        System.out.printf(newArr+"");
    }

//    Bài 3: cho một mảng các số nguyên bất kỳ, hãy lọc ra các số nguyên tố có trong mảng đó
    @Test
    public void chossePrimeNum () {
        int[] arr3 = {1, 2, 3, 1, 5, 7, 9, 4};
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] <= 1) {
                System.out.println(arr3[i] + " Khong la so nguyen to");
            } else {
                for (int j = 2; j <= Math.sqrt(arr3[i]); j++) {
                    if (arr3[i] % j == 0) {
                        System.out.println(arr3[i] + " khong la so nguyen to");
                    }
                }
                System.out.println(arr3[i] + " la so nguyen to");
            }
        }
    }

//    Bài 4. Cho hai mảng số nguyên bất kỳ, hãy tính tổng của hai mảng này. Tổng của hai mảng là một mảng thỏa mãn C[i] = A[i] + B[i]
    @Test
    public void sumArr () {
        int[] arr4 = {1, 5, 7, 8, 3};
        int[] arr5 = {8, 6, 8};
        if (arr4.length==arr5.length) {
            int[] arrSum = new int[arr4.length];
            for (int i = 0; i < arr4.length; i++) {
                arrSum[i] = arr4[i] + arr5[i];
                System.out.printf(arrSum[i]+" ");
            }
        }
        else if (arr4.length>arr5.length) {
            int[] arrSum = new int[arr4.length];
            for (int i = 0; i < arr5.length; i++) {
                arrSum[i] = arr4[i] + arr5[i];
                System.out.printf(arrSum[i]+" ");
            }
            for (int i = arr5.length; i < arr4.length; i++) {
                arrSum[i] = arr4[i];
                System.out.printf(arr4[i]+" ");
            }
        }
    }
}
