package com.lise.arithmetic.sort;

import java.util.Arrays;

/**
 * 插入排序
 * 时间：平均复杂度O(n^2)  最好复杂度O(n)  最坏复杂度均为O(n^2)
 * 空间：O（1）没有使用额外空间 稳定
 */
public class InsertSort {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(arr));
        insertSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static int[] insertSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            // 记录要插入的数据
            int temp = arr[i];
            int j = i;
            while (j > 0 && temp < arr[j - 1]) {
                arr[j] = arr[j - 1];
                j--;
            }

            if (j != i) {
                arr[j] = temp;
            }
        }
        return arr;
    }
}
