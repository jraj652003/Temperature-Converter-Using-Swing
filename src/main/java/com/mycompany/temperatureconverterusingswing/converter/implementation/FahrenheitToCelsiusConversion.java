/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.temperatureconverterusingswing.converter.implementation;

import com.mycompany.temperatureconverterusingswing.converter.TemperatureConversion;

/**
 *
 * @author jayar
 */
public class FahrenheitToCelsiusConversion implements TemperatureConversion {
    
    @Override
    public double convert(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }
    
}
