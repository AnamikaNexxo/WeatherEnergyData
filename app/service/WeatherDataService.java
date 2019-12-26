package service;

import dao.DataFetchingDao;
import dto.CityHumidityDto;
import dto.CityPressureDto;
import dto.CityWindDegDto;
import play.Logger;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

public class WeatherDataService {


    public static List<Map<String, List<BigDecimal>>> chartHumidityService() {
        CityHumidityDto cityHumidityDto = DataFetchingDao.getHumidityData();
        List<String> cityNames = DataFetchingDao.getCityNames();
        Logger.info("cityNames::{}", cityNames);
        List<Map<String, List<BigDecimal>>> cityMap =
                DataFetchingDao.getCityHumidityScores(cityNames);

        return (cityMap);
    }

    public static CityPressureDto chartPressureService() {
        CityPressureDto cityPressureDto = DataFetchingDao.getPressureData();
        Logger.info("cityPressureDto::{}", cityPressureDto);
        return (cityPressureDto);
    }


    public static CityWindDegDto dataWindDegService() {
        CityWindDegDto citywindDegDto = DataFetchingDao.getWindDegData();
        return (citywindDegDto);
    }

}
