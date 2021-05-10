package com.company;

public class greenBeans {

    private String variety;   // must not be set to empty
    private double podLength; // must be set to a value greater than zero
    private int numOfSeeds;   // must be set to a value of zero or greater

    public greenBeans() {  // public default constructor
        variety = null;
    }
    public greenBeans(String t, double b, int a) { // parametrized constructor w/ parameters for each private field
        variety = t;                               // variables
        podLength = b;
        numOfSeeds = a;
    }

    public String getType() {  // getter for type
        return variety;
    }
    public void setType(String type) {  // setter for type
        this.variety = type;
    }


    public double getPodLength() {   // getter for podLength
        return podLength;

    }
    public void setPodLength(double b) {   // setter for podLength
        this.podLength = b;
    }

    public int getNumOfSeeds() {  // getter for numOfSeeds
        return numOfSeeds;
    }
    public void setNumOfSeeds(int a) {  // setter for numOfSeeds
        this.numOfSeeds = a;
    }

}
