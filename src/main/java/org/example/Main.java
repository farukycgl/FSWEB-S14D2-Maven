package org.example;

import org.example.model.*;
import org.example.model.enums.LampType;
import org.example.model.enums.PaintColor;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Bedroom bedroom = new Bedroom("osman",
                        new Wall("left"),
                        new Wall("right"),
                        new Wall("up"),
                        new Wall("down"),
                        new Ceiling(15, PaintColor.GREEN),
                        new Bed("Çift kişilik", 2, 15, 1, 1),
                        new Lamp(LampType.NORMAL, true, 5),
                        new Wardrobe(15, 12, 1.02),
                        new Carpet(12, 15, PaintColor.WHITE));

        System.out.println(bedroom);
    }
}