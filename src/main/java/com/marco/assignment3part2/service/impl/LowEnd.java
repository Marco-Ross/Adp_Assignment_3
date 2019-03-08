package com.marco.assignment3part2.service.impl;

import com.marco.assignment3part2.service.Computer;

public class LowEnd implements Computer {
    @Override
    public int timeUsed(int startTime, int endTime) {
        return startTime - endTime * 5;
    }

    @Override
    public int heatIncrease(int startHeat, int maxHeat) {
        return startHeat + maxHeat - startHeat * 2;
    }

    @Override
    public int psuExtraWatts(int psuWatts, int componentWatts) {
        return psuWatts - componentWatts;
    }

    public int heatXtime(int heatInc, int time){
        return heatInc * time;
    }
}
