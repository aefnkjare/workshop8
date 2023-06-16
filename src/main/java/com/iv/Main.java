package com.iv;

import org.apache.commons.dbcp2.BasicDataSource;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        BasicDataSource basicDataSource = new BasicDataSource();

        String username = args[0];
        String password = args[1];

//        basicDataSource.setUrl("jdbc:mysql://us-cdbr-east-06.cleardb.net/heroku_4fe1d93c00fe86e?reconnect=true");
        basicDataSource.setUrl("jdbc:mysql://localhost:3306/dealership?reconnect=true");

        basicDataSource.setUsername(username);
        basicDataSource.setPassword(password);

        HotelDataManager hotelDataManager = new HotelDataManager(basicDataSource);

//        List<Hotel> hotels = hotelDataManager.searchByName("fun");
//        System.out.println(hotels);

//        System.out.println(hotels);

//        HotelDataManager hotelDataManager = new HotelDataManager();


//        Hotel hotel = hotelDataManager.getById(1);
//        System.out.println(hotel);

//        Hotel hotel = new Hotel("Isaiah's Insane Island of Insanity", 3, 1112);
//        hotelDataManager.create(hotel);

//        hotel.setTotalFloors(5);
//        hotelDataManager.update(14, hotel);
//        System.out.println(hotel);

//        hotelDataManager.delete(1);
//
//        hotelDataManager.delete(14);

        List<Hotel> hotels = hotelDataManager.filterByLargerTotalOccupancy(1000);
        System.out.println(hotels);
    }
}