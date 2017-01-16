package com.dmzhg.xmlparser;

import java.math.BigDecimal;

/**
 * Represents object of ORDDTL table
 *
 * @author dmzhg
 */
public class OrderDetail {

    private String code;
    private int quantity;
    private BigDecimal price;
    private BigDecimal positionSum;
    private char morePrices;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getPositionSum() {
        return positionSum;
    }

    public void setPositionSum(BigDecimal positionSum) {
        this.positionSum = positionSum;
    }

    public char getMorePrices() {
        return morePrices;
    }

    public void setMorePrices(char morePrices) {
        this.morePrices = morePrices;
    }
}
