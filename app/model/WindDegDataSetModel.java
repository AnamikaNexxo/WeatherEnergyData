package model;

import io.ebean.Finder;
import play.data.format.Formats;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "weather_features")
public class WindDegDataSetModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @Column(name = "city_name")
    private String cityName;

    @Column(name = "wind_deg")
    private Integer windDeg;

//    @Column(name = "dt_cl",columnDefinition="DATETIME")
//    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @Column(name = "dt_cl")
    @Formats.DateTime(pattern = "dd/MM/YYYY hh:mm:ss a")
    private Date dtCl;

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

    public Integer getWindDeg() {
        return this.windDeg;
    }

    public void setWindDeg(Integer windDeg) {
        this.windDeg = windDeg;
    }

    public Date getDtCl() {
        return this.dtCl;
    }

    public void setDtCl(Date dtCl) {
        this.dtCl = dtCl;
    }

    public static final Finder<Integer, WindDegDataSetModel> find = new Finder<>(WindDegDataSetModel.class);

}
