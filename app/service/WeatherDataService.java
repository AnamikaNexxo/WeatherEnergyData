package service;

import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import dao.DataFetchingDao;
import io.ebean.SqlRow;
import play.libs.Json;

import java.util.List;

public class WeatherDataService {
//TODO: below

 public static ObjectNode chartService()
 {
         ObjectNode result = Json.newObject();
         ArrayNode an = result.putArray("aaData");
         List<SqlRow> rows= DataFetchingDao.getHumidityData();

         for(SqlRow rowData:rows)
         {
             ObjectNode rowObject= Json.newObject();
//             rowObject.put("0",rowData.getString("DataField1"));
//             rowObject.put("1",rowData.getString("DataField1")+ " "+rowData.getString("DataField1"));
//             rowObject.put("2",rowData.getString("DataField1"));
//             rowObject.put("3",rowData.getString("DataField1"));
//             an.add(rowObject);
         }
         return result;
     }

}
