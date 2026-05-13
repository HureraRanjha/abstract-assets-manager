package com.pluralsight;

public abstract class Cash extends Asset
{
    double cash;

    public Cash(String description, String dateAcquired, double originalCost, double cash)
    {
        super(description, dateAcquired, originalCost);
        this.cash = cash;
    }

    abstract public double getValue();
}
