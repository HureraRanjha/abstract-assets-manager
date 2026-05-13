package com.pluralsight;

public class Cash extends Asset
{
    double cash;

    public Cash(String description, String dateAcquired, double originalCost, double cash)
    {
        super(description, dateAcquired, originalCost);
        this.cash = cash;
    }

    public double getValue()
    {
        return this.cash;
    }
}
