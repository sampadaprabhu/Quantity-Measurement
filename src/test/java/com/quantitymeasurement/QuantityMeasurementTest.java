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
}
