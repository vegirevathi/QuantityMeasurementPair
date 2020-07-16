package com.bridgelabz.quantitymeasurement.service;

import com.bridgelabz.quantitymeasurement.enums.Unit;

import java.util.Objects;

public class QuantityType {

    public final Unit unit;
    public final double value;


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

    public boolean compare(QuantityType that) {
        double value1 = Unit.getValue(this);
        double value2 = Unit.getValue(that);
        return Objects.equals(value1, value2);
    }
}

