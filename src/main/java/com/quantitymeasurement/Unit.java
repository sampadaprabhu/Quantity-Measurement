package com.quantitymeasurement;

import java.util.Objects;

public enum Unit {
    INCH(0.12), FEET(12);

    public double value;

    Unit(double value) {
        this.value = value;
    }

}

