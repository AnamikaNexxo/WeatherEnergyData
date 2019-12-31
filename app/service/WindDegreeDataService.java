package service;

import dao.WindDegreeDataDao;
import dto.CityWindDegreeDto;

import java.util.List;

public class WindDegreeDataService {


    public static List<CityWindDegreeDto> windDegreeData(String selectedDate) {
        List<CityWindDegreeDto> cityWindDegreeDto =
                WindDegreeDataDao.getCityWindDegreeData(selectedDate);
        return (cityWindDegreeDto);

    }

}
