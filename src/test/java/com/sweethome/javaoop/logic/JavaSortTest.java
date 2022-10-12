package com.sweethome.javaoop.logic;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class JavaSortTest {

    @Test
    @DisplayName("자바")
    void test(){
        JavaSort<Integer> javaSort = new JavaSort<>();

        List<Integer> actual = javaSort.sort(List.of(3, 2, 4, 5, 1));

        assertEquals(List.of(1,2,3,4,5), actual);
    }
}