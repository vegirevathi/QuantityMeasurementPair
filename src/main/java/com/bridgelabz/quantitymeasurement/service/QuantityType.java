package com.bridgelabz.quantitymeasurement.service;

import com.bridgelabz.quantitymeasurement.enums.Unit;

public class QuantityType {

    private final Unit unit;
    private final double value;


    public QuantityType(Unit unit, double value) {
        this.unit = unit;
        this.value = value;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) return true;
        if (that == null || getClass() != that.getClass()) return false;
        QuantityType quantityType = (QuantityType) that;
        return Double.compare(quantityType.value, value) == 0 &&
                unit == quantityType.unit;
    }

    public boolean compare(QuantityType inch) {
    }
}
