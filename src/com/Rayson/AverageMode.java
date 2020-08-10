package com.Rayson;

import com.Rayson.utils.OpenWay;

import java.util.ArrayList;

//      平均红包
public class AverageMode implements OpenWay {

    @Override
    public ArrayList<Integer> divide(int totalMoney, int totalCount) {
        ArrayList<Integer> list = new ArrayList<>();
        int avg = totalMoney / totalCount;
        int mod = totalMoney % totalCount;
        for (int i = 0; i < totalCount - 1; i++) {
            list.add(avg);
        }
        list.add(avg + mod);
        return list;
    }
}
