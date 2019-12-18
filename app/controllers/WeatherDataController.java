package controllers;

import com.google.inject.Inject;
import dto.CityHumidityDto;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;
import service.WeatherDataService;

import java.util.ArrayList;
import java.util.List;

public class WeatherDataController extends Controller {
    private FormFactory formFactory;

    @Inject
    public WeatherDataController(FormFactory formFactory) {
        this.formFactory = formFactory;
    }

public Result chart(Http.Request request){

    //TODO: call service to get city pressure DTO
/*  //TODO: BREAK THE FOLLOWING CODE TO dao AND SERVICES*/

List<CityHumidityDto> cityHumidityDtos = new ArrayList<>();
return ok(WeatherDataService.chartService());

}


}
