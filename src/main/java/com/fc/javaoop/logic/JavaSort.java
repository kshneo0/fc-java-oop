package com.fc.javaoop.logic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * fileName : JavaSort
 * author :  KimSangHoon
 * date : 2022/04/21
 */
public class JavaSort<T extends Comparable<T>> {

    public List<T> sort(List<T> list) {
        List<T> output = new ArrayList<>(list);

        Collections.sort(output);
        return output;
    }
}
