package service;

import dao.DataFetchingDao;
import dto.CityHumidityDto;
import dto.CityPressureDto;
import dto.CityWindDegDto;
import play.Logger;

public class WeatherDataService {


    public static CityHumidityDto chartHumidityService() {
        CityHumidityDto cityHumidityDto = DataFetchingDao.getHumidityData();
        return (cityHumidityDto);
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
