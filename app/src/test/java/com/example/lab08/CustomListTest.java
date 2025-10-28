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
    void testDeleteException(){
        CustomList cityList = new CustomList();
        City city = new City("Yellowknife", "Northwest Territories");
        cityList.addCity(city);

        assertThrows(IllegalArgumentException.class, () -> {
            cityList.deleteCity(city);
        });
    }

    @Test
    void testCountCities(){
        CustomList cityList = new CustomList();
        City city = new City("Yellowknife", "Northwest Territories");
        cityList.addCity(city);
        assertEquals(1, cityList.countCities());

        cityList.add(new City("Yellowknife", "Northwest Territories"));
        cityList.add(new City("Toronto","Ontario"));
        assertEquals(3, cityList.countCities());
    }
}
