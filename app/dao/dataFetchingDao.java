
package dao;

import io.ebean.SqlRow;


import java.util.List;

    public class DataFetchingDao {
        public static List<SqlRow> getHumidityData()
        {
            return DbConnector.createSqlQuery("SELECT HUMIDITY,city_name FROM weather_features WHERE DATE(DT_CL)='2015-01-01'").findList();
        }

        public static List<SqlRow> getHumidityData()
        {
            return DbConnector.createSqlQuery("SELECT pressure,city_name FROM weather_features WHERE DATE(DT_CL)='2015-01-01'").findList();
        }

        public static List<SqlRow> getHumidityData()
        {
            return DbConnector.createSqlQuery("SELECT wind_deg,city_name FROM weather_features WHERE DATE(DT_CL)='2015-01-01'").findList();
        }

    }




}
