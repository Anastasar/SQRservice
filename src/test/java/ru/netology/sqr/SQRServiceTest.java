package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SQRServiceTest {
    @Test
    public void testCalcWhenSomeSquaresFound() {
        SQRService service = new SQRService();

        int actual = service.calcSqrt(200, 300);
        int expected = 3;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test1CalcWhenSomeSquaresFound() {
        SQRService service = new SQRService();

        int actual = service.calcSqrt(50, 100);
        int expected = 1;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test2CalcWhenSometimes2SquaresFound() {
        SQRService service = new SQRService();

        int actual = service.calcSqrt(50, 99);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test3CalcWhenSometimes2SquaresFound() {
        SQRService service = new SQRService();

        int actual = service.calcSqrt(9801, 9802);
        int expected = 1;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test4CalcWhenSometimes2SquaresFound() {
        SQRService service = new SQRService();

        int actual = service.calcSqrt(0, -10);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test5CalcWhenSometimes2SquaresFound() {
        SQRService service = new SQRService();

        int actual = service.calcSqrt(100, 10000);
        int expected = 90;

        Assertions.assertEquals(expected, actual);
    }
}


