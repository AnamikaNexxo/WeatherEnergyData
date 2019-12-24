package dto;


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CityHumidityDto {

    private List<String> cityName= new ArrayList<>();
    private List<BigDecimal> humidityValue=new ArrayList<>();;

    public List<String> getCityName() {
        return cityName;
    }

    public void setCityName(List<String> cityName) {
        this.cityName = cityName;
    }

    public List<BigDecimal> getHumidityValue() {
        return humidityValue;
    }

    public void setHumidityValue(List<BigDecimal> humidityValue) {
        this.humidityValue = humidityValue;
    }
}
