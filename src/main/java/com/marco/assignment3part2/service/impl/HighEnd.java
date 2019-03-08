package com.marco.assignment3part2.service.impl;

import com.marco.assignment3part2.data.ComputerSpecs;
import com.marco.assignment3part2.service.Computer;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class HighEnd implements Computer {
    private ComputerSpecs highEndPc;
    private ComputerSpecs highEndPc1;

    private void createPcs(){
        highEndPc = new ComputerSpecs("RedRagon Beast",7,5,20,60,500,300);
        highEndPc1 = new ComputerSpecs("Super RTX",9,6,50,80,800,600);
    }

    @Override
    public int timeUsed(int startTime, int endTime) {
        return startTime - endTime;
    }

    @Override
    public int heatIncrease(int startHeat, int maxHeat) {
        return maxHeat - startHeat;
    }

    @Override
    public int psuExtraWatts(int psuWatts, int componentWatts) {
        return psuWatts - componentWatts;
    }

    public List<ComputerSpecs> getHighEndArray(){
        createPcs();
        List<ComputerSpecs> highArray = new ArrayList<>();
        highArray.add(highEndPc);
        highArray.add(highEndPc1);

        return highArray;
    }
}
