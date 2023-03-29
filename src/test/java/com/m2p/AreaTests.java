package com.m2p;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AreaTests {
    Geometry geometry = new Geometry();
    @Test
    void toFindAreaOfRectangle() throws ExceptionToHandleNegativeValues {
        //arrange
        int expectedArea = 20;

        //act
        int actualArea = geometry.areaOfRectangle(4,5);

        //assert
        assertEquals(expectedArea, actualArea);
    }

    @Test
    void toFindPerimeterOfRectangle() throws ExceptionToHandleNegativeValues {
        //arrange
        int expectedArea = 18;

        //act
        int actualArea = geometry.perimeterOfRectangle(4,5);

        //assert
        assertEquals(expectedArea, actualArea);
    }
}
