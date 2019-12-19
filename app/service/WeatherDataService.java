package service;

import dao.DataFetchingDao;
import dto.CityHumidityDto;

public class WeatherDataService {
//TODO: below

    public static CityHumidityDto chartService() {

        CityHumidityDto cityHumidityDto = DataFetchingDao.getHumidityData();
        return (cityHumidityDto);

//        CityHumidityDto cityHumidityDto = DataFetchingDao.getHumidityData();
//        return Json.toJson(cityHumidityDto);

//     JsonNode json = Json.toJson(cityHumidityDto);
//     return json;

    }

}
