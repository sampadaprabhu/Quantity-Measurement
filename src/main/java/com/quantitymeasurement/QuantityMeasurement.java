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

    public double convert(int quantity, Unit unit) {
            return Math.round(quantity*unit.value);
    }

    public double additionOfTwoUnits(Unit unit1, Unit unit2){
        return  (Math.round(unit1.value)+Math.round(unit2.value));
    }
}
