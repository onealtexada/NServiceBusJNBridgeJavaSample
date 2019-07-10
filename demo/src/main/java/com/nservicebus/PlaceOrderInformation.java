package com.nservicebus;

public class PlaceOrderInformation {
    private final String orderId;
    private final String message;
    
    public PlaceOrderInformation(String orderId, String message) {
        this.orderId = orderId;
        this.message = message;
    }

    public String getOrderId() {
        return orderId;
    }

    public String getMessage() {
        return message;
    }
}
