package com.generation.uber;
/*
1. Encapsulamiento
2. Crear clase ConductorUberBlack que herede de clase UberDrive
3. Crear un objeto de cada clase (2)
4. Calcula e imprime el precio de un viaje de 6 km para cada tipo de conductor:
ConductorUber
ConductorUberBlack
*/

public class UberDriver {
    private String name;
    private String carModel;
    private String plate;
    private int minimum=7;
    private double ratePerKm = 1.5;
    private int ratePerMinute = 1;
    private int currentMonthSalary = 0;

    public double calculatePrice(double km) {
        return Math.max(ratePerKm*km,minimum);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public int getMinimum() {
        return minimum;
    }

    public void setMinimum(int minimum) {
        this.minimum = minimum;
    }

    public double getRatePerKm() {
        return ratePerKm;
    }

    public void setRatePerKm(double ratePerKm) {
        this.ratePerKm = ratePerKm;
    }

    public int getRatePerMinute() {
        return ratePerMinute;
    }

    public void setRatePerMinute(int ratePerMinute) {
        this.ratePerMinute = ratePerMinute;
    }

    public int getCurrentMonthSalary() {
        return currentMonthSalary;
    }

    public void setCurrentMonthSalary(int currentMonthSalary) {
        this.currentMonthSalary = currentMonthSalary;
    }


}
