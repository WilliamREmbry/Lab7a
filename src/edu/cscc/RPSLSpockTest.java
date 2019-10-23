package edu.cscc;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author William Embry, Lab 7, 10/16/2019
 */
public class RPSLSpockTest extends RPSLSpock {

    @Test
    public void isValidPick1() {
        Assert.assertTrue(RPSLSpock.isValidPick(RPSLSpock.ROCK));
        Assert.assertTrue(RPSLSpock.isValidPick(RPSLSpock.PAPER));
        Assert.assertTrue(RPSLSpock.isValidPick(RPSLSpock.SCISSORS));
        Assert.assertTrue(RPSLSpock.isValidPick(RPSLSpock.LIZARD));
        Assert.assertTrue(RPSLSpock.isValidPick(RPSLSpock.SPOCK));
        Assert.assertFalse(RPSLSpock.isValidPick(("STICK")));
    }

    @Test
    public void generatePick1() {
        for (int i = 0; i < 1000000; i++){
            String gpick = RPSLSpock.generatePick();
            Assert.assertNotNull(gpick);
            Assert.assertTrue(isValidPick(gpick));
        }
    }

    @Test
    public void isComputerWin1() {
        Assert.assertTrue(RPSLSpock.isComputerWin(ROCK, SCISSORS));
        Assert.assertTrue(RPSLSpock.isComputerWin(ROCK, LIZARD));
        Assert.assertTrue(RPSLSpock.isComputerWin(PAPER, ROCK));
        Assert.assertTrue(RPSLSpock.isComputerWin(PAPER, SPOCK));
        Assert.assertTrue(RPSLSpock.isComputerWin(SCISSORS, PAPER));
        Assert.assertTrue(RPSLSpock.isComputerWin(SCISSORS, LIZARD));
        Assert.assertTrue(RPSLSpock.isComputerWin(LIZARD, PAPER));
        Assert.assertTrue(RPSLSpock.isComputerWin(LIZARD, SPOCK));
        Assert.assertTrue(RPSLSpock.isComputerWin(SPOCK, ROCK));
        Assert.assertTrue(RPSLSpock.isComputerWin(SPOCK, SCISSORS));
        Assert.assertFalse(RPSLSpock.isComputerWin(ROCK, PAPER));
    }
}