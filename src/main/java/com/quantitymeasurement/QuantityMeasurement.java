package com.quantitymeasurement;

import java.util.Objects;

public class QuantityMeasurement {
    double feetValue;

    public QuantityMeasurement(double value) {
        feetValue=value;
    }

    public QuantityMeasurement() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuantityMeasurement that = (QuantityMeasurement) o;
        return Double.compare(that.feetValue, feetValue) == 0;
    }
}
