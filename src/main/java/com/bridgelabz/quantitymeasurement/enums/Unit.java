package com.bridgelabz.quantitymeasurement.enums;

import com.bridgelabz.quantitymeasurement.service.QuantityType;

public enum Unit {
    FEET(12), INCH(1);

    private double value;

    Unit(double value) {
        this.value = value;
    }

    public static double getValue(QuantityType quantityObj) {
        return quantityObj.unit.value * quantityObj.value;
    }
}
