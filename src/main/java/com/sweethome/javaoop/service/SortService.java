package com.sweethome.javaoop.service;

import com.sweethome.javaoop.logic.BubbleSort;
import com.sweethome.javaoop.logic.JavaSort;
import com.sweethome.javaoop.logic.Sort;

import java.util.List;

public class SortService {

    private Sort<String> sort;

    public SortService(Sort<String> sort) {
        this.sort = sort;
    }

    List<String> doSort(List<String> list){
        return sort.sort(list);
    }
}
