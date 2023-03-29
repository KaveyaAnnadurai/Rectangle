package com.m2p;

class ExceptionToHandleNegativeValues extends Exception {
    public ExceptionToHandleNegativeValues(String s)
    {
        // Call constructor of parent Exception
        super(s);
    }
}
public class Geometry  {
    int areaOfRectangle(int length, int breadth) throws ExceptionToHandleNegativeValues {
        if(length < 0 || breadth < 0)
            throw new ExceptionToHandleNegativeValues("Enter positive value.");
        return length*breadth;
    }


}
