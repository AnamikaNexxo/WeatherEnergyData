package dto;

import java.math.BigDecimal;

public class CityHumidityDto {

    private String cityName;
    private BigDecimal humidityValue;

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public BigDecimal getHumidityValue() {
        return humidityValue;
    }

    public void setHumidityValue(BigDecimal humidityValue) {
        this.humidityValue = humidityValue;
    }
}
