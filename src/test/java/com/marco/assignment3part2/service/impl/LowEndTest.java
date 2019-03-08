package com.marco.assignment3part2.service.impl;

import com.marco.assignment3part2.data.ComputerSpecs;
import org.junit.Before;
import org.junit.Test;
import org.junit.rules.Timeout;

import static org.junit.Assert.*;

public class LowEndTest {
    private ComputerSpecs lowEndPc1;
    private LowEnd lowEnd = new LowEnd();

    @Before
    public void setUp() throws Exception {
        lowEndPc1 = new ComputerSpecs("Popo RTX",5,2,70,85,300,250);
    }

    @Test
    public void timeUsed() {
        int timeDifference = lowEnd.timeUsed(lowEndPc1.getTimeStartedAMHr(),lowEndPc1.getTimeStoppedPMHr());
        assertEquals(-5, timeDifference);
    }

    @Test
    public void heatIncrease() {
        int heatIncreased = lowEnd.heatIncrease(lowEndPc1.getIdleTempDeg(),lowEndPc1.getMaxTempDeg());
        assertEquals(15, heatIncreased);
    }

    @Test
    public void psuExtraWatts() {
        int WattsToSpare = lowEnd.psuExtraWatts(lowEndPc1.getPsuWatts(),lowEndPc1.getComponentWatts());
        assertEquals(50, WattsToSpare);
    }

    @Test(timeout=100)
    public void heatXtime() {
        int timeDifference = lowEnd.timeUsed(lowEndPc1.getTimeStartedAMHr(),lowEndPc1.getTimeStoppedPMHr());
        int heatIncreased = lowEnd.heatIncrease(lowEndPc1.getIdleTempDeg(),lowEndPc1.getMaxTempDeg());

        assertEquals(-75, timeDifference*heatIncreased);
    }
}