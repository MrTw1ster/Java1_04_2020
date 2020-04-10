package dz_2;

import java.util.Arrays;
import java.util.stream.Stream;

public class dz_2 {

    public static void main(String[] args) {
        //taskOne();
        //taskTwo();
        //taskThree();
        //taskFour();
        //taskFive();
        //taskSix();
        //taskSeven();
    }

    public static void taskOne() {
        System.out.println("Задание 1.");
        int[] a = new int[] {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                a[i] = 1;
            } else {
                a[i] = 0;
            }
            System.out.print(a[i] + " ");
        }
        System.out.println(" ");
    }

    public static void taskTwo() {
        System.out.println("\nЗадание 2");
        int[] a = new int[8];
        for (int i = 0, j = 0; i < a.length; i++, j+=3) {a[i] = j;
            System.out.print(a[i] + " ");
        }
    }

    public static void taskThree() {
        System.out.println("\n\nЗадание 3");
        int[] a = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 6) {
                a[i] *= 2;
            }
            System.out.print(a[i] + " ");
        }
    }

    public static void taskFour() {
        System.out.println("\n\nЗадание 4.");
        int num = 3;
        int[][] a = new int[num][num];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0, j2 = a[i].length; j < a[i].length; j++, j2--) {
                if (i == j || i == (j2 - 1)) {
                    a[i][j] = 1;
                }
                System.out.print(a[i][j] + " ");
            }
            System.out.print("\r\n");
        }
    }

    public static void taskFive() {
        System.out.println("\n\nЗадание 5.");
        int[] a = {21, 3, 1, 5, 8, 14, 11, 4, 17};
        int min = a[0];
        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
            if (a[i] < min) {
                min = a[i];
            }
        }
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }

    public static boolean taskSix(int a[]) {
        System.out.println("\n\nЗадание 6.");
        int leftSum = 0;
        int rightSum = 0;
        for (int i:a) {
            rightSum += i;
        }
        for (int i = 0; i < a.length; i++) {
            if (leftSum == rightSum) {
                return true;
            }
            leftSum += a[i];
            rightSum -= a[i];
        }
        return false;

    public static void taskSeven(int[] a, int n) {
        System.out.println("\n\nЗадание 7.");
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println("\r\n");

        if (n > 0) {
            for (int j = 0; j < n; j++) {
                int b = a[a.length - 1];
                for (int x = a.length - 1; x > 0; x--) {
                    a[x] = a[x - 1];
                }
                a[0] = b;
                for (int i : a) {
                    System.out.print(i + " ");
                }
                System.out.println();
            }
        } else if (n < 0) {
            for (int j = 0; j > n; j--) {
                int b = a[0];
                for (int x = 0; x < a.length - 1; x++) {
                    a[x] = a[x + 1];
                }
                a[a.length - 1] = b;
                for (int i : a) {
                    System.out.print(i + " ");
                }
                System.out.print("\r\n");
            }
        }
    }

}
