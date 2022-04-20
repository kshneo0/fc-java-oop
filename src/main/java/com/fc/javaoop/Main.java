package com.fc.javaoop;

import com.fc.javaoop.logic.BubbleSort;

import java.util.Arrays;

/**
 * fileName : Main
 * author :  KimSangHoon
 * date : 2022/04/21
 */
public class Main {
    public static void main(String[] args) {
        BubbleSort<String> sort = new BubbleSort<>();
        System.out.println("[result] " + sort.sort(Arrays.asList(args)));
    }
}
