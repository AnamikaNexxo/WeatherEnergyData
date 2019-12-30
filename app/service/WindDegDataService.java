package service;

import dao.WindDegreeDataDao;
import dto.CityWindDegreeDto;

import java.util.List;

public class WindDegDataService {


    public static List<CityWindDegreeDto> WindDegData() {
        List<CityWindDegreeDto> cityWindDegreeDto = WindDegreeDataDao.getCityWindDegreeData();
        return (cityWindDegreeDto);

    }

}
