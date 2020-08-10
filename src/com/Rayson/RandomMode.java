package com.Rayson;

import com.Rayson.utils.OpenWay;

import java.util.ArrayList;
import java.util.Random;

//     随机红包
public class RandomMode implements OpenWay {

    @Override
    public ArrayList<Integer> divide(int totalMoney, int totalCount) {
        ArrayList<Integer> list = new ArrayList<>();
        int leftMoney = totalMoney;
        int leftCount = totalCount;
        Random random = new Random();
        for (int i = 0; i < totalCount - 1; i++) {
            int money = random.nextInt(leftMoney / leftCount * 2 + 1);
            list.add(money);
            leftMoney -= money;
            leftCount--;
        }
        list.add(leftMoney);
        return list;
    }
}
