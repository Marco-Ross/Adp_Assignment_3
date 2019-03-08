package com.marco.assignment3part2.data;

public class ComputerSpecs {
    private String pcName;
    private int TimeStartedAMHr;
    private int TimeStoppedPMHr;
    private int idleTempDeg;
    private int maxTempDeg;
    private int psuWatts;
    private int componentWatts;

    public ComputerSpecs() {
    }

    public ComputerSpecs(String pcName, int timeStartedAMHr, int timeStoppedPMHr, int idleTempDeg, int maxTempDeg, int psuWatts, int componentWatts) {
        this.pcName = pcName;
        TimeStartedAMHr = timeStartedAMHr;
        TimeStoppedPMHr = timeStoppedPMHr;
        this.idleTempDeg = idleTempDeg;
        this.maxTempDeg = maxTempDeg;
        this.psuWatts = psuWatts;
        this.componentWatts = componentWatts;
    }

    public ComputerSpecs(int timeStartedAMHr, int timeStoppedPMHr, int idleTempDeg, int maxTempDeg, int psuWatts, int componentWatts) {
        TimeStartedAMHr = timeStartedAMHr;
        TimeStoppedPMHr = timeStoppedPMHr;
        this.idleTempDeg = idleTempDeg;
        this.maxTempDeg = maxTempDeg;
        this.psuWatts = psuWatts;
        this.componentWatts = componentWatts;
    }

    public String getPcName() {
        return pcName;
    }

    public int getTimeStartedAMHr() {
        return TimeStartedAMHr;
    }

    public int getTimeStoppedPMHr() {
        return TimeStoppedPMHr;
    }

    public int getIdleTempDeg() {
        return idleTempDeg;
    }

    public int getMaxTempDeg() {
        return maxTempDeg;
    }

    public int getPsuWatts() {
        return psuWatts;
    }

    public int getComponentWatts() {
        return componentWatts;
    }
}
