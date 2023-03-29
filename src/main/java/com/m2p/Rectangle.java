package com.m2p;


public class Rectangle {
     private int length;
     private int breadth;

     private int sideOfSquare;

    public Rectangle(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }
    public static Rectangle createSquare(int sideOfSquare){
        return new Rectangle(sideOfSquare ,sideOfSquare);

    }
    int areaOfRectangle() throws IllegalArgumentException {
        if(length < 0 || breadth < 0)
            throw new IllegalArgumentException("Enter positive value.");

        return length * breadth;
    }

    int perimeterOfRectangle() throws IllegalArgumentException {
        if(length < 0 || breadth < 0)
            throw new IllegalArgumentException("Enter positive value.");

        return 2 * (length + breadth);
    }

}
