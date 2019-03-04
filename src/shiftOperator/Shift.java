package shiftOperator;

public class Shift {

    int shiftTwoRight() {

        int mybyteRight = -5;

        mybyteRight = mybyteRight >> 2;
        return  mybyteRight;

    }

    int shiftUnTwoRight() {
        int mybyteUnRight = -5;

        mybyteUnRight = mybyteUnRight >>> 2;
        return mybyteUnRight;

    }

    int shiftTwoLeft() {
        int mybyteleft = -5;

        mybyteleft = mybyteleft << 2;
        return mybyteleft;

    }

}
