package com.nservicebus;

import com.jnbridge.jnbcore.DotNetSide;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import Publish.PublishOrder;

@Configuration
public class AppConfig {
    @Bean
    public static PublishOrder publishOrderConfigurer() {
        DotNetSide.init("./target/classes/application.properties");
        
        PublishOrder publishOrder = new PublishOrder();
        publishOrder.StartEndpoint();
        
        return publishOrder;
    }
}
