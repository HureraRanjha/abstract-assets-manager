package com.pluralsight;

import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Asset> assets = new ArrayList<>();

        Asset house1 = new House("This is my original house", "02/20/2025", 1_000_000, "105 village east", 2, 3400, 4000);
        assets.add(house1);

        Asset house2 = new House("This is VACCTION HOUSE", "NOW", 250_000, "Great Britan Where Dave lives", 1, 1500, 2000);
        assets.add(house2);

        Asset vehicle1 = new Vehicle("This is my ferrari", "04/13/98", 100_000, "Ferrari Spider", 1998, 60000 );
        assets.add(vehicle1);

        Asset vehicle2 = new Vehicle("Moms car", "05/20/06", 60_000, "Toyota Highlander", 2006, 150000 );
        assets.add(vehicle2);

        for(Asset a: assets)
        {
            System.out.println(a.getDescription() + "|" + a.getDateAcquired() + "|" + a.getOriginalCost() + "|" + a.getValue());
            if(a instanceof House)
            {
                House house = (House) a;
                System.out.printf("Address: %s, | Value: %.2f \n", house.getAddress(), house.getValue());
            }
            else if(a instanceof Vehicle)
            {
                Vehicle vehicle = (Vehicle) a;
                System.out.printf("Year: %d, | MakeModel: %s \n", vehicle.getYear(), vehicle.getMakeModel());
            }
        }

    }
}
