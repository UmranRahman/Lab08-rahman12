package com.example.lab08;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CustomListTest {

    @Test
    public void testHasCity() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary","AB");
        list.addCity(calgary);

        assertTrue(list.hasCity(calgary));
    }

    @Test
    void testDelete(){
        CustomList cityList = new CustomList();
        City calgary = new City("Calgary","AB");
        cityList.addCity(calgary);
        assertTrue(cityList.hasCity(calgary));
        cityList.deleteCity(calgary);
        assertFalse(cityList.hasCity(calgary));
        assertEquals(0, cityList.countCities());
    }

    @Test
    void testCountCities(){
        CustomList cityList = new CustomList();
        City city = new City("Yellowknife", "Northwest Territories");
        cityList.addCity(city);
        assertEquals(1, cityList.countCities());

        cityList.addCity(new City("Yellowknife", "Northwest Territories"));
        cityList.addCity(new City("Toronto","Ontario"));
        assertEquals(3, cityList.countCities());
    }
}
