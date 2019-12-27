package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import com.google.inject.Inject;
import dto.CityWindDegDto;
import play.data.FormFactory;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;
import service.WindDegDataService;

import java.util.List;

public class WindDegDataController extends Controller {
    private FormFactory formFactory;

    @Inject
    public WindDegDataController(FormFactory formFactory) {
        this.formFactory = formFactory;
    }

    //windDegDataSet
    //windDegChartControl
        public Result windDegChartControl(Http.Request request) {
         List<CityWindDegDto> cityWindDegDto = WindDegDataService.WindDegData();
        JsonNode json = Json.toJson(cityWindDegDto);
        return ok(json);
}


}




