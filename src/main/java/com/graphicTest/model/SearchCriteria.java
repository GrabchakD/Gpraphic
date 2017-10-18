package com.graphicTest.model;


public class SearchCriteria {

    private int WPExpense;
    private int WPStaticPressure;
    private int limit;

    public SearchCriteria() {}

    public SearchCriteria(int WPExpense, int WPStaticPressuret) {
        this.WPExpense = WPExpense;
        this.WPStaticPressure = WPStaticPressure;
    }

    public SearchCriteria(int WPExpense, int WPStaticPressure, int limit) {
        this.WPExpense = WPExpense;
        this.WPStaticPressure = WPStaticPressure;
        this.limit = limit;
    }

    public int getWPExpense() {
        return WPExpense;
    }

    public void setWPExpense(int WPExpense) {
        this.WPExpense = WPExpense;
    }

    public int getWPStaticPressure() {
        return WPStaticPressure;
    }

    public void setWPStaticPressure(int WPStaticPressure) {
        this.WPStaticPressure = WPStaticPressure;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }
}
