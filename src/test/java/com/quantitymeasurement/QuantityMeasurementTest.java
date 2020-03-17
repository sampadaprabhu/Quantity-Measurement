package com.quantitymeasurement;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class QuantityMeasurementTest {
    QuantityMeasurement measurement;

    @Before
    public void setUp() throws Exception {
        measurement = new QuantityMeasurement();
    }

    @Test
    public void givenFeetValueZero_WhenEqual_ShouldReturnTrue() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement(0, Unit.FEET_TO_INCH);
        boolean equalCheck = quantityMeasurement.equals(measurement);
        Assert.assertTrue(equalCheck);
    }

    @Test
    public void givenFeetValueZero_WhenNotEqual_ShouldReturnFalse() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement(12, Unit.FEET_TO_INCH);
        boolean equalCheck = quantityMeasurement.equals(measurement);
        Assert.assertFalse(equalCheck);
    }

    @Test
    public void givenInchValueZero_WhenEqual_ShouldReturnTrue() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement(0, Unit.INCH_TO_FEET);
        boolean equals = quantityMeasurement.equals(measurement);
        Assert.assertTrue(equals);
    }

    @Test
    public void givenInchValueZero_WhenNotEqual_ShouldReturnFalse() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement(12, Unit.INCH_TO_FEET);
        boolean equals = quantityMeasurement.equals(measurement);
        Assert.assertFalse(equals);
    }

    @Test
    public void givenNullObjectReference_WhenEqual_ShouldReturnFalse() {
        QuantityMeasurement quantityMeasurement = null;
        boolean equals = measurement.equals(quantityMeasurement);
        Assert.assertFalse(equals);
    }

    @Test
    public void givenType_WhenNotEqual_ShouldReturnFalse() {
        boolean equals = measurement.equals(new QuantityMeasurementTest());
        Assert.assertFalse(equals);
    }

    @Test
    public void givenSameReferenceForSameClass_WhenEqual_ShouldReturnTrue() {
        boolean equals = measurement.equals(measurement);
        Assert.assertTrue(equals);
    }

    @Test
    public void givenFeetAndInch_WhenZero_ShouldReturnEqual() {
        double result = measurement.convert(0, Unit.INCH_TO_FEET);
        Assert.assertEquals(0, result, 0.0);
    }

    @Test
    public void given1FeetAnd1Inch_WhenNotEqual_ShouldReturnFalse() {
        double result = measurement.convert(1, Unit.INCH_TO_FEET);
        Assert.assertNotEquals(1, result, 0.0);
    }

    @Test
    public void given1InchAnd1Feet_WhenNotEqual_ShouldReturnFalse() {
        double result = measurement.convert(1, Unit.FEET_TO_INCH);
        Assert.assertNotEquals(1, result, 0.0);
    }

    @Test
    public void given1Feet12Inch_WhenEqual_ShouldReturnTrue() {
        double result = measurement.convert(12, Unit.INCH_TO_FEET);
        Assert.assertEquals(1, result, 0.0);
    }

    @Test
    public void given12Feet1Inch_WhenEqual_ShouldReturnTrue() {
        double result = measurement.convert(1, Unit.FEET_TO_INCH);
        Assert.assertEquals(12, result, 0.0);
    }

    @Test
    public void given3Feet1Yard_WhenEqual_ShouldReturnTrue() {
        double result = measurement.convert(1, Unit.YARD_TO_FEET);
        Assert.assertEquals(3, result, 0.0);
    }

    @Test
    public void given1Feet1Yard_WhenNotEqual_ShouldReturnFalse() {
        double result = measurement.convert(1, Unit.YARD_TO_FEET);
        Assert.assertNotEquals(1, result, 0.0);
    }

    @Test
    public void given1Inch1Yard_WhenNotEqual_ShouldReturnFalse() {
        double result = measurement.convert(1, Unit.YARD_TO_FEET);
        Assert.assertNotEquals(1, result, 0.0);
    }

    @Test
    public void given1Yard36Inch_WhenEqual_ShouldReturnTrue() {
        double result = measurement.convert(36, Unit.INCH_TO_YARD);
        Assert.assertEquals(1, result, 0.0);
    }

    @Test
    public void given36Inch1Yard_WhenEqual_ShouldReturnTrue() {
        double result = measurement.convert(1, Unit.YARD_TO_INCH);
        Assert.assertEquals(36, result, 0.0);
    }

    @Test
    public void given1Yard3Feet_WhenEqual_ShouldReturnTrue() {
        double result = measurement.convert(3, Unit.FEET_TO_YARD);
        Assert.assertEquals(1, result, 0.0);
    }

    @Test
    public void given2Inch5CM_WhenEqual_ShouldReturnTrue() {
        double result = measurement.convert(2, Unit.INCH_TO_CENTIMETER);
        Assert.assertEquals(5, result, 0.0);
    }

    @Test
    public void givenAdditionOf2InchAnd2Inch_WhenEqual_ShouldReturnTrue() {
        double result = measurement.additionOfTwoUnits(Unit.INCH, Unit.INCH);
        Assert.assertEquals(4, result, 0.0);
    }

    @Test
    public void givenAdditionOf1Feet2Inch_WhenEqual_ShouldReturnTrue() {
        double result = measurement.additionOfTwoUnits(Unit.FEET_TO_INCH, Unit.INCH);
        Assert.assertEquals(14, result, 0.0);
    }

    @Test
    public void givenAdditionOf1Feet1Feet_WhenEqual_ShouldReturnTrue() {
        double result = measurement.additionOfTwoUnits(Unit.FEET_TO_INCH, Unit.FEET_TO_INCH);
        Assert.assertEquals(24, result, 0.0);
    }

    @Test
    public void givenAdditionOfInchAndCentimeter_WhenEqual_ShouldReturnTrue() {
        double result = measurement.additionOfTwoUnits(Unit.CENTIMETER_TO_INCH, Unit.INCH);
        Assert.assertEquals(3, result, 0.0);
    }

    @Test
    public void givenGallonAndLitres_WhenEqual_ShouldReturnTrue() {
        double result = measurement.convert(1, Unit.GALLON_TO_LITRE);
        Assert.assertEquals(4, result, 0.0);
    }

    @Test
    public void givenLitreAndMilliLitre_WhenEqual_ShouldReturnTrue() {
        double result = measurement.convert(1, Unit.LITRE_TO_ML);
        Assert.assertEquals(1000, result, 0.0);
    }

    @Test
    public void givenAdditionOfGallonAndLitre_WhenEqual_ShouldReturnTrue() {
        double result = measurement.additionOfTwoUnits(Unit.GALLON_TO_LITRE, Unit.GALLON_TO_LITRE);
        Assert.assertEquals(8, result, 0.0);
    }

    @Test
    public void givenAdditionOfLitreAndMilliLitre_WhenEqual_ShouldReturnTrue() {
        double result = measurement.additionOfTwoUnits(Unit.ML_TO_LITRE, Unit.ML_TO_LITRE);
        Assert.assertEquals(2, result, 0.0);
    }

    @Test
    public void givenKGAndGrams_WhenEqual_ShouldReturnTrue() {
        double result = measurement.convert(1, Unit.KG_TO_GRAMS);
        Assert.assertEquals(1000, result, 0.0);
    }

    @Test
    public void givenTonneAndKG_WhenEqual_ShouldReturnTrue() {
        double result = measurement.convert(1, Unit.TONNE_TO_KG);
        Assert.assertEquals(1000, result, 0.0);
    }

    @Test
    public void givenAdditionOfTonneAndGrams_WhenEqual_ShouldReturnTrue() {
        double result = measurement.additionOfTwoUnits(Unit.TONNE_TO_KG, Unit.GRAMS_TO_KG);
        Assert.assertEquals(1001, result, 0.0);
    }

    @Test
    public void givenCelsiusAndFahrenheit_WhenEqual_ShouldReturnTrue() {
        double result = measurement.convert(212, Unit.FAHRENHEIT_TO_CELSIUS);
        Assert.assertEquals(100, result, 0.0);
    }
}