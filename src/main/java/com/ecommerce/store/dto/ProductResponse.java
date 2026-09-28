package com.ecommerce.store.dto;

public class ProductResponse {

    private Long itemId;
    private String itemName;
    private Double unitPrice;
    private String imageUrl;

    public ProductResponse(Long itemId, String itemName, Double unitPrice, String imageUrl) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.unitPrice = unitPrice;
        this.imageUrl = imageUrl;
    }

    public Long getItemId() {
        return itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public String getImageUrl() {
        return imageUrl;
    }
}