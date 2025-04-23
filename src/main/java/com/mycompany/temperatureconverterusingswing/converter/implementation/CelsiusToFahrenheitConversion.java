/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.temperatureconverterusingswing.converter.implementation;

import com.mycompany.temperatureconverterusingswing.conversion.TemperatureConversion;

/**
 *
 * @author jayar
 */
public class CelsiusToFahrenheitConversion implements TemperatureConversion {
    
    @Override
    public double convert(double celsius) {
        return celsius * 1.8 + 32;
    }
    
}
