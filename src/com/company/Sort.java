package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Sort extends Read {
    public String[] sortFirst(String[] inputArray)
    {
     Arrays.sort(inputArray);
        return inputArray;
    }
    public String[] sortLast(String[] inputArray)
    {

        Arrays.sort(inputArray, new Comparator<String>() {
            public int compare(String o1, String o2) {
                String[] split1 = o1.split(" ");
                String[] split2 = o2.split(" ");
                String lastName1 = split1[1];
                String lastName2 = split2[1];
                if (lastName1.compareTo(lastName2) > 0) {
                    return 1;
                }
                return -1;
            }
        });
        return inputArray;
    }
}
