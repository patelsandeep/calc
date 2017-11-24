package com.calculator.api;

import com.calculator.CalculatorApplication;
import com.calculator.service.CalculatorService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CalculatorApplication.class)
public class CalculatorRestAPITest {

    @Autowired
    private CalculatorService calculaterService;

    /**
     * Test of calcAdd method, of class CalculatorRestAPI. Exception.
     */
    @Test(expected = com.calculator.util.NumberFormatException.class)
    public void testCalcAdd() {
        System.out.println("calcAdd");
        String arg1 = "50";
        String arg2 = "50";
        String arg3 = "t";
        calculaterService.add(arg1, arg2, arg3);
    }

    /**
     * Test of calcSub method, of class CalculatorRestAPI. Exception.
     */
    @Test(expected = com.calculator.util.NumberFormatException.class)
    public void testCalcSub() {
        System.out.println("calcSub");
        String arg1 = "60";
        String arg2 = "a60";
        String arg3 = "60";
        calculaterService.subtract(arg1, arg2, arg3);

    }

    /**
     * Test of calcMulti method, of class CalculatorRestAPI. Exception.
     */
    @Test(expected = com.calculator.util.NumberFormatException.class)
    public void testCalcMulti() {
        System.out.println("calcMulti");
        String arg1 = "a30";
        String arg2 = "30";
        String arg3 = "30";
        calculaterService.multiply(arg1, arg2, arg3);
    }

    /**
     * Test of calcDiv method, of class CalculatorRestAPI. Exception.
     */
    @Test(expected = com.calculator.util.NumberFormatException.class)
    public void testCalcDiv() {
        System.out.println("calcDiv");
        String arg1 = "10";
        String arg2 = "a10";
        calculaterService.divide(arg1, arg2);
    }

    @Test
    public void testCalcAdd_() {
        System.out.println("calcAdd");
        String arg1 = "15";
        String arg2 = "25";
        String arg3 = "60";
        Double d = new Double("100");
        Double result = calculaterService.add(arg1, arg2, arg3);
        Assert.assertEquals(d, result);
    }

    /**
     * Test of calcSub method, of class CalculatorRestAPI.
     */
    @Test
    public void testCalcSub_() {
        System.out.println("calcSub");
        String arg1 = "100";
        String arg2 = "50";
        String arg3 = "25";
        Double d = new Double("25");
        Double result = calculaterService.subtract(arg1, arg2, arg3);
        Assert.assertEquals(d, result);
    }

    /**
     * Test of calcMulti method, of class CalculatorRestAPI.
     */
    @Test
    public void testCalcMulti_() {
        System.out.println("calcMulti");
        String arg1 = "10";
        String arg2 = "10";
        String arg3 = "10";
        Double d = new Double("1000");
        Double result = calculaterService.multiply(arg1, arg2, arg3);
        Assert.assertEquals(d, result);
    }

    /**
     * Test of calcDiv method, of class CalculatorRestAPI.
     */
    @Test
    public void testCalcDiv_() {
        System.out.println("calcDiv");
        String arg1 = "25";
        String arg2 = "5";
        Double d = new Double("5");
        Double result = calculaterService.divide(arg1, arg2);
        Assert.assertEquals(d, result);
    }
}
