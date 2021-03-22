package com.lise.arithmetic.sort;

import java.util.Arrays;

/**
 * 直接选择排序：简单
 * 时间：平均复杂度  最好复杂度  最坏复杂度均为O(n^2)
 * 空间：O（1） in-place  不稳定（两个相等的数，排序以后可能发生变化）
 */
public class SelectSort {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(arr));
        selectSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static int[] selectSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
}
