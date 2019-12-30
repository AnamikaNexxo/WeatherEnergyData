package service;

import dao.DataFetchingDao;
import dto.CityHumidityDto;
import dto.CityPressureDto;
import play.Logger;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

public class WeatherDataService {


    public static Map<String, List<BigDecimal>> chartHumidityService() {
        CityHumidityDto cityHumidityDto = DataFetchingDao.getCityHumidityData();
        List<String> cityNames = DataFetchingDao.getCityNames();
        Logger.info("cityNames::{}", cityNames);
        Map<String, List<BigDecimal>> cityMap =
                DataFetchingDao.getCityHumidityScores(cityNames);

        return (cityMap);
    }

    public static CityPressureDto chartPressureService() {
        CityPressureDto cityPressureDto = DataFetchingDao.getCityPressureData();
        Logger.info("cityPressureDto::{}", cityPressureDto);
        return (cityPressureDto);
    }

}

