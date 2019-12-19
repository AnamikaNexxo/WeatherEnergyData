package service;

import com.fasterxml.jackson.databind.JsonNode;
import dao.DataFetchingDao;
import dto.CityHumidityDto;
import play.libs.Json;

public class WeatherDataService {
//TODO: below

    public static JsonNode chartService() {
        CityHumidityDto cityHumidityDto = DataFetchingDao.getHumidityData();
        return Json.toJson(cityHumidityDto);


//     JsonNode json = Json.toJson(cityHumidityDto);
//     return json;

    }

}
