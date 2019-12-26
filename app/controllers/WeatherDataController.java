package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import com.google.inject.Inject;
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

    public Result humidityChartControl(Http.Request request) {
//        CityHumidityDto cityHumidityDto =
//                WeatherDataService.chartHumidityService();
        Map<String, List<BigDecimal>> citiDataValues=
                WeatherDataService.chartHumidityService();
        JsonNode json = Json.toJson(citiDataValues);
        return ok(json);
    }





//API with bugs
//    public Result pressureChartControl(Http.Request request) {
//        CityPressureDto cityPressureDto = WeatherDataService.chartPressureService();
//        JsonNode json = Json.toJson(cityPressureDto);
//        return ok(json);
//    }
//
//
//    public Result windDegChartControl(Http.Request request) {
//        CityWindDegDto cityWindDegDto = WeatherDataService.dataWindDegService();
//        JsonNode json = Json.toJson(cityWindDegDto);
//        return ok(json);
//
//
//    }

}
