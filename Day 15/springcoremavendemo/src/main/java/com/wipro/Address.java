package com.wipro;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address
{
	@Value("kadiri")
    private String cityName;
	@Value("ap")
    private String stateName;

    public String getCityName() {   
        return cityName;
    }

    public void setCityName(String cityName) {  
        this.cityName = cityName;
    }

    public String getStateName() {  
        return stateName;
    }

    public void setStateName(String stateName) {  
        this.stateName = stateName;
    }

    @Override
    public String toString() {
        return cityName + ", " + stateName;
    }
}
