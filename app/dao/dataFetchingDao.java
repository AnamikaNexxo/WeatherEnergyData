
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


    public static CityHumidityDto getCityHumidityData() {
        List<SqlRow> dbDataList = DbConnector.createSqlQuery(
                "SELECT HUMIDITY, city_name " +
                        "FROM weather_features " +
                        "WHERE DATE(DT_CL)='2015-01-01'")// initial corrrect

                .findList();

        List<BigDecimal> humidityList = new ArrayList<>();
        List<String> cityList = new ArrayList<>();
        CityHumidityDto cityHumidityDto = new CityHumidityDto();
        for (SqlRow row : dbDataList) {
            humidityList.add(row.getBigDecimal("HUMIDITY"));
            cityList.add(row.getString("city_name"));
        }
        cityHumidityDto.setHumidityValue(humidityList);
        cityHumidityDto.setCityName(cityList);
        return cityHumidityDto;
    }



    public static Map<String, List<BigDecimal>> getCityHumidityScores(List<String> cityNames) {
        Map<String, List<BigDecimal>> cityMap = new HashMap<>();
//        List<Map<String, List<BigDecimal>>> cityHumidity = new ArrayList<>();
        for (String name : cityNames) {
            String query = "Select HUMIDITY from weather_features where " +
                    "city_name= '" + name + "' and DATE(dt_cl)" +
                    "='2015-01-01'";
            List<SqlRow> humidityValueList =
                    DbConnector.createSqlQuery(query).findList();
            List<BigDecimal> humidity = new ArrayList<>();
            for (SqlRow row : humidityValueList) {
                humidity.add(row.getBigDecimal("HUMIDITY"));
            }
            cityMap.put(name, humidity);
            Logger.info("cityMap::{}", cityMap);
//            cityHumidity.add(cityMap);
        }
        return cityMap;
    }

    public static List<String> getCityNames() {
        List<SqlRow> cityNameList = DbConnector.createSqlQuery(
                "SELECT distinct city_name " +
                        "FROM weather_features ")
                .findList();
        List<String> cityList = new ArrayList<>();
        for (SqlRow row : cityNameList) {
            cityList.add(row.getString("city_name"));
        }
        return cityList;

    }

    public static CityPressureDto getCityPressureData() {
        //pressure Data for a particular Time instant
        List<SqlRow> cityAndPressure = DbConnector.createSqlQuery(
                "SELECT pressure,city_name " +
                        "FROM weather_features " +
                        "WHERE DT_CL='2015-01-01 02:00:00'")
                .findList();

        List<BigDecimal> pressureList = new ArrayList<>();
        List<String> cityList = new ArrayList<>();
        CityPressureDto cityPressureDto = new CityPressureDto();
        for (SqlRow row : cityAndPressure) {
            pressureList.add(row.getBigDecimal("pressure"));
            cityList.add(row.getString("city_name"));
        }
        cityPressureDto.setPressureValues(pressureList);
        cityPressureDto.setCityNames(cityList);
        return cityPressureDto;
    }

}

//
//    public static CityHumidityDto getHumidityData() {
//        List<SqlRow> rows = DbConnector.createSqlQuery(
//                "SELECT HUMIDITY, city_name " +
//                        "FROM weather_features " +
//                        "WHERE DATE(DT_CL)='2015-01-01'")// initial corrrect
//                // query
////        List<SqlRow> rows = DbConnector.createSqlQuery(
////                "SELECT HUMIDITY, city_name " +
////                        "FROM weather_features " +
////                        "WHERE DT_CL='2015-01-01 02:00:00'")
//                .findList();
//
//        List<BigDecimal> humidityList = new ArrayList<>();
//        List<String> cityList = new ArrayList<>();
//        CityHumidityDto cityHumidityDto = new CityHumidityDto();
//        for (SqlRow row : rows) {
//            humidityList.add(row.getBigDecimal("HUMIDITY"));
//            cityList.add(row.getString("city_name"));
//        }
//        cityHumidityDto.setHumidityValue(humidityList);
//        cityHumidityDto.setCityName(cityList);
//        return cityHumidityDto;
//    }
