package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FindLoopTest {

    @Test
    public void whenArrayHas5Then0Finish8() {
        int[] input = {5, 4, 3, 2};
        int start = 0;
        int finish = 8;
        int value = 5;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expect = 0;
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayHas3Then2() {
        int[] input = {5, 4, 3, 2};
        int start = 1;
        int finish = 2;
        int value = 3;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expect = 2;
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayHas2Then3() {
        int[] input = {5, 4, 3, 2};
        int start = 2;
        int finish = 3;
        int value = 2;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expect = 3;
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayHas2ThenMinusOne() {
        int[] input = {5, 4, 3, 2};
        int value = 2;
        int start = 1;
        int finish = 2;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expect = -1;
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayHas8ThenMinusOne() {
        int[] input = {5, 4, 3, 2};
        int start = 0;
        int finish = 3;
        int value = 8;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expect = -1;
        assertThat(result, is(expect));
    }
}