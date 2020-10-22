package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class CheckPrimeNumberTest {
    @Test
    public void when5() {
        boolean rsl = CheckPrimeNumber.check(5);
        assertThat(rsl, is(true));
    }

    @Test
    public void when4() {
        boolean rsl = CheckPrimeNumber.check(4);
        assertThat(rsl, is(false));
    }

    @Test
    public void when2() {
        boolean rsl = CheckPrimeNumber.check(2);
        assertThat(rsl, is(true));
    }

    @Test
    public void when1() {
        boolean rsl = CheckPrimeNumber.check(1);
        assertThat(rsl, is(false));
    }

    @Test
    public void when13() {
        boolean rsl = CheckPrimeNumber.check(13);
        assertThat(rsl, is(true));
    }

    @Test
    public void when3571() {
        boolean rsl = CheckPrimeNumber.check(3571);
        assertThat(rsl, is(true));
    }

    @Test
    public void when65535() {
        boolean rsl = CheckPrimeNumber.check(65535);
        assertThat(rsl, is(false));
    }
}