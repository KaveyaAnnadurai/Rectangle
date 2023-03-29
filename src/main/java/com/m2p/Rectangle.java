package com.m2p;


public class Rectangle {
    int areaOfRectangle(int length, int breadth) throws IllegalArgumentException {
        if(length < 0 || breadth < 0)
            throw new IllegalArgumentException("Enter positive value.");

        return length * breadth;
    }

    int perimeterOfRectangle(int length, int breadth) throws IllegalArgumentException {
        if(length < 0 || breadth < 0)
            throw new IllegalArgumentException("Enter positive value.");

        return 2 * (length + breadth);
    }

    int areaOfSquare(int length) throws IllegalArgumentException{
        if(length < 0)
            throw  new IllegalArgumentException("Enter positive value.");
        return length * length;
    }

    int perimeterOfSquare(int length) throws IllegalArgumentException{
        if(length < 0)
            throw  new IllegalArgumentException("Enter positive value.");
        return 4 * length;
    }

}
