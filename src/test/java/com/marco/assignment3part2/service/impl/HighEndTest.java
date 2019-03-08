package com.marco.assignment3part2.service.impl;

import com.marco.assignment3part2.data.ComputerSpecs;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class HighEndTest {
    private ComputerSpecs computerSpecs;
    private ComputerSpecs highEndPc;
    private ComputerSpecs highEndPc1;
    private HighEnd highEnd;
    @Before
    public void setUp() throws Exception {
        highEnd = new HighEnd();
        computerSpecs = new ComputerSpecs("RedRagon", 6, 2, 30, 70, 600, 500);
        highEndPc = new ComputerSpecs("RedRagon Beast",7,5,20,60,500,300);
        highEndPc1 = new ComputerSpecs("Super RTX",9,6,50,80,800,600);
    }

    @Test
    public void timeUsed() {
        int timeDifference = highEnd.timeUsed(computerSpecs.getTimeStartedAMHr(),computerSpecs.getTimeStoppedPMHr());
        assertEquals(4, timeDifference);
    }

    @Test
    public void heatIncrease() {
        int heatIncreased = highEnd.heatIncrease(computerSpecs.getIdleTempDeg(),computerSpecs.getMaxTempDeg());
        assertEquals(40, heatIncreased);
    }

    @Test
    public void psuExtraWatts() {
        int WattsToSpare = highEnd.psuExtraWatts(computerSpecs.getPsuWatts(),computerSpecs.getComponentWatts());
        assertEquals(100, WattsToSpare);
    }

    @Test(timeout=100)
    public void getHighEndArray() {
        List<ComputerSpecs> testHighEndPcs = new ArrayList<>();
        testHighEndPcs.add(highEndPc);
        testHighEndPcs.add(highEndPc1);

        assertEquals(testHighEndPcs.get(1).getPcName(), highEnd.getHighEndArray().get(1).getPcName());
        assertEquals(testHighEndPcs.get(1).getMaxTempDeg(), highEnd.getHighEndArray().get(1).getMaxTempDeg());
        assertEquals(testHighEndPcs.get(1).getPsuWatts(), highEnd.getHighEndArray().get(1).getPsuWatts());
    }

    @Ignore
    @Test
    public void getHighEndArrayIdentity() {
        List<ComputerSpecs> testHighEndPcs = new ArrayList<>();
        testHighEndPcs.add(highEndPc);
        testHighEndPcs.add(highEndPc1);

        assertSame(testHighEndPcs.get(1).getPcName(), highEnd.getHighEndArray().get(1).getPcName());
    }
}