package dto;

import java.util.Date;

public class CityWindDegDto {

    private Integer id;
    private String cityName;
    private Integer windDegValue;
    private Date date;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public Integer getWindDegValue() {
        return windDegValue;
    }

    public void setWindDegValue(Integer windDegValue) {
        this.windDegValue = windDegValue;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
