package com.quantitymeasurement;

public enum OutputUnit {
    KILOGRAMS(0.001),
    LITRES(0.001);

    public final double value;

    OutputUnit(double value) {
        this.value = value;
    }
}

