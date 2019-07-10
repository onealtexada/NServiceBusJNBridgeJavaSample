package com.nservicebus;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import Publish.PublishOrder;
import System.Guid;

@RestController
public class HomeController {
    private Guid orderId;
    
    @Autowired
    PublishOrder publishOrder;
    
    @GetMapping("/placeorder")
    public PlaceOrderInformation PlaceOrder() {
        orderId = (Guid) publishOrder.PublishingOrder().Get_Result();

        return new PlaceOrderInformation(orderId.ToString(), "Order has been placed.");
    }    
}
