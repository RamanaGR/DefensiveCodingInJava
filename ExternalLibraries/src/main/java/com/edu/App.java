package com.edu;

import com.edu.entities.Booking;
import com.edu.entities.Passenger;

import java.util.List;

public class App {


    public static void main(String[] args){

        new Booking("1234", List.of(new Passenger()), null);

    }
}
