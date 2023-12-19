package com.example.demo;

import com.example.demo.ItemDecorator.BasketDecorator;
import com.example.demo.ItemDecorator.KibbOnDecorator;
import com.example.demo.ItemDecorator.PaperDecorator;
import com.example.demo.Order.Item;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DecorationTest {

    @Test
    public void testBasketDecoratorGetPrice() {
        Item item = new Item("Rose", 20.0);
        BasketDecorator basketDecorator = new BasketDecorator();

        double decoratedPrice = basketDecorator.getPrice(item);

        assertEquals(24.0, decoratedPrice, 0.01);
    }

    @Test
    public void testBasketDecoratorGetDescription() {
        BasketDecorator basketDecorator = new BasketDecorator();

        String description = basketDecorator.getDescription();

        assertEquals("You are using basket decoration for flowers.", description);
    }

    @Test
    public void testKibbOnDecoratorGetPrice() {
        Item item = new Item("Lily", 30.0);
        KibbOnDecorator kibbOnDecorator = new KibbOnDecorator();

        double decoratedPrice = kibbOnDecorator.getPrice(item);

        assertEquals(70.0, decoratedPrice, 0.01);
    }

    @Test
    public void testKibbOnDecoratorGetDescription() {
        KibbOnDecorator kibbOnDecorator = new KibbOnDecorator();

        String description = kibbOnDecorator.getDescription();

        assertEquals("You are using kibb-on decoration for flowers.", description);
    }

    @Test
    public void testPaperDecoratorGetPrice() {
        Item item = new Item("Tulip", 25.0);
        PaperDecorator paperDecorator = new PaperDecorator();

        double decoratedPrice = paperDecorator.getPrice(item);

        assertEquals(38.0, decoratedPrice, 0.01);
    }

    @Test
    public void testPaperDecoratorGetDescription() {
        PaperDecorator paperDecorator = new PaperDecorator();

        String description = paperDecorator.getDescription();

        assertEquals("You are using paper decoration for flowers.", description);
    }
}
