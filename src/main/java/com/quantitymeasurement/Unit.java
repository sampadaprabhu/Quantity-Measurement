package com.quantitymeasurement;

import java.util.Objects;

public enum Unit {
    FEET_TO_INCH(0.083), INCH_TO_FEET(12), YARD_TO_FEET(3),INCH_TO_YARD (0.027),YARD_TO_INCH(36),FEET_TO_YARD(0.33), INCH_TO_CENTIMETER(2.5);
    public double value;

    Unit(double value) {
        this.value = value;
    }
}

