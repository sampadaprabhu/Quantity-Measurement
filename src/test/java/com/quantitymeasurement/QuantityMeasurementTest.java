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
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement(0, Unit.INCH_TO_FEET);
        boolean equalCheck = quantityMeasurement.equals(measurement);
        Assert.assertTrue(equalCheck);
    }

    @Test
    public void givenFeetValueZero_WhenNotEqual_ShouldReturnFalse() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement(12, Unit.INCH_TO_FEET);
        boolean equalCheck = quantityMeasurement.equals(measurement);
        Assert.assertFalse(equalCheck);
    }

    @Test
    public void givenInchValueZero_WhenEqual_ShouldReturnTrue() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement(0, Unit.FEET_TO_INCH);
        boolean equals = quantityMeasurement.equals(measurement);
        Assert.assertTrue(equals);
    }

    @Test
    public void givenInchValueZero_WhenNotEqual_ShouldReturnFalse() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement(12, Unit.FEET_TO_INCH);
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
        double result = measurement.convert(0, Unit.FEET_TO_INCH);
        Assert.assertEquals(0,result,0.0);
    }

    @Test
    public void given1FeetAnd1Inch_WhenNotEqual_ShouldReturnFalse() {
        double result = measurement.convert(1, Unit.FEET_TO_INCH);
        Assert.assertNotEquals(1,result,0.0);
    }

    @Test
    public void given1InchAnd1Feet_WhenNotEqual_ShouldReturnFalse() {
        double result = measurement.convert(1, Unit.INCH_TO_FEET);
        Assert.assertNotEquals(1,result,0.0);
    }

     @Test
    public void given1Feet12Inch_WhenEqual_ShouldReturnTrue() {
        double result = measurement.convert(12, Unit.FEET_TO_INCH);
        Assert.assertEquals(1,result,0.0);
    }

    @Test
    public void given12Feet1Inch_WhenEqual_ShouldReturnTrue() {
        double result = measurement.convert(1, Unit.INCH_TO_FEET);
        Assert.assertEquals(12,result,0.0);
    }

    @Test
    public void given3Feet1Yard_WhenEqual_ShouldReturnTrue() {
        double result = measurement.convert(1, Unit.YARD_TO_FEET);
        Assert.assertEquals(3,result,0.0);
    }

    @Test
    public void given1Feet1Yard_WhenNotEqual_ShouldReturnFalse() {
        double result = measurement.convert(1, Unit.YARD_TO_FEET);
        Assert.assertNotEquals(1,result,0.0);
    }

    @Test
    public void given1Inch1Yard_WhenNotEqual_ShouldReturnFalse() {
        double result = measurement.convert(1, Unit.YARD_TO_FEET);
        Assert.assertNotEquals(1,result,0.0);
    }
    @Test
    public void given1Yard36Inch_WhenEqual_ShouldReturnTrue() {
        double result = measurement.convert(36,Unit.INCH_TO_YARD);
        Assert.assertEquals(1,result,0.0);
    }

    @Test
    public void given36Inch1Yard_WhenEqual_ShouldReturnTrue() {
        double reult = measurement.convert(1,Unit.YARD_TO_INCH);
        Assert.assertEquals(36,reult,0.0);
    }

    @Test
    public void given1Yard3Feet_WhenEqual_ShouldReturnTrue() {
        double result = measurement.convert(3,Unit.FEET_TO_YARD);
        Assert.assertEquals(1,result,0.0);
    }
}
