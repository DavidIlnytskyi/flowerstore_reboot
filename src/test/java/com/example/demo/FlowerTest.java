package com.example.demo;

import com.example.demo.Flower.Flower;
import com.example.demo.Flower.FlowerColor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FlowerTest {

    @Test
    public void testGetColor() {
        FlowerColor color = FlowerColor.RED;
        Flower flower = new Flower("Rose", 20, color);

        assertEquals("#FF0000", flower.getColor());
    }

    @Test
    public void testGetDescription() {
        FlowerColor color = FlowerColor.BLUE;
        Flower flower = new Flower("Bluebell", 15, color);

        String expectedDescription = "Name: Bluebell, price: 15, color BLUE";
        assertEquals(expectedDescription, flower.getDescription());
    }

    // Add more test cases as needed for other functionalities in the Flower class
}
