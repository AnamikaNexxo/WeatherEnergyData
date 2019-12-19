package service;

import dao.DataFetchingDao;
import dto.CityHumidityDto;
import dto.CityPressureDto;
import dto.CityWindDegDto;

public class WeatherDataService {
//TODO: below

    public static CityHumidityDto chartHumidityService() {

        CityHumidityDto cityHumidityDto = DataFetchingDao.getHumidityData();
        return (cityHumidityDto);


    }

    public static CityPressureDto chartPressureService() {

        CityPressureDto cityPressureDto = DataFetchingDao.getPressureData();
        return (cityPressureDto);
    }


    public static CityWindDegDto dataSetTable() {

        CityHumidityDto cityHumidityDto = DataFetchingDao.getWindDegData();
        return (cityHumidityDto);


    }

}
