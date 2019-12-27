package service;

import dao.WindDegDataDao;
import dto.CityWindDegDto;

import java.util.List;

public class WindDegDataService {


    public static List<CityWindDegDto> WindDegData() {
        List<CityWindDegDto> cityWindDegDto = WindDegDataDao.getWindDegData();
        return (cityWindDegDto);

    }

}
