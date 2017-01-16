package com.dmzhg.xmlparser;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * Represents object of ORDHDR table
 *
 * @author dmzhg
 */
public class OrderHeader {

    private String id;
    private String number;
    private String recipientCode;
    private LocalDateTime creationDate;
    private LocalDateTime deliveryDate;
    private int supplierNumber;
    private String recipientStoreCode;
    private char goodsType;
    private String documentType;
    private String webOrderNumber;
    private List<OrderDetail> orderDetails;

    public OrderHeader() {
        orderDetails = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getRecipientCode() {
        return recipientCode;
    }

    public void setRecipientCode(String recipientCode) {
        this.recipientCode = recipientCode;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }

    public LocalDateTime getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(LocalDateTime deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public int getSupplierNumber() {
        return supplierNumber;
    }

    public void setSupplierNumber(int supplierNumber) {
        this.supplierNumber = supplierNumber;
    }

    public String getRecipientStoreCode() {
        return recipientStoreCode;
    }

    public void setRecipientStoreCode(String recipientStoreCode) {
        this.recipientStoreCode = recipientStoreCode;
    }

    public char getGoodsType() {
        return goodsType;
    }

    public void setGoodsType(char goodsType) {
        this.goodsType = goodsType;
    }

    public String getDocumentType() {
        return documentType;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    public String getWebOrderNumber() {
        return webOrderNumber;
    }

    public void setWebOrderNumber(String webOrderNumber) {
        this.webOrderNumber = webOrderNumber;
    }

    public List<OrderDetail> getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(List<OrderDetail> orderDetails) {
        this.orderDetails = orderDetails;
    }

    @Override
    public String toString() {
        return "Order id = " + this.id;
    }
}
