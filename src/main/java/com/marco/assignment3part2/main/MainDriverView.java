package com.marco.assignment3part2.main;

import com.marco.assignment3part2.data.ComputerSpecs;
import com.marco.assignment3part2.service.impl.HighEnd;
import com.marco.assignment3part2.service.impl.LowEnd;

import java.util.List;

public class MainDriverView {

    private void highEndComputers(){
        HighEnd highEnd = new HighEnd();
        List<ComputerSpecs> highEndComputers =  highEnd.getHighEndArray();

        for(int i=0;i<highEndComputers.size();i++){
            //Calculating high end computers timeUsed, HeatIncreased and Excess watts
            int timeUsed = highEnd.timeUsed(highEndComputers.get(i).getTimeStartedAMHr(), highEndComputers.get(i).getTimeStoppedPMHr());
            int heatIncrease = highEnd.heatIncrease(highEndComputers.get(i).getIdleTempDeg(), highEndComputers.get(i).getMaxTempDeg());
            int extraWatts = highEnd.psuExtraWatts(highEndComputers.get(i).getPsuWatts(), highEndComputers.get(i).getComponentWatts());

            //Printing out Pcs
            System.out.println("High End Computer stats: ");
            System.out.print("Name: " + highEndComputers.get(i).getPcName() + " |");
            System.out.print("Time Used: " +timeUsed + " |");
            System.out.print("Heat Increase: " +heatIncrease + " |");
            System.out.println("Extra Watts: " +extraWatts);
            System.out.println();
        }
    }

    private void lowEndComputers(){
        LowEnd lowEnd = new LowEnd();
        ComputerSpecs lowEndPcs = new ComputerSpecs("SlowPoke",5,8,60,80,200,150);

            //Printing out Pcs
            System.out.println("High End Computer stats: ");
            System.out.print("Name: " + lowEndPcs.getPcName() + " |");
            System.out.print("Max Temperature: " +lowEndPcs.getMaxTempDeg() + " |");
            System.out.print("Component Watts: " +lowEndPcs.getComponentWatts());
            System.out.println();

    }

    public static void main(String[] args) {
        MainDriverView mainDriverView = new MainDriverView();
        mainDriverView.highEndComputers();
        mainDriverView.lowEndComputers();
    }
}
