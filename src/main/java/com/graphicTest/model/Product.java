package com.graphicTest.model;

import org.springframework.web.multipart.MultipartFile;

import javax.persistence.*;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int productId;
    private String name;
    private int ParamOfMeasure;
    private int MaxCosts;
    private int MaxStaticPressure;
    private int MaxSpeedRotation;
    private int MaxElectricPower;
    private int MaxCurrent;
    private int Capacitor;
    private int TempTransAir;
    private int WPPowerConsumption;
    private int WPExpense;
    private int WPStaticPressure;
    private int WPSpeedRotation;
    private int Absorption;
    private int Injection;
    private String TestCategory;
    private String CategoryEffectiveness;
    private double SpecificDependence;
    private double CoefficientOfPerformance;
    private double ErPNorm;
    private double EfficiencyLevel;
    private double OEPowerConsumption;
    private int OEExpense;
    private int OEStaticPressure;
    private int OESpeedRotation;


    @Transient
    private MultipartFile productImage;



    public String getName() {
        return name;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getParamOfMeasure() {
        return ParamOfMeasure;
    }

    public void setParamOfMeasure(int paramOfMeasure) {
        ParamOfMeasure = paramOfMeasure;
    }

    public int getMaxCosts() {
        return MaxCosts;
    }

    public void setMaxCosts(int maxCosts) {
        MaxCosts = maxCosts;
    }

    public int getMaxStaticPressure() {
        return MaxStaticPressure;
    }

    public void setMaxStaticPressure(int maxStaticPressure) {
        MaxStaticPressure = maxStaticPressure;
    }

    public int getMaxSpeedRotation() {
        return MaxSpeedRotation;
    }

    public void setMaxSpeedRotation(int maxSpeedRotation) {
        MaxSpeedRotation = maxSpeedRotation;
    }

    public int getMaxElectricPower() {
        return MaxElectricPower;
    }

    public void setMaxElectricPower(int maxElectricPower) {
        MaxElectricPower = maxElectricPower;
    }

    public int getMaxCurrent() {
        return MaxCurrent;
    }

    public void setMaxCurrent(int maxCurrent) {
        MaxCurrent = maxCurrent;
    }

    public int getCapacitor() {
        return Capacitor;
    }

    public void setCapacitor(int capacitor) {
        Capacitor = capacitor;
    }

    public int getTempTransAir() {
        return TempTransAir;
    }

    public void setTempTransAir(int tempTransAir) {
        TempTransAir = tempTransAir;
    }

    public int getWPPowerConsumption() {
        return WPPowerConsumption;
    }

    public void setWPPowerConsumption(int WPPowerConsumption) {
        this.WPPowerConsumption = WPPowerConsumption;
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

    public int getWPSpeedRotation() {
        return WPSpeedRotation;
    }

    public void setWPSpeedRotation(int WPSpeedRotation) {
        this.WPSpeedRotation = WPSpeedRotation;
    }

    public int getAbsorption() {
        return Absorption;
    }

    public void setAbsorption(int absorption) {
        Absorption = absorption;
    }

    public int getInjection() {
        return Injection;
    }

    public void setInjection(int injection) {
        Injection = injection;
    }

    public String getTestCategory() {
        return TestCategory;
    }

    public void setTestCategory(String testCategory) {
        TestCategory = testCategory;
    }

    public String getCategoryEffectiveness() {
        return CategoryEffectiveness;
    }

    public void setCategoryEffectiveness(String categoryEffectiveness) {
        CategoryEffectiveness = categoryEffectiveness;
    }

    public double getSpecificDependence() {
        return SpecificDependence;
    }

    public void setSpecificDependence(double specificDependence) {
        SpecificDependence = specificDependence;
    }

    public double getCoefficientOfPerformance() {
        return CoefficientOfPerformance;
    }

    public void setCoefficientOfPerformance(double coefficientOfPerformance) {
        CoefficientOfPerformance = coefficientOfPerformance;
    }

    public double getErPNorm() {
        return ErPNorm;
    }

    public void setErPNorm(double erPNorm) {
        ErPNorm = erPNorm;
    }

    public double getEfficiencyLevel() {
        return EfficiencyLevel;
    }

    public void setEfficiencyLevel(double efficiencyLevel) {
        EfficiencyLevel = efficiencyLevel;
    }

    public double getOEPowerConsumption() {
        return OEPowerConsumption;
    }

    public void setOEPowerConsumption(double OEPowerConsumption) {
        this.OEPowerConsumption = OEPowerConsumption;
    }

    public int getOEExpense() {
        return OEExpense;
    }

    public void setOEExpense(int OEExpense) {
        this.OEExpense = OEExpense;
    }

    public int getOEStaticPressure() {
        return OEStaticPressure;
    }

    public void setOEStaticPressure(int OEStaticPressure) {
        this.OEStaticPressure = OEStaticPressure;
    }

    public int getOESpeedRotation() {
        return OESpeedRotation;
    }

    public void setOESpeedRotation(int OESpeedRotation) {
        this.OESpeedRotation = OESpeedRotation;
    }

    public MultipartFile getProductImage() {
        return productImage;
    }

    public void setProductImage(MultipartFile productImage) {
        this.productImage = productImage;
    }
}
