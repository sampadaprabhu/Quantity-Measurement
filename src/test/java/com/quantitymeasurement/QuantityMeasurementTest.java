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
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement(0, Unit.FEET);
        boolean equalCheck = quantityMeasurement.equals(measurement);
        Assert.assertTrue(equalCheck);
    }

    @Test
    public void givenFeetValueZero_WhenNotEqual_ShouldReturnFalse() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement(12, Unit.FEET);
        boolean equalCheck = quantityMeasurement.equals(measurement);
        Assert.assertFalse(equalCheck);
    }

    @Test
    public void givenInchValueZero_WhenEqual_ShouldReturnTrue() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement(0, Unit.INCH);
        boolean equals = quantityMeasurement.equals(measurement);
        Assert.assertTrue(equals);
    }

    @Test
    public void givenInchValueZero_WhenNotEqual_ShouldReturnFalse() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement(12, Unit.INCH);
        boolean equals = quantityMeasurement.equals(measurement);
        Assert.assertFalse(equals);
    }

    @Test
    public void givenNullObjectReference_WhenEqual_ShouldReturnFalse() {
        QuantityMeasurement quantityMeasurement =null;
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
        double result = measurement.convert(0, Unit.INCH);
        Assert.assertEquals(0,result,0.0);
    }

    @Test
    public void given1FeetAnd1Inch_WhenNotEqual_ShouldReturnFalse() {
        double result = measurement.convert(1, Unit.INCH);
        Assert.assertNotEquals(1,result,0.0);
    }

    @Test
    public void given1InchAnd1Feet_WhenNotEqual_ShouldReturnFalse() {
        double result = measurement.convert(1, Unit.FEET);
        Assert.assertNotEquals(1,result,0.0);
    }

     @Test
    public void given1Feet12Inch_WhenEqual_ShouldReturnTrue() {
        double result = measurement.convert(12, Unit.INCH);
        Assert.assertEquals(1,result,0.0);
    }

    @Test
    public void given12Feet1Inch_WhenEqual_ShouldReturnTrue() {
        double result = measurement.convert(1, Unit.FEET);
        Assert.assertEquals(12,result,0.0);
    }
}
