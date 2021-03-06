package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {

    @Test
    public void whenMax1to2Then2() {
        int result = Max.max(1,2);
        assertThat(result, is(2));
    }
    @Test
    public void whenMax2to2Then2() {
        int result = Max.max(2,2);
        assertThat(result, is(2));
    }
    @Test
    public void whenMax2to1Then2() {
        int result = Max.max(2,1);
        assertThat(result, is(2));
    }
    @Test
    public void whenMax1_2_3Then3() {
        int result = Max.max(1,2,3);
        assertThat(result, is(3));
    }
    @Test
    public void whenMax1_2_3_4Then4() {
        int result = Max.max(1,2,3,4);
        assertThat(result, is(4));
    }
}