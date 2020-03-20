package com.quantitymeasurement;

public enum Unit {
    INCH(1, UnitType.LENGTH),
    FEET(12, UnitType.LENGTH),
    YARD(36, UnitType.LENGTH),
    CENTIMETER(0.4, UnitType.LENGTH),
    GALLON(3780, UnitType.VOLUME),
    LITRE(1000, UnitType.VOLUME),
    ML(1, UnitType.VOLUME),
    KG(1000, UnitType.WEIGHT),
    TONNE(1000000, UnitType.WEIGHT),
    GRAMS(1, UnitType.WEIGHT),
    FAHRENHEIT(1, UnitType.TEMPERATURE),
    CELSIUS(2.12, UnitType.TEMPERATURE);


    public final UnitType unitType;
    public final double baseUnit;

    Unit(double value, UnitType unitType) {
        this.baseUnit = value;
        this.unitType = unitType;
    }
}

