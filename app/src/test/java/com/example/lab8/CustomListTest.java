package com.example.lab8;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


//import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {

    private CustomList list;

    /**
     * create a mocklist for my citylist
     * @return
     */
    public CustomList MockCityList(){
        list = new CustomList(null,new ArrayList<>());
        return list;
    }



    /**
     * get the size of the list
     * increase the list by adding a new city
     * check if our current size matches the initial size
     plus one
     */
    @Test
    public void addCityTest(){
        list = MockCityList();
        int listSize = list.getCount();
        list.addCity(new City("Estevan", "SK"));
        assertEquals(list.getCount(),listSize + 1);
    }

    /**
     * add a city to the list
     * check if the city is in the list
     */
    @Test
    public void hasCityTest() {
        list = MockCityList();
        City newCity = new City("Victoria", "BC");
        list.addCity(newCity);
        assertTrue(list.hasCity(newCity));
    }

    /**
     * add a city to the list
     * find the number of cities in the list
     * delete a city
     * check if the list has the right number of cities
     */
    @Test
    public void deleteCityTest() {
        list = MockCityList();
        City newCity = new City("Victoria", "BC");

        list.addCity(newCity);
        int listSize = list.getCount();
        list.deleteCity(newCity);

        assertEquals(list.getCount(),listSize - 1);
    }


    /**
     * add 2 cities to the list
     * find the number of cities in the list
     * check if getCities returns the same number
     */
    @Test
    public void countCitiesTest() {
        list = MockCityList();
        City newCity = new City("Edmonton", "AB");
        City secondCity = new City("Edmonton", "AB");

        list.addCity(newCity);
        list.addCity(secondCity);
        int listSize = list.getCount();

        assertEquals(list.countCities(),listSize - 1);
    }




}
