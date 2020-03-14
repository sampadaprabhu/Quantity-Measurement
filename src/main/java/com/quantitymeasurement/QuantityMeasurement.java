package com.quantitymeasurement;

import java.util.Objects;

public class QuantityMeasurement {
    double feetValue;
    double inchValue;

    public QuantityMeasurement(double value,double inchValue) {
        feetValue=value;
        this.inchValue=inchValue;
    }


    public QuantityMeasurement() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuantityMeasurement that = (QuantityMeasurement) o;
        return Double.compare(that.feetValue, feetValue) == 0 &&
                Double.compare(that.inchValue, inchValue) == 0;
    }
}
