/*
 Sophia Gorman
 SDEV200 - Assignment 12.9
 3/30/2025
 */

public class BinaryFormatException extends NumberFormatException {
    private String binaryString;
    
    public BinaryFormatException(String binaryString) {
        super(binaryString + " is not a binary string!");
        this.binaryString = binaryString;
    }

    public String getBinaryString() {
        return binaryString;
    }
}
