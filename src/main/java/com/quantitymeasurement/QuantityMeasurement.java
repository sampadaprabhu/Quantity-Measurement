package com.quantitymeasurement;

public class QuantityMeasurement {
    double measurement;

    public QuantityMeasurement() { }

    public QuantityMeasurement(int value, Unit feet) {
        this.measurement = value * feet.value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuantityMeasurement that = (QuantityMeasurement) o;
        return Double.compare(that.measurement, measurement) == 0;

    }

}
