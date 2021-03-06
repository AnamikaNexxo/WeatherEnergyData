package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import com.google.inject.Inject;
import dto.CityPressureDto;
import play.data.FormFactory;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;
import service.WeatherDataService;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

public class WeatherDataController extends Controller {

    private FormFactory formFactory;

    @Inject
    public WeatherDataController(FormFactory formFactory) {
        this.formFactory = formFactory;
    }

    public Result cityHumidityChartControl(Http.Request request) {
        Map<String, List<BigDecimal>> citiDataValues=
                WeatherDataService.humidityChartService();
        JsonNode json = Json.toJson(citiDataValues);
        return ok(json);
    }

//Pressure Data
    public Result cityPressureChartControl(Http.Request request) {
        CityPressureDto cityPressureDto = WeatherDataService.pressureCityService();
        JsonNode json = Json.toJson(cityPressureDto);
        return ok(json);
    }



}
