package com.wipro;

public class AddressByType {
    private String cityName;
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
