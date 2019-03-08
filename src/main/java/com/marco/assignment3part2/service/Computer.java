package com.marco.assignment3part2.service;

public interface Computer {
    int timeUsed(int startTime, int endTime);
    int heatIncrease(int startHeat, int maxHeat);
    int psuExtraWatts(int psuWatts,int componentWatts);
}
