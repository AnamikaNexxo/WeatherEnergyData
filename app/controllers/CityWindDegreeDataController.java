package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import com.google.inject.Inject;
import dto.CityWindDegreeDto;
import play.data.FormFactory;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;
import service.WindDegreeDataService;

import java.util.List;

public class CityWindDegreeDataController extends Controller {
    private FormFactory formFactory;

    @Inject
    public CityWindDegreeDataController(FormFactory formFactory) {
        this.formFactory = formFactory;
    }


    //get- windDegChartControl
    public Result cityWindDegreeChartControl(Http.Request request) {
        String selectedDate = request.getQueryString("selectedDate");
        List<CityWindDegreeDto> cityWindDegreeDto =
                WindDegreeDataService.windDegreeData(selectedDate);
        JsonNode json = Json.toJson(cityWindDegreeDto);
        return ok(json);
    }


}




