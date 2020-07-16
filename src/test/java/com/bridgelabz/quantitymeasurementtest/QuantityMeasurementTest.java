package com.bridgelabz.quantitymeasurementtest;

import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {

    @Test
    public void given0FeetAnd0Feet_ShouldReturnEqual() {
        QuantityType feet1 = new QuantityType(QuantityType.Unit.FEET, 0.0);
        QuantityType feet2 = new QuantityType(QuantityType.Unit.FEET, 0.0);
        Assert.assertEquals(feet1, feet2);
    }
}