package com.lise.arithmetic.sort;

import java.util.Arrays;

/**
 * 冒泡排序
 * 时间：平均复杂度O(n^2)  最好复杂度O(n)  最坏复杂度均为O(n^2)
 * 空间：O（1）没有使用额外空间 稳定
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static int[] bubbleSort(int[] arr) {
        boolean isExchange = false;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    isExchange = true;
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            if (isExchange == true) {
                isExchange = false;
            } else {
                return arr;
            }
        }
        return arr;
    }
}
