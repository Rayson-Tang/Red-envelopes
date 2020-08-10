package com.Rayson;

public class Red {

    public static void main(String[] args) {
        MyRed myRed = new MyRed("抢红包");
        myRed.setOwnerName("艾欧恩");
//        NormalMode normalMode = new NormalMode();
//        myRed.setOpenWay(normalMode);
        RandomMode randomMode = new RandomMode();
        myRed.setOpenWay(randomMode);
    }
}

