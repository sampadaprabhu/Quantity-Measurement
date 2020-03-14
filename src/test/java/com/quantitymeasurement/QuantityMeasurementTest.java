package com.quantitymeasurement;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class QuantityMeasurementTest {
    QuantityMeasurement measurement;

    @Before
    public void setUp() throws Exception {
        measurement=new QuantityMeasurement();
    }

    @Test
    public void givenFeetValueZero_WhenEqual_ShouldReturnTrue() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement(0);
        boolean equalCheck = quantityMeasurement.equals(measurement);
        Assert.assertTrue(equalCheck);
    }
    @Test
    public void givenFeetValueZero_WhenNotEqual_ShouldReturnFalse() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement(12);
        boolean equalCheck = quantityMeasurement.equals(measurement);
        Assert.assertFalse(equalCheck);
    }
}
