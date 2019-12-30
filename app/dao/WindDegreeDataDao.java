package dao;

import dto.CityWindDegDto;
import io.ebean.SqlRow;

import java.util.ArrayList;
import java.util.List;

public class WindDegreeDataDao {

     public static List<CityWindDegDto> getCityWindDegreeData() {

// Query 1 - large amount of Data is being fetched and takes time
//        List<SqlRow> data = DbConnector.createSqlQuery(
//                "Select id, city_name, wind_deg, dt_cl " +
//                        "from weather_features ;").
//                findList();

// Query 2 -  large amount of Data is being fetched and takes time
//         List<SqlRow> data = DbConnector.createSqlQuery(
//                 "Select id, city_name, wind_deg,dt_cl " +
//                         "from weather_features " +
//                         "where  DATE(DT_CL)='2015-01-01' ;").
//                 findList();

 // Query 2 -  large amount of Data is being fetched and takes time
         List<SqlRow> data = DbConnector.createSqlQuery(
                 "Select id, city_name, wind_deg, dt_cl " +
                         "from weather_features " +
                         "where DT_CL " +
                         "between '2015-01-01 00:00:00' and '2015-01-01 03:00:00' ;").
                 findList();

         List<CityWindDegDto> dataList = new ArrayList<>();
        for (SqlRow row : data) {
            CityWindDegDto cityWindDegDto = new CityWindDegDto();
            cityWindDegDto.setId(row.getInteger("id"));
            cityWindDegDto.setCityName(row.getString("city_name"));
            cityWindDegDto.setWindDegValue(row.getInteger("wind_deg"));
            cityWindDegDto.setDate(row.getDate("dt_cl"));

            dataList.add(cityWindDegDto);
       }
         return dataList;
      }

}


