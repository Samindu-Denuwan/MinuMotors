package com.bike.chart;

import java.awt.Color;

public class ModelPieChart {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getValues() {
        return values;
    }

    public void setValues(double values) {
        this.values = values;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public ModelPieChart(String name, double values, int qty, Color color) {
        this.name = name;
        this.values = values;
        this.qty = qty;
        this.color = color;
        
    }

    public ModelPieChart() {
    }

    private String name;
    private double values;
    private int qty;
    private Color color;

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
    
}
