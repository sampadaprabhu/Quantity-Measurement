package com.quantitymeasurement;

public class QuantityMeasurement {
    double measurement;

    public QuantityMeasurement() {
    }

    public QuantityMeasurement(int value, Unit unitType) {
        this.measurement = value * unitType.value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuantityMeasurement that = (QuantityMeasurement) o;
        return Double.compare(that.measurement, measurement) == 0;
    }

    public double convert(int inch, Unit inchUnit) {
            return Math.round(inch*inchUnit.value);
    }
}
