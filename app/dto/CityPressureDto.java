package dto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CityPressureDto {
    private List<String> cityNames = new ArrayList<>();
    private List<BigDecimal> pressureValues = new ArrayList<>();

    public List<String> getCityNames() {
        return cityNames;
    }

    public void setCityNames(List<String> cityNames) {
        this.cityNames = cityNames;
    }

    public List<BigDecimal> getPressureValues() {
        return pressureValues;
    }

    public void setPressureValues(List<BigDecimal> pressureValues) {
        this.pressureValues = pressureValues;
    }
}
