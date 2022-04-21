package com.fc.javaoop.service;

import com.fc.javaoop.logic.BubbleSort;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * fileName : SrotServiceTest
 * author :  KimSangHoon
 * date : 2022/04/21
 */
class SrotServiceTest {

    private SortService sut = new SortService(new BubbleSort<String>());

    @Test
    void test() {
        //given

        //when
        List<String> actual = sut.doSort(List.of("3", "2", "1"));

        //then
        assertEquals(List.of("1", "2", "3"), actual);
    }
}