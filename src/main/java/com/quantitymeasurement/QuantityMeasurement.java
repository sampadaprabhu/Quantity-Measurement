package com.quantitymeasurement;

public class QuantityMeasurement {
    Unit unit;
    double quantity;

    public QuantityMeasurement(double value, Unit unit) {
        quantity = value;
        this.unit = unit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        QuantityMeasurement that = (QuantityMeasurement) o;
        if (that.unit == null) return false;
        if (unit.unitType == null || that.unit.unitType == null || unit.unitType != that.unit.unitType) return false;
        return Double.compare(that.quantity * that.unit.baseUnit, this.quantity * this.unit.baseUnit) == 0;
    }

    public double additionOfTwoUnits(QuantityMeasurement quantityObject1, QuantityMeasurement quantityObject2, OutputUnit unit) {
        double addition = (quantityObject1.unit.baseUnit * quantityObject1.quantity) +
                (quantityObject2.unit.baseUnit * quantityObject2.quantity);
        if (unit != null)
            return Math.round(100 * unit.value * addition) / 100D;
        return addition;
    }
}
