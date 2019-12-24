package dto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CityWeatherDataSetDto {

    private List<Integer> id= new ArrayList<>();
    private List<String> cityName= new ArrayList<>();
    private List<BigDecimal> humidityValue=new ArrayList<>();;
    private List<Date> dateTime=new ArrayList<>();;

    public List<Integer> getId() {
        return id;
    }

    public void setId(List<Integer> id) {
        this.id = id;
    }

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

    public List<Date> getDateTime() {
        return dateTime;
    }

    public void setDateTime(List<Date> dateTime) {
        this.dateTime = dateTime;
    }

    @Override
    public String toString() {
        return "CityWeatherDataSetDto{" +
                "id=" + id +
                ",cityNames=" + cityName +
                ", humidityValues=" + humidityValue +
                ", humidityValues=" + humidityValue +
                ", dateTime=" + dateTime +
                '}';

    }

}
