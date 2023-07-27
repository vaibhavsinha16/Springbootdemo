package com.example.Springdemo;

import java.util.ArrayList;
//hello
public class BinarySearchImpl {

    private SortAlgo sortAlgo;

    public BinarySearchImpl(SortAlgo sortAlgo)
    {
        this.sortAlgo = sortAlgo;
    }

     int BinarySearch(ArrayList<Integer> nums, int numtosearch)
    {
        ArrayList<Integer> sortednumbers =  sortAlgo.sort(nums);
        System.out.println(sortAlgo);

        return 0;
    }

}
