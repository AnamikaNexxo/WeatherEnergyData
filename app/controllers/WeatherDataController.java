package controllers;

import com.google.inject.Inject;
import dto.CityHumidityDto;
import play.data.FormFactory;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;

import java.util.ArrayList;
import java.util.List;

public class WeatherDataController extends Controller {
    private FormFactory formFactory;

    @Inject
    public WeatherDataController(FormFactory formFactory) {
        this.formFactory = formFactory;
    }

//  method 1  chart
//  to get data from the list and return in json format for chart1
public Result chart(Http.Request request){

        //TODO: call service to get city pressure DTO
    List<CityHumidityDto> cityHumidityDtos = new ArrayList<>();
/*

//TODO: BREAK THE FOLLOWIN CODE TO dao AND SERVICES
List<SqlRow> datalist = DbConnector.createSqlQuery("\n" + "SELECT HUMIDITY,city_name FROM weather_features WHERE DT_CL='2015-01-01 00:00:00'").findList();
    List<CityHumidityDto> cityHumidityDtos = new ArrayList<>();

    for(SqlRow row : datalist){
        CityHumidityDto playstore = new CityHumidityDto();
        playstore.setCityName(row.getString("Humidity"));
        playstore.setHumidityValue(row.getBigDecimal("city_name"));
        cityHumidityDtos.add(playstore);
    }

    CityPressureDto cityPressureDto = new CityPressureDto();

    for(CityHumidityDto store : cityHumidityDtos){
        cityPressureDto.getCityNames().add(store.getCityName());
        cityPressureDto.getPressureValues().add(store.getHumidityValue());
    }

    Logger.info(Json.toJson(cityPressureDto).toString());*/
    return ok(Json.toJson(cityHumidityDtos));
}


}
