package org.egecoskun121;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product {

    private double unitPrice;
    private int discountRate;
    private int stockUnit;
    private String productName;
    private Brand brand;
    private int RAM;
    private double screenSize;
    private int storage;

    public Product(double unitPrice, int discountRate, int stockUnit, String productName, Brand brand, int RAM, double screenSize, int storage) {
        this.unitPrice = unitPrice;
        this.discountRate = discountRate;
        this.stockUnit = stockUnit;
        this.productName = productName;
        this.brand = brand;
        this.RAM = RAM;
        this.screenSize = screenSize;
        this.storage = storage;
    }
}
