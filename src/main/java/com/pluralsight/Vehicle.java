package com.pluralsight;

import java.time.LocalDate;

public class Vehicle extends Asset
{
    String makeModel;
    int year;
    int odometer;

    public Vehicle(String description, String dateAcquired, double originalCost, String makeModel, int year, int odometer)
    {
        super(description, dateAcquired, originalCost);
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }

    @Override
    public double getValue()
    {
        int currentYear = LocalDate.now().getYear();

        int calcYear = currentYear - year;
        double reducedCostPercent = 0;
        double reducedCost = 0;
        if(calcYear >= 0 && calcYear <= 3)  reducedCostPercent = 0.03;
        else if (calcYear < 7) reducedCostPercent = 0.06;
        else if (calcYear < 11) reducedCostPercent = 0.08;
        else reducedCost = 1000;

        if(odometer > 100_000 && !(makeModel.contains("honda") || makeModel.contains("toyota")))
        {
            reducedCostPercent += 0.25;
        }

        return originalCost * (1 - reducedCostPercent) - reducedCost;
    }

}
