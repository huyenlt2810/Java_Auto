package Java;

import org.junit.Test;

public class BaiTapB1 {
    //hãy sử dụng 1 vòng lặp tính tổng và so sánh tổng các số chẵn và tổng các số lẻ từ 1 tới 100
    @Test
    public void tinhTong () {
        int sum = 0;
        for (int i = 1; i <=100 ; i++) {
            sum += i;
        }
        System.out.println("Tong tu 1 den 100 la: " + sum);
        int sumOddNum = 0;
        for (int i = 1; i <= 100 ; i+=2) {
            sumOddNum += i;
        }
        System.out.println("Tong so le tu 1 den 100 la: " + sumOddNum);
        int sumEvenNum = 0;
        for (int i = 2; i <= 100; i+=2) {
            sumEvenNum += i;
        }
        System.out.println("Tong so chan tu 1 den 100 la: " + sumEvenNum);
        if (sumEvenNum > sumOddNum) {
            System.out.println("Tong so chan tu 1 den 100 lon hon tong so le tu 1 den 100");
        }
        else if (sumEvenNum == sumOddNum) {
            System.out.println("Tong so chan tu 1 den 10 bang tong so le tu 1 den 100");
        }
        else {
            System.out.println("Tong so chan tu 1 den 100 nho hon tong so le tu 1 den 100");
        }

    }
    //Hãy viết giải thuật kiểm tra một số có phải là số nguyên tố hay không?
    public boolean checkPrimeNum () {
        int n =13;
        if (n<=1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n) ; i++) {
            if (n%i==0) {
                return false;
            }
        }
        return true;
    }
    @Test
    public void primeNum () {
        if (checkPrimeNum()) {
            System.out.printf("n la so nguyen to");
        }
        else {
            System.out.printf("n khong phai la so nguyen to");
        }
    }
    //hãy liệt kê 10 số đầu tiên trong dãy fibonaci
    public int fibonacci (int n) {
        int f0 = 0;
        int f1 = 1;
        int fn = 1;
        for (int i = 2; i < n; i++) {
            f0 = f1;
            f1 = fn;
            fn = f0 + f1;
        }
        return fn;
    }
    @Test
    public void checkFibonacci () {
        for (int i = 0; i < 10; i++) {
            System.out.printf(fibonacci(i) + " ");
        }
    }
    }

