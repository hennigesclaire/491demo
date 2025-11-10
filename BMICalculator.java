/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bmi;

/**
 *
 * @author coh102
 */
public class BMICalculator {
    public Double calculator(Double f, Double i, Double p){
        Double BMI = 0.0;
        Double num = (p*703);
        Double denom = ((f*12)+ i)*((f*12)+ i);
        BMI = Math.round((num/denom)*10)/10.0;
        return BMI;
    }
}
