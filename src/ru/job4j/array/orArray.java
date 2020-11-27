package ru.job4j.array;

import java.util.Arrays;

public class orArray {
    public static int[] or(int[] left, int[] right) {
        int[] tmp = new int[left.length + right.length];
        boolean in;
        int count = 0;
        for (int i = 0; i < left.length; i++) {
            tmp[count++] = left[i];
        }
        for (int i = 0; i < right.length; i++) {
            in = false;
            for (int j = 0; j < left.length; j++) {
                if (right[i] == left[j]) {
                    in = true;
                }
            }
            if (!in){
                tmp[count++] = right[i];
            }
        }
        int t = 0;
        for (int i = 0; i < count - 1; i++) {
            for (int j = i + 1; j < count; j++) {
                if (tmp[i] > tmp[j]) {
                    t = tmp[i];
                    tmp[i] = tmp[j];
                    tmp[j] = t;
                }
            }
        }
        return Arrays.copyOf(tmp, count);
    }

    public static void main(String[] args) {
        int[] arr = or(new int[] {1,2,3}, new int[] {3,2,1});
        for (int j : arr) {
            System.out.println(j);
        }

    }

}


//    public static int[] or(int[] left, int[] right) {
//        int[] tmp = new int[128];
//        int size = 0;
//        for (int i = 0; i < left.length; i++) {
//            if (false == chekFor(right, left[i])) {
//                tmp[size++] = left[i];
//            }
//        }
//        for (int i = 0; i < right.length; i++) {
//            tmp[i + size] = right[i];
//        }
//        return Arrays.copyOf(tmp, right.length + size);
//    }
//
//    public static boolean chekFor(int[] arr, int t) {
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == t) {
//                return true;
//            }
//        }
//        return false;
//    }


