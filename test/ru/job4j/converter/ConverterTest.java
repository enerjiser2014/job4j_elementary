package ru.job4j.converter;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;
import org.junit.Test;

public class ConverterTest {

    @Test
    public void whenConvert180rubleThen2Euro() {
        int in = 180;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        Assert.assertEquals(expected, out,0e-5);
    }

    @Test
    public void whenConverter154rubleThen2Dollar() {
        int in = 154;
        float expected = 2;
        float out = Converter.rubleToDollar(in);
        Assert.assertEquals(expected, out, 0e-5);
    }
}