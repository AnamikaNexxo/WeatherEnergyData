package service;

import dao.WindDegreeDataDao;
import dto.CityWindDegDto;

import java.util.List;

public class WindDegDataService {


    public static List<CityWindDegDto> WindDegData() {
        List<CityWindDegDto> cityWindDegDto = WindDegreeDataDao.getCityWindDegreeData();
        return (cityWindDegDto);

    }

}
