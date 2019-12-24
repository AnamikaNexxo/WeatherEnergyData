
package dao;

import dto.CityHumidityDto;
import dto.CityPressureDto;
import dto.CityWindDegDto;
import io.ebean.SqlRow;
import model.WeatherDataSetModel;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class DataFetchingDao {


    public static CityHumidityDto getHumidityData() {
//        List<SqlRow> rows = DbConnector.createSqlQuery(
//                "SELECT HUMIDITY, city_name " +
//                        "FROM weather_features " +
//                        "WHERE DATE(DT_CL)='2015-01-01'")// initial corrrect query
        List<SqlRow> rows = DbConnector.createSqlQuery(
                "SELECT HUMIDITY, city_name " +
                        "FROM weather_features " +
                        "WHERE DT_CL='2015-01-01 02:00:00'")
                .findList();

        List<BigDecimal> humidityList = new ArrayList<>();
        List<String> cityList = new ArrayList<>();
        CityHumidityDto cityHumidityDto = new CityHumidityDto();
        for (SqlRow row : rows) {
            humidityList.add(row.getBigDecimal("HUMIDITY"));
            cityList.add(row.getString("city_name"));
        }
        cityHumidityDto.setHumidityValue(humidityList);
        cityHumidityDto.setCityName(cityList);
        return cityHumidityDto;
    }

//        CityHumidityDto cityHumidityDto = new CityHumidityDto();
//        for (SqlRow row : rows) {
//            cityHumidityDto.setHumidityValue(row.getBigDecimal("HUMIDITY"));
//            cityHumidityDto.setCityName(row.getString("city_name"));
//        }
//        return cityHumidityDto;
//    }


    public static CityPressureDto getPressureData() {
        List<SqlRow> rows = DbConnector.createSqlQuery(
                "SELECT pressure,city_name " +
                        "FROM weather_features " +
                        "WHERE DATE(DT_CL)='2015-01-01'")
                .findList();

        List<BigDecimal> pressureList = new ArrayList<>();
        List<String> cityList = new ArrayList<>();
        CityPressureDto cityPressureDto = new CityPressureDto();
        for (SqlRow row : rows) {
            pressureList.add(row.getBigDecimal("pressure"));
            cityList.add(row.getString("city_name"));
        }
        cityPressureDto.setPressureValues(pressureList);
        cityPressureDto.setCityNames(cityList);
        return cityPressureDto;
    }


    public static CityWindDegDto getWindDegData() {
        List<SqlRow> rows = DbConnector.createSqlQuery(
                "SELECT wind_deg,city_name " +
                        "FROM weather_features " +
                        "WHERE DATE(DT_CL)='2015-01-01'")
                .findList();

        CityWindDegDto cityWindDegDto = new CityWindDegDto();
        for (SqlRow row : rows) {
            cityWindDegDto.setWindDegValue(row.getInteger("wind_deg"));
            cityWindDegDto.setCityName(row.getString("city_name"));
        }
        return cityWindDegDto;
    }


    public static List<WeatherDataSetModel> getWindDegData2() {

        List<WeatherDataSetModel> rows = WeatherDataSetModel.find.query().where() .select("id," +
                        "city_name,humidity," +
                        "dt_cl").findList();

        return  

    }

//        List<CityWeatherDataSetDto> dataList = new ArrayList<>();
//
//        for (WeatherFeaturesModel row : rows) {
//            CityWeatherDataSetDto cityWeatherDataSetDto = new CityWeatherDataSetDto();
//            cityWeatherDataSetDto.setId(row.getId(id));
//            cityWeatherDataSetDto.setCityName(row.getCityName(cityName));
//            cityWeatherDataSetDto.setHumidityValue(row.getHumidity(humidityValue));
//            cityWeatherDataSetDto.setDateTime(row.getDtCl(dateTime));
//            dataList.add(cityWeatherDataSetDto);
//        }




}