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

public class CityWindDegreeDataController extends Controller {
    private FormFactory formFactory;

    @Inject
    public CityWindDegreeDataController(FormFactory formFactory) {
        this.formFactory = formFactory;
    }


    //get- windDegChartControl
    public Result cityWindDegreeChartControl(Http.Request request) {
        List<CityWindDegDto> cityWindDegDto = WindDegDataService.WindDegData();
        JsonNode json = Json.toJson(cityWindDegDto);
        return ok(json);
    }


}




