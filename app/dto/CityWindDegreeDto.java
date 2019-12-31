package dto;

public class CityWindDegreeDto {

    private Integer id;
    private String cityName;
    private Integer windDegValue;
    private String date;// change to data time to -date

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCityName() {
        return this.cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public Integer getWindDegValue() {
        return this.windDegValue;
    }

    public void setWindDegValue(Integer windDegValue) {
        this.windDegValue = windDegValue;
    }

    public String getDate() {
        return this.date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
