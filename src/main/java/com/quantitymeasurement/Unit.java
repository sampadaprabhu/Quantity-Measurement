package com.quantitymeasurement;

import java.util.Objects;

public enum Unit {
    INCH_TO_FEET(0.083),
    FEET_TO_INCH(12),
    YARD_TO_FEET(3),
    INCH_TO_YARD(0.027),
    YARD_TO_INCH(36),
    FEET_TO_YARD(0.33),
    INCH_TO_CENTIMETER(2.5),
    INCH(2),
    CENTIMETER_TO_INCH(1),
    GALLON_TO_LITRE(3.78),
    LITRE_TO_ML(1000),
    ML_TO_LITRE(1),
    KG_TO_GRAMS(1000),
    TONNE_TO_KG(1000),
    GRAMS_TO_KG(1),
    FAHRENHEIT_TO_CELSIUS(0.4717);
    public double value;

    Unit(double value) {
        this.value = value;
    }
}

