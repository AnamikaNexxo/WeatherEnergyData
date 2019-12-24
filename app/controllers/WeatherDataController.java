package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import com.google.inject.Inject;
import dto.CityHumidityDto;
import dto.CityPressureDto;
import dto.CityWindDegDto;
import play.data.FormFactory;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;
import service.WeatherDataService;

public class WeatherDataController extends Controller {

    private FormFactory formFactory;

    @Inject
    public WeatherDataController(FormFactory formFactory) {
        this.formFactory = formFactory;
    }

    public Result humidityChartControl(Http.Request request) {
        CityHumidityDto cityHumidityDto = WeatherDataService.chartHumidityService();
        JsonNode json = Json.toJson(cityHumidityDto);
        return ok(json);
    }

    public Result pressureChartControl(Http.Request request) {
        CityPressureDto cityPressureDto = WeatherDataService.chartPressureService();
        JsonNode json = Json.toJson(cityPressureDto);
        return ok(json);
    }


    public Result windDegChartControl(Http.Request request) {
        CityWindDegDto cityWindDegDto = WeatherDataService.dataWindDegService();
        JsonNode json = Json.toJson(cityWindDegDto);
        return ok(json);


    }

}
