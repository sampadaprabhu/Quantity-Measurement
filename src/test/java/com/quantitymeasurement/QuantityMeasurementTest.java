package com.quantitymeasurement;

import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {


    @Test
    public void givenFeetValueZero_WhenEqual_ShouldReturnTrue() {
        QuantityMeasurement inch1 = new QuantityMeasurement(0, Unit.INCH);
        QuantityMeasurement inch2 = new QuantityMeasurement(0, Unit.INCH);
        Assert.assertEquals(inch1, inch2);
    }

    @Test
    public void givenFeetValueZero_WhenNotEqual_ShouldReturnFalse() {
        QuantityMeasurement feet1 = new QuantityMeasurement(12, Unit.FEET);
        QuantityMeasurement feet2 = new QuantityMeasurement(1, Unit.FEET);

        Assert.assertNotEquals(feet1, feet2);
    }

    @Test
    public void givenInchValueZero_WhenEqual_ShouldReturnTrue() {
        QuantityMeasurement inch1 = new QuantityMeasurement(0, Unit.INCH);
        QuantityMeasurement inch2 = new QuantityMeasurement(0, Unit.INCH);
        Assert.assertEquals(inch1, inch2);
    }

    @Test
    public void givenInchValueZero_WhenNotEqual_ShouldReturnFalse() {
        QuantityMeasurement inch1 = new QuantityMeasurement(12, Unit.INCH);
        QuantityMeasurement inch2 = new QuantityMeasurement(0, Unit.INCH);
        Assert.assertNotEquals(inch1, inch2);
    }

    @Test
    public void givenNullObjectReference_WhenEqual_ShouldReturnFalse() {
        QuantityMeasurement inch1 = new QuantityMeasurement(12, Unit.INCH);
        QuantityMeasurement inch2 = new QuantityMeasurement(0, null);
        Assert.assertFalse(inch1.equals(inch2));
    }

    @Test
    public void givenType_WhenNotEqual_ShouldReturnFalse() {
        QuantityMeasurement inch = new QuantityMeasurement(12, Unit.INCH);
        QuantityMeasurement fahrenheit = new QuantityMeasurement(12, Unit.FAHRENHEIT);
        Assert.assertNotEquals(inch, fahrenheit);
    }

    @Test
    public void givenSameReferenceForSameClass_WhenEqual_ShouldReturnTrue() {
        QuantityMeasurement inch1 = new QuantityMeasurement(12, Unit.INCH);
        boolean equals = inch1.equals(inch1);
        Assert.assertTrue(equals);
    }

    @Test
    public void givenFeetAndInch_WhenZero_ShouldReturnEqual() {
        QuantityMeasurement feet = new QuantityMeasurement(0, Unit.FEET);
        QuantityMeasurement inch = new QuantityMeasurement(0, Unit.INCH);
        Assert.assertEquals(feet, inch);
    }

    @Test
    public void given1FeetAnd1Inch_WhenNotEqual_ShouldReturnFalse() {
        QuantityMeasurement inch = new QuantityMeasurement(1, Unit.INCH);
        QuantityMeasurement feet = new QuantityMeasurement(1, Unit.FEET);
        Assert.assertNotEquals(inch, feet);
    }

    @Test
    public void given1InchAnd1Feet_WhenNotEqual_ShouldReturnFalse() {
        QuantityMeasurement feet = new QuantityMeasurement(1, Unit.FEET);
        QuantityMeasurement inch = new QuantityMeasurement(1, Unit.INCH);
        Assert.assertNotEquals(feet, inch);
    }

    @Test
    public void given1Feet12Inch_WhenEqual_ShouldReturnTrue() {
        QuantityMeasurement inch = new QuantityMeasurement(12, Unit.INCH);
        QuantityMeasurement feet = new QuantityMeasurement(1, Unit.FEET);
        Assert.assertEquals(inch, feet);
    }

    @Test
    public void given12Inch1Feet_WhenEqual_ShouldReturnTrue() {
        QuantityMeasurement inch = new QuantityMeasurement(12, Unit.INCH);
        QuantityMeasurement feet = new QuantityMeasurement(1, Unit.FEET);
        Assert.assertEquals(inch, feet);
    }

    @Test
    public void given3Feet1Yard_WhenEqual_ShouldReturnTrue() {
        QuantityMeasurement yard = new QuantityMeasurement(1, Unit.YARD);
        QuantityMeasurement feet = new QuantityMeasurement(3, Unit.FEET);
        Assert.assertEquals(yard, feet);
    }

    @Test
    public void given1Feet1Yard_WhenNotEqual_ShouldReturnFalse() {
        QuantityMeasurement yard = new QuantityMeasurement(1, Unit.YARD);
        QuantityMeasurement feet = new QuantityMeasurement(1, Unit.FEET);
        Assert.assertNotEquals(yard, feet);
    }

    @Test
    public void given1Inch1Yard_WhenNotEqual_ShouldReturnFalse() {

        QuantityMeasurement yard = new QuantityMeasurement(1, Unit.YARD);
        QuantityMeasurement inch = new QuantityMeasurement(1, Unit.INCH);
        Assert.assertNotEquals(yard, inch);
    }

    @Test
    public void given1Yard36Inch_WhenEqual_ShouldReturnTrue() {
        QuantityMeasurement yard = new QuantityMeasurement(1, Unit.YARD);
        QuantityMeasurement inch = new QuantityMeasurement(36, Unit.INCH);
        Assert.assertEquals(yard, inch);
    }

    @Test
    public void given36Inch1Yard_WhenEqual_ShouldReturnTrue() {
        QuantityMeasurement yard = new QuantityMeasurement(1, Unit.YARD);
        QuantityMeasurement inch = new QuantityMeasurement(13, Unit.INCH);
        Assert.assertNotEquals(inch, yard);
    }

    @Test
    public void given1Yard3Feet_WhenEqual_ShouldReturnTrue() {
        QuantityMeasurement yard = new QuantityMeasurement(1, Unit.YARD);
        QuantityMeasurement feet = new QuantityMeasurement(13, Unit.FEET);
        Assert.assertNotEquals(feet, yard);
    }

    @Test
    public void given2Inch5CM_WhenEqual_ShouldReturnTrue() {
        QuantityMeasurement centimeter = new QuantityMeasurement(5, Unit.CENTIMETER);
        QuantityMeasurement inch = new QuantityMeasurement(2, Unit.INCH);
        Assert.assertEquals(centimeter, inch);
    }

    @Test
    public void givenAdditionOf2InchAnd2Inch_WhenEqual_ShouldReturnTrue() {
        QuantityMeasurement inch1 = new QuantityMeasurement(2, Unit.INCH);
        QuantityMeasurement inch2 = new QuantityMeasurement(2, Unit.INCH);
        double result = inch1.additionOfTwoUnits(inch1, inch2);
        Assert.assertEquals(4, result, 0.0);
    }

    @Test
    public void givenAdditionOf1Feet2Inch_WhenEqual_ShouldReturnTrue() {
        QuantityMeasurement inch = new QuantityMeasurement(2, Unit.INCH);
        QuantityMeasurement feet = new QuantityMeasurement(1, Unit.FEET);
        double result = inch.additionOfTwoUnits(inch, feet);
        Assert.assertEquals(14, result, 0.0);
    }

    @Test
    public void givenAdditionOf1Feet1Feet_WhenEqual_ShouldReturnTrue() {
        QuantityMeasurement inch = new QuantityMeasurement(1, Unit.FEET);
        QuantityMeasurement feet = new QuantityMeasurement(1, Unit.FEET);
        double result = inch.additionOfTwoUnits(feet, feet);
        Assert.assertEquals(24, result, 0.0);
    }

    @Test
    public void givenAdditionOfInchAndCentimeter_WhenEqual_ShouldReturnTrue() {
        QuantityMeasurement inch = new QuantityMeasurement(2, Unit.INCH);
        QuantityMeasurement centimeter = new QuantityMeasurement(2.5, Unit.CENTIMETER);
        double result = inch.additionOfTwoUnits(inch, centimeter);
        Assert.assertEquals(3, result, 0.0);
    }

    @Test
    public void givenGallonAndLitres_WhenEqual_ShouldReturnTrue() {
        QuantityMeasurement litre = new QuantityMeasurement(3.78, Unit.LITRE);
        QuantityMeasurement gallon = new QuantityMeasurement(1, Unit.GALLON);
        Assert.assertEquals(litre, gallon);
    }

    @Test
    public void givenLitreAndMilliLitre_WhenEqual_ShouldReturnTrue() {
        QuantityMeasurement litre = new QuantityMeasurement(3.78, Unit.LITRE);
        QuantityMeasurement gallon = new QuantityMeasurement(1, Unit.GALLON);
        double result = gallon.additionOfTwoUnits(litre, gallon);
        Assert.assertEquals(7560, result, 0.0);
    }

    @Test
    public void givenAdditionOfGallonAndLitre_WhenEqual_ShouldReturnTrue() {
        QuantityMeasurement litre = new QuantityMeasurement(1, Unit.LITRE);
        QuantityMeasurement miliLitire = new QuantityMeasurement(100, Unit.ML);
        double result = miliLitire.additionOfTwoUnits(litre, miliLitire);
        Assert.assertEquals(1100, result, 0.0);
    }


    @Test
    public void givenKGAndGrams_WhenEqual_ShouldReturnTrue() {
        QuantityMeasurement kilogram = new QuantityMeasurement(1, Unit.KG);
        QuantityMeasurement grams = new QuantityMeasurement(1000, Unit.GRAMS);
        Assert.assertEquals(kilogram, grams);
    }

    @Test
    public void givenTonneAndKG_WhenEqual_ShouldReturnTrue() {
        QuantityMeasurement tonne = new QuantityMeasurement(1, Unit.TONNE);
        QuantityMeasurement kilogram = new QuantityMeasurement(1000, Unit.KG);
        Assert.assertEquals(kilogram, tonne);
    }

    @Test
    public void givenAdditionOfTonneAndGrams_WhenEqual_ShouldReturnTrue() {
        QuantityMeasurement tonne = new QuantityMeasurement(1, Unit.TONNE);
        QuantityMeasurement grams = new QuantityMeasurement(1000, Unit.GRAMS);
        double result = grams.additionOfTwoUnits(tonne, grams);
        Assert.assertEquals(1001000.0, result, 0.0);
    }

    @Test
    public void givenCelsiusAndFahrenheit_WhenEqual_ShouldReturnTrue() {
        QuantityMeasurement fahrenheit = new QuantityMeasurement(212, Unit.FAHRENHEIT);
        QuantityMeasurement celsius = new QuantityMeasurement(100, Unit.CELSIUS);
        Assert.assertEquals(fahrenheit, celsius);
    }
}