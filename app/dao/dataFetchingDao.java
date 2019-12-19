
package dao;

import dto.CityHumidityDto;
import io.ebean.SqlRow;

import java.util.List;

public class DataFetchingDao {
//    public static List<SqlRow> getHumidityData() {
//        return DbConnector.createSqlQuery("SELECT HUMIDITY,city_name FROM weather_features WHERE DATE(DT_CL)='2015-01-01'").findList();
//    }

    public static CityHumidityDto getHumidityData() {
//        List<SqlRow> rows= DataFetchingDao.getHumidityData();
        List<SqlRow> rows = DbConnector.createSqlQuery("SELECT HUMIDITY,city_name FROM weather_features WHERE DATE(DT_CL)='2015-01-01'").findList();
        CityHumidityDto cityHumidityDto = new CityHumidityDto();
        for (SqlRow row : rows) {
            cityHumidityDto.setHumidityValue(row.getBigDecimal("HUMIDITY"));
            cityHumidityDto.setCityName(row.getString("city_name"));
        }
        return cityHumidityDto;

    }

    public static List<SqlRow> getPressureData() {
        return DbConnector.createSqlQuery("SELECT pressure,city_name FROM weather_features WHERE DATE(DT_CL)='2015-01-01'").findList();
    }

    public static List<SqlRow> getWindDegData() {
        return DbConnector.createSqlQuery("SELECT wind_deg,city_name FROM weather_features WHERE DATE(DT_CL)='2015-01-01'").findList();
    }

}





