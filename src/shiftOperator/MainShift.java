/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shiftOperator;

import java.io.*;

/**
 *
 * @author subarashii
 */
public class MainShift {

    public static void main(String[] args) {

        Shift s = new Shift();
        byte myByte = -5;
        byte myByte2 = (byte) s.shiftTwoRight();
        byte myByte3 = (byte) s.shiftUnTwoRight();
        byte myByte4 = (byte) s.shiftTwoLeft();
        byte[] myArray = {myByte};
        byte[] myArray2 = {myByte2};
        byte[] myArray3 = {myByte3};
        byte[] myArray4 = {myByte4};

        ByteArrayInputStream in1 = new ByteArrayInputStream(myArray);
        ByteArrayInputStream in2 = new ByteArrayInputStream(myArray2);
        ByteArrayInputStream in3 = new ByteArrayInputStream(myArray3);
        ByteArrayInputStream in4 = new ByteArrayInputStream(myArray4);

        System.out.println("byte number = " +  myByte);
        int myInt1 = in1.read();
        System.out.println("int number  = " + myInt1);
        System.out.println("bynary -5      = " + Integer.toBinaryString(myByte));
        System.out.println("************************************************");

        int myInt2 = in2.read();
        System.out.println("shift byte number -5 >> 2 = " + (byte) s.shiftTwoRight());
        System.out.println("int number -5 = " + myInt2);
        System.out.println("bynary -5 >> 2 = " + Integer.toBinaryString(myInt2));
        System.out.println("bynary -5 >> 2 = " + Integer.toBinaryString(s.shiftTwoRight()));
        System.out.println("************************************************");

        int myInt3 = in3.read();

        System.out.println("shift byte number -5 >>> 2 = " + (byte) s.shiftUnTwoRight());
        System.out.println("int number >>> -5 of byte = " + myInt3);
        System.out.println("int number >>> -5 of int  = " + s.shiftUnTwoRight());
        System.out.println("bynary-5 >>> 2 = " + Integer.toBinaryString(myInt3));
        System.out.println("bynary-5 >>> 2 = " + Integer.toBinaryString((s.shiftUnTwoRight())));

        System.out.println("************************************************");

        int myInt4 = in4.read();
        // can't unsigned left shift <<< 
        System.out.println("shift byte number -5 << 2 = " + (byte) s.shiftTwoLeft());
        System.out.println("int number -5 = " + myInt4);
          
        System.out.println("bynary -5 << 2 = " + Integer.toBinaryString(s.shiftTwoLeft()));
        System.out.println("can't unsigned left shift <<<  ");
        System.out.println("************************************************");

    }
}
