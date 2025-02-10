package com.wipro.Annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("student")  // Marks this class as a Spring Bean
public class StudentData {
    
    @Value("200")
    private Integer stid;
    
    @Value("Pavan Kalyan")
    private String stname;
    
    @Autowired  // Automatically injects Address bean
    private AddressBar address;

    // Getters and setters

    @Override
    public String toString() {
        return stid + " " + stname + " " + address;
    }
}
