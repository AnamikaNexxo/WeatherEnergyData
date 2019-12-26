
package dao;

import dto.CityHumidityDto;
import dto.CityPressureDto;
import io.ebean.SqlRow;
import play.Logger;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataFetchingDao {


    public static CityHumidityDto getHumidityData() {
        List<SqlRow> rows = DbConnector.createSqlQuery(
                "SELECT HUMIDITY, city_name " +
                        "FROM weather_features " +
                        "WHERE DATE(DT_CL)='2015-01-01'")// initial corrrect
                // query
//        List<SqlRow> rows = DbConnector.createSqlQuery(
//                "SELECT HUMIDITY, city_name " +
//                        "FROM weather_features " +
//                        "WHERE DT_CL='2015-01-01 02:00:00'")
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



    public static Map<String, List<BigDecimal>> getCityHumidityScores(List<String> cityNames) {
        Map<String, List<BigDecimal>> cityMap = new HashMap<>();
//        List<Map<String, List<BigDecimal>>> cityHumidity = new ArrayList<>();
        for (String name : cityNames) {
            String query = "Select HUMIDITY from weather_features where " +
                    "city_name= '" + name + "' and DATE(dt_cl)" +
                    "='2015-01-01'";
            List<SqlRow> rows =
                    DbConnector.createSqlQuery(query).findList();
            List<BigDecimal> humidity = new ArrayList<>();
            for (SqlRow row : rows) {
                humidity.add(row.getBigDecimal("HUMIDITY"));
            }
            cityMap.put(name, humidity);
            Logger.info("cityMap::{}", cityMap);
//            cityHumidity.add(cityMap);
        }
        return cityMap;
    }

    public static List<String> getCityNames() {
        List<SqlRow> rows = DbConnector.createSqlQuery(
                "SELECT distinct city_name " +
                        "FROM weather_features ")
                .findList();
        List<String> cityList = new ArrayList<>();
        for (SqlRow row : rows) {
            cityList.add(row.getString("city_name"));
        }
        return cityList;

    }




    public static CityPressureDto getPressureData() {
        //pressure Data for a particular Time instant
        List<SqlRow> rows = DbConnector.createSqlQuery(
                "SELECT pressure,city_name " +
                        "FROM weather_features " +
                        "WHERE DT_CL='2015-01-01 02:00:00'")
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
//
//
//    public static CityWindDegDto getWindDegData() {
//        List<SqlRow> rows = DbConnector.createSqlQuery(
//                "SELECT wind_deg,city_name " +
//                        "FROM weather_features " +
//                        "WHERE DATE(DT_CL)='2015-01-01'")
//                .findList();
//
//        CityWindDegDto cityWindDegDto = new CityWindDegDto();
//        for (SqlRow row : rows) {
//            cityWindDegDto.setWindDegValue(row.getInteger("wind_deg"));
//            cityWindDegDto.setCityName(row.getString("city_name"));
//        }
//        return cityWindDegDto;
//    }
//

//    public static List<WeatherDataSetModel> getWindDegData2() {
//
//        List<WeatherDataSetModel> rows = WeatherDataSetModel.find.query().where() .select("id," +
//                        "city_name,humidity," +
//                        "dt_cl").findList();
//
//        return
//
//    }

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