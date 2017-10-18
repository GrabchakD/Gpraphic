package com.graphicTest.model;

import org.springframework.web.multipart.MultipartFile;

import javax.persistence.*;

@Entity
@Table(name = "PRODUCT")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String ParamOfMeasure;
    private Integer MaxCosts;
    private Integer MaxStaticPressure;
    private Integer MaxSpeedRotation;
    private Double MaxElectricPower;
    private Double MaxCurrent;
    private Double Capacitor;
    private String TempTransAir;
    private Double WPPowerConsumption;
    private Integer WPExpense;
    private Integer WPStaticPressure;
    private Integer WPSpeedRotation;
    private Integer Absorption;
    private Integer Injection;
    private String TestCategory;
    private String CategoryEffectiveness;
    private Double SpecificDependence;
    private Double CoefficientOfPerformance;
    private Double ErPNorm;
    private Double EfficiencyLevel;
    private Double OEPowerConsumption;
    private Integer OEExpense;
    private Integer OEStaticPressure;
    private Integer OESpeedRotation;

    public Product() {
    }


    @Transient
    private MultipartFile productImage;

    @Transient
    private int limit;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getParamOfMeasure() {
        return ParamOfMeasure;
    }

    public void setParamOfMeasure(String paramOfMeasure) {
        ParamOfMeasure = paramOfMeasure;
    }

    public Integer getMaxCosts() {
        return MaxCosts;
    }

    public void setMaxCosts(Integer maxCosts) {
        MaxCosts = maxCosts;
    }

    public Integer getMaxStaticPressure() {
        return MaxStaticPressure;
    }

    public void setMaxStaticPressure(Integer maxStaticPressure) {
        MaxStaticPressure = maxStaticPressure;
    }

    public Integer getMaxSpeedRotation() {
        return MaxSpeedRotation;
    }

    public void setMaxSpeedRotation(Integer maxSpeedRotation) {
        MaxSpeedRotation = maxSpeedRotation;
    }

    public Double getMaxElectricPower() {
        return MaxElectricPower;
    }

    public void setMaxElectricPower(Double maxElectricPower) {
        MaxElectricPower = maxElectricPower;
    }

    public Double getMaxCurrent() {
        return MaxCurrent;
    }

    public void setMaxCurrent(Double maxCurrent) {
        MaxCurrent = maxCurrent;
    }

    public Double getCapacitor() {
        return Capacitor;
    }

    public void setCapacitor(Double capacitor) {
        Capacitor = capacitor;
    }

    public String getTempTransAir() {
        return TempTransAir;
    }

    public void setTempTransAir(String tempTransAir) {
        TempTransAir = tempTransAir;
    }

    public Double getWPPowerConsumption() {
        return WPPowerConsumption;
    }

    public void setWPPowerConsumption(Double WPPowerConsumption) {
        this.WPPowerConsumption = WPPowerConsumption;
    }

    public Integer getWPExpense() {
        return WPExpense;
    }

    public void setWPExpense(Integer WPExpense) {
        this.WPExpense = WPExpense;
    }

    public Integer getWPStaticPressure() {
        return WPStaticPressure;
    }

    public void setWPStaticPressure(Integer WPStaticPressure) {
        this.WPStaticPressure = WPStaticPressure;
    }

    public Integer getWPSpeedRotation() {
        return WPSpeedRotation;
    }

    public void setWPSpeedRotation(Integer WPSpeedRotation) {
        this.WPSpeedRotation = WPSpeedRotation;
    }

    public Integer getAbsorption() {
        return Absorption;
    }

    public void setAbsorption(Integer absorption) {
        Absorption = absorption;
    }

    public Integer getInjection() {
        return Injection;
    }

    public void setInjection(Integer injection) {
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

    public Double getSpecificDependence() {
        return SpecificDependence;
    }

    public void setSpecificDependence(Double specificDependence) {
        SpecificDependence = specificDependence;
    }

    public Double getCoefficientOfPerformance() {
        return CoefficientOfPerformance;
    }

    public void setCoefficientOfPerformance(Double coefficientOfPerformance) {
        CoefficientOfPerformance = coefficientOfPerformance;
    }

    public Double getErPNorm() {
        return ErPNorm;
    }

    public void setErPNorm(Double erPNorm) {
        ErPNorm = erPNorm;
    }

    public Double getEfficiencyLevel() {
        return EfficiencyLevel;
    }

    public void setEfficiencyLevel(Double efficiencyLevel) {
        EfficiencyLevel = efficiencyLevel;
    }

    public Double getOEPowerConsumption() {
        return OEPowerConsumption;
    }

    public void setOEPowerConsumption(Double OEPowerConsumption) {
        this.OEPowerConsumption = OEPowerConsumption;
    }

    public Integer getOEExpense() {
        return OEExpense;
    }

    public void setOEExpense(Integer OEExpense) {
        this.OEExpense = OEExpense;
    }

    public Integer getOEStaticPressure() {
        return OEStaticPressure;
    }

    public void setOEStaticPressure(Integer OEStaticPressure) {
        this.OEStaticPressure = OEStaticPressure;
    }

    public Integer getOESpeedRotation() {
        return OESpeedRotation;
    }

    public void setOESpeedRotation(Integer OESpeedRotation) {
        this.OESpeedRotation = OESpeedRotation;
    }

    public MultipartFile getProductImage() {
        return productImage;
    }

    public void setProductImage(MultipartFile productImage) {
        this.productImage = productImage;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }
}


