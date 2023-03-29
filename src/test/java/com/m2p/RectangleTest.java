package com.m2p;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RectangleTest {
    Rectangle rectangleObject = new Rectangle();
    @Test
    void toFindAreaOfRectangle() {
        //arrange
        int expectedArea = 20;

        //act
        int actualArea = rectangleObject.areaOfRectangle(4,5);

        //assert
        assertEquals(expectedArea, actualArea);
    }
    @Test
    void toThrowExceptionInAreaWhenValuesAreNegative(){
        assertThrows(IllegalArgumentException.class, () ->{
            rectangleObject.areaOfRectangle(-3,-4);
        });
    }

    @Test
    void toFindPerimeterOfRectangle(){
        //arrange
        int expectedPerimeter = 18;

        //act
        int actualPerimeter = rectangleObject.perimeterOfRectangle(4,5);

        //assert
        assertEquals(expectedPerimeter, actualPerimeter);
    }
    @Test
    void toThrowExceptionInPerimeterWhenValuesAreNegative(){
        assertThrows(IllegalArgumentException.class, () ->{
            rectangleObject.areaOfRectangle(-3,4);
        });
    }

    @Test
    void toFindAreaOfSquare(){
        //arrange
        int expectedArea = 100;

        //act
        int actualArea = rectangleObject.areaOfSquare(10);

        //assert
        assertEquals(expectedArea, actualArea);
    }

    @Test
    void toFindPerimeterOfSquare(){
        //arrange
        int expectedPerimeterOfSquare = 40;

        //act
        int actualPerimeterOfSquare = rectangleObject.perimeterOfSquare(10);

        //assert
        assertEquals(expectedPerimeterOfSquare, actualPerimeterOfSquare);
    }


}
