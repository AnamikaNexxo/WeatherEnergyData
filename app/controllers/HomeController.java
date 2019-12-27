package controllers;

import play.mvc.*;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    public Result index() {// not working
//        return ok(views.html.index.render());
        return ok(views.html.WeatherDataTest.render());
    }

    public Result humidityDataLineChart() {
        return ok(views.html.HumidityChartView.render());
    }

    public Result displayPressureData() {
        return ok(views.html.PressureData.render());
    }

    public Result windDegDataSet() {
        return ok(views.html.WindDataSetTable.render());
    }

////activate
//    public Result windDegDataSet() {
//        return ok(views.html.WeatherData.render());
//    }
}










///////////////////////////////////////////////////////

    //    public Result WeatherDataAnalyzer() {
//        return ok(views.html.WeatherData.render());
//    }

//    public Result WeatherDataAnalyzer() {
//        return ok(views.html.WeatherData.render());
//    }
//
//    public Result displayHumidityData() {
//        return ok(views.html.WeatherData.render());
//    }
//

//working


