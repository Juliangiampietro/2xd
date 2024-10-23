package service;

import model.Airport;

import java.util.ArrayList;
import java.util.List;

public class AirportService {

    public void minCapacity (ArrayList<Airport> airportList,Integer capacityMax ,ArrayList<Airport> minCapacityAirports){

        try{
        Integer i = 0;
        for (Airport a: airportList) {
            if(airportList.get(i).getCapacidad() > capacityMax{
                minCapacityAirports.add(airportList.get(i));
                i++;
            }

        }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
