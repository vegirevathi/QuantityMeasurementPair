package com.bridgelabz.quantitymeasurementtest;

import com.bridgelabz.quantitymeasurement.enums.Unit;
import com.bridgelabz.quantitymeasurement.service.QuantityType;
import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {

    @Test
    public void given0FeetAnd0Feet_ShouldReturnEqual() {
        QuantityType feet1 = new QuantityType(Unit.FEET, 0.0);
        QuantityType feet2 = new QuantityType(Unit.FEET, 0.0);
        Assert.assertEquals(feet1, feet2);
    }

    @Test
    public void givenSameInchValue_ShouldReturnEqual() {
        QuantityType inch1 = new QuantityType(Unit.INCH, 0.0);
        QuantityType inch2 = new QuantityType(Unit.INCH, 0.0);
        Assert.assertEquals(inch1, inch2);
    }

    @Test
    public void givenFeetAndInches_WhenLengthsAreEqual_ShouldReturnTrue() {
        QuantityType feet = new QuantityType(Unit.FEET, 1.0);
        QuantityType inch = new QuantityType(Unit.INCH, 12.0);
        boolean compareCheck = feet.compare(inch);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void givenThreeFeetAndOneYard_WhenCompare_ShouldReturnTrue() {
        QuantityType feet = new QuantityType(Unit.FEET, 3.0);
        QuantityType yard = new QuantityType(Unit.YARD, 1.0);
        boolean compareCheck = feet.compare(yard);
        Assert.assertTrue(compareCheck);
    }
}
