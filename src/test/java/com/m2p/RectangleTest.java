package com.m2p;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static com.m2p.Rectangle.createSquare;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RectangleTest {
    Rectangle rectangleObjectForPositiveValues = new Rectangle(4,5);
    Rectangle rectangleObjectForNegativeValues =  new Rectangle( -4,5);

    Rectangle squareObjectForPositiveValues = createSquare(3);

    Rectangle squareObjectForNegativeValues = createSquare(-3);
    @Nested
    class RectangleOperations {
        @Test
        void toFindAreaOfRectangle() {
            //arrange
            int expectedArea = 20;

            //act
            int actualArea = rectangleObjectForPositiveValues.areaOfRectangle();

            //assert
            assertEquals(expectedArea, actualArea);
        }

        @Test
        void toThrowExceptionInAreaWhenValuesAreNegative() {
            assertThrows(IllegalArgumentException.class, () -> {
                rectangleObjectForNegativeValues.areaOfRectangle();
            });
        }

        @Test
        void toFindPerimeterOfRectangle() {
            //arrange
            int expectedPerimeter = 18;

            //act
            int actualPerimeter = rectangleObjectForPositiveValues.perimeterOfRectangle();

            //assert
            assertEquals(expectedPerimeter, actualPerimeter);
        }

        @Test
        void toThrowExceptionInPerimeterWhenValuesAreNegative() {
            assertThrows(IllegalArgumentException.class, () -> {
                rectangleObjectForNegativeValues.perimeterOfRectangle();
            });
        }
    }
    @Nested
    class SquareOperations{

        @Test
        void  toFindAreaOfSquare(){
            //arrange
            int expectedAreaOfSquare = 9;

            //act
            int actualAreaOfSquare = squareObjectForPositiveValues.areaOfRectangle();

            //assert
            assertEquals(expectedAreaOfSquare, actualAreaOfSquare);
        }

        @Test
        void toThrowExceptionInAreaOfSquareWhenValuesAreNegative() {
            assertThrows(IllegalArgumentException.class, () -> {
                squareObjectForNegativeValues.areaOfRectangle();
            });
        }


        @Test
        void toFindPerimeterOfSquare(){
            //arrange
            int expectedPerimeterOfSquare = 12;

            //act
            int actualPerimeterOfSquare = squareObjectForPositiveValues.perimeterOfRectangle();

            //assert
            assertEquals(expectedPerimeterOfSquare, actualPerimeterOfSquare);
        }

        @Test
        void toThrowExceptionInPerimeterOfSquareWhenValuesAreNegative() {
            assertThrows(IllegalArgumentException.class, () -> {
                squareObjectForNegativeValues.perimeterOfRectangle();
            });
        }
    }

}
