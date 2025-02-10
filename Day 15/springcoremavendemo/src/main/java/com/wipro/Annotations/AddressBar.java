package com.wipro.Annotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component  // Marks this class as a Spring Bean
public class AddressBar {
    
    @Value("Hyderabad")
    private String cityName;
    
    @Value("Telangana")
    private String stateName;

    @Override
    public String toString() {
        return cityName + ", " + stateName;
    }
}
