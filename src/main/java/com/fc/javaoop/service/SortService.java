package com.fc.javaoop.service;

import com.fc.javaoop.logic.Sort;

import java.util.List;

/**
 * fileName : SrotService
 * author :  KimSangHoon
 * date : 2022/04/21
 */
public class SortService {

    private final Sort<String> sort;

    public SortService(Sort<String> sort) {
        this.sort = sort;
        System.out.println("구현체: " + sort.getClass().getName());
    }

    public List<String> doSort(List<String> list) {
        return sort.sort(list);
    }
}
