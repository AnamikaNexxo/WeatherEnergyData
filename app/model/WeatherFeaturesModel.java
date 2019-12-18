package model;

import io.ebean.Finder;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "weather_features")
public class WeatherFeaturesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @Column(name = "city_name")
    private String cityName;

    @Column(name = "temp")
    private float temp;

    @Column(name = "temp_min")
    private float tempMin;

    @Column(name = "temp_max")
    private float tempMax;

    @Column(name = "pressure")
    private Integer pressure;

    @Column(name = "humidity")
    private Integer humidity;

    @Column(name = "wind_speed")
    private Integer windSpeed;

    @Column(name = "wind_deg")
    private Integer windDeg;

    @Column(name = "rain_1h")
    private Integer rainOneh;

    @Column(name = "rain_3h")
    private Integer rainThreeh;

    @Column(name = "snow_3h")
    private Integer snowThreeh;

    @Column(name = "clouds_all")
    private Integer cloudsAll;

    @Column(name = "weather_id")
    private Integer weatherId;

    @Column(name = "weather_main")
    private String weatherMain;

    @Column(name = "weather_description")
    private String weatherDescription;

    @Column(name = "weather_icon")
    private String weatherIcon;

    @Column(name = "weather_featurescol")
    private String weatherFeaturescol;

//    @Column(name = "dt_cl")
//    private String dtCl;

    @Column(name = "dt_cl")
//    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date dtCl;

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

    public float getTemp() {
        return temp;
    }

    public void setTemp(float temp) {
        this.temp = temp;
    }

    public float getTempMin() {
        return tempMin;
    }

    public void setTempMin(float tempMin) {
        this.tempMin = tempMin;
    }

    public float getTempMax() {
        return tempMax;
    }

    public void setTempMax(float tempMax) {
        this.tempMax = tempMax;
    }

    public Integer getPressure() {
        return pressure;
    }

    public void setPressure(Integer pressure) {
        this.pressure = pressure;
    }

    public Integer getHumidity() {
        return humidity;
    }

    public void setHumidity(Integer humidity) {
        this.humidity = humidity;
    }

    public Integer getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(Integer windSpeed) {
        this.windSpeed = windSpeed;
    }

    public Integer getWindDeg() {
        return windDeg;
    }

    public void setWindDeg(Integer windDeg) {
        this.windDeg = windDeg;
    }

    public Integer getRainOneh() {
        return rainOneh;
    }

    public void setRainOneh(Integer rainOneh) {
        this.rainOneh = rainOneh;
    }

    public Integer getRainThreeh() {
        return rainThreeh;
    }

    public void setRainThreeh(Integer rainThreeh) {
        this.rainThreeh = rainThreeh;
    }

    public Integer getSnowThreeh() {
        return snowThreeh;
    }

    public void setSnowThreeh(Integer snowThreeh) {
        this.snowThreeh = snowThreeh;
    }

    public Integer getCloudsAll() {
        return cloudsAll;
    }

    public void setCloudsAll(Integer cloudsAll) {
        this.cloudsAll = cloudsAll;
    }

    public Integer getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(Integer weatherId) {
        this.weatherId = weatherId;
    }

    public String getWeatherMain() {
        return weatherMain;
    }

    public void setWeatherMain(String weatherMain) {
        this.weatherMain = weatherMain;
    }

    public String getWeatherDescription() {
        return weatherDescription;
    }

    public void setWeatherDescription(String weatherDescription) {
        this.weatherDescription = weatherDescription;
    }

    public String getWeatherIcon() {
        return weatherIcon;
    }

    public void setWeatherIcon(String weatherIcon) {
        this.weatherIcon = weatherIcon;
    }

    public String getWeatherFeaturescol() {
        return weatherFeaturescol;
    }

    public void setWeatherFeaturescol(String weatherFeaturescol) {
        this.weatherFeaturescol = weatherFeaturescol;
    }

    public Date getDtCl() {
        return dtCl;
    }

    public void setDtCl(Date dtCl) {
        this.dtCl = dtCl;
    }

    public static final Finder<Integer, WeatherFeaturesModel> find = new Finder<>(WeatherFeaturesModel.class);
}
