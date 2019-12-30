package service;

import dao.WindDegreeDataDao;
import dto.CityWindDegreeDto;

import java.util.List;

public class WindDegreeDataService {


    public static List<CityWindDegreeDto> windDegreeData() {
        List<CityWindDegreeDto> cityWindDegreeDto = WindDegreeDataDao.getCityWindDegreeData();
        return (cityWindDegreeDto);

    }

}
