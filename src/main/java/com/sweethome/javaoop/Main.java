package com.sweethome.javaoop;

import com.sweethome.javaoop.logic.BubbleSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        BubbleSort<String> bubbleSort = new BubbleSort<>();

        System.out.println("[result] " + bubbleSort.sort(Arrays.asList(args)));

    }
}
