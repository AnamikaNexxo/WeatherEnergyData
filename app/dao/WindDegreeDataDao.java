package dao;

import dto.CityWindDegreeDto;
import io.ebean.SqlRow;

import java.util.ArrayList;
import java.util.List;

public class WindDegreeDataDao {

     public static List<CityWindDegreeDto> getCityWindDegreeData() {

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
         List<SqlRow> windTableData = DbConnector.createSqlQuery(
                 "Select id, city_name, wind_deg, dt_cl " +
                         "from weather_features " +
                         "where DT_CL " +
                         "between '2015-01-01 00:00:00' and '2015-01-01 03:00:00' ;").
                 findList();

         List<CityWindDegreeDto> cityWindDegreeDtoList = new ArrayList<>();
        for (SqlRow row : windTableData) {
            CityWindDegreeDto cityWindDegreeDto = new CityWindDegreeDto();
            cityWindDegreeDto.setId(row.getInteger("id"));
            cityWindDegreeDto.setCityName(row.getString("city_name"));
            cityWindDegreeDto.setWindDegValue(row.getInteger("wind_deg"));
            cityWindDegreeDto.setDate(row.getDate("dt_cl"));

            cityWindDegreeDtoList.add(cityWindDegreeDto);
       }
         return cityWindDegreeDtoList;
      }

}


