/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.temperatureconverterusingswing.service;

import com.mycompany.temperatureconverterusingswing.converter.TemperatureConversion;
import com.mycompany.temperatureconverterusingswing.converter.implementation.CelsiusToFahrenheitConversion;
import com.mycompany.temperatureconverterusingswing.converter.implementation.FahrenheitToCelsiusConversion;
import com.mycompany.temperatureconverterusingswing.model.Temperature;
import com.mycompany.temperatureconverterusingswing.model.TemperatureUnit;
import java.util.Map;
import org.apache.commons.lang3.tuple.Pair;

/**
 *
 * @author jayar
 */
public class TemperatureConversionService {
    
    private final Map<Pair<TemperatureUnit, TemperatureUnit>, TemperatureConversion> conversions;
    
    public TemperatureConversionService() {
        conversions = Map.of(
                Pair.of(TemperatureUnit.CELSIUS, TemperatureUnit.FAHRENHEIT), new CelsiusToFahrenheitConversion(),
                Pair.of(TemperatureUnit.FAHRENHEIT, TemperatureUnit.CELSIUS), new FahrenheitToCelsiusConversion()
        );
    }
    
    public Temperature convert(Temperature source, TemperatureUnit targetUnit) {
        TemperatureConversion conversion = conversions.get(Pair.of(source.getUnit(), targetUnit));
        double convertedValue = conversion.convert(source.getValue());
        return new Temperature(convertedValue, targetUnit);
    }
    
}
