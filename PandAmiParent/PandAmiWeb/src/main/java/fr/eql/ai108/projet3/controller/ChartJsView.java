package fr.eql.ai108.projet3.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.inject.Named;

import org.primefaces.event.ItemSelectEvent;
import org.primefaces.model.charts.ChartData;
import org.primefaces.model.charts.axes.cartesian.CartesianScales;
import org.primefaces.model.charts.axes.cartesian.linear.CartesianLinearAxes;
import org.primefaces.model.charts.axes.cartesian.linear.CartesianLinearTicks;
import org.primefaces.model.charts.axes.radial.RadialScales;
import org.primefaces.model.charts.axes.radial.linear.RadialLinearAngleLines;
import org.primefaces.model.charts.axes.radial.linear.RadialLinearPointLabels;
import org.primefaces.model.charts.axes.radial.linear.RadialLinearTicks;
import org.primefaces.model.charts.bar.BarChartDataSet;
import org.primefaces.model.charts.bar.BarChartModel;
import org.primefaces.model.charts.bar.BarChartOptions;
import org.primefaces.model.charts.bubble.BubbleChartDataSet;
import org.primefaces.model.charts.bubble.BubbleChartModel;
import org.primefaces.model.charts.data.BubblePoint;
import org.primefaces.model.charts.data.NumericPoint;
import org.primefaces.model.charts.donut.DonutChartDataSet;
import org.primefaces.model.charts.donut.DonutChartModel;
import org.primefaces.model.charts.hbar.HorizontalBarChartDataSet;
import org.primefaces.model.charts.hbar.HorizontalBarChartModel;
import org.primefaces.model.charts.line.LineChartDataSet;
import org.primefaces.model.charts.line.LineChartModel;
import org.primefaces.model.charts.line.LineChartOptions;
import org.primefaces.model.charts.optionconfig.animation.Animation;
import org.primefaces.model.charts.optionconfig.elements.Elements;
import org.primefaces.model.charts.optionconfig.elements.ElementsLine;
import org.primefaces.model.charts.optionconfig.legend.Legend;
import org.primefaces.model.charts.optionconfig.legend.LegendLabel;
import org.primefaces.model.charts.optionconfig.title.Title;
import org.primefaces.model.charts.optionconfig.tooltip.Tooltip;
import org.primefaces.model.charts.pie.PieChartDataSet;
import org.primefaces.model.charts.pie.PieChartModel;
import org.primefaces.model.charts.polar.PolarAreaChartDataSet;
import org.primefaces.model.charts.polar.PolarAreaChartModel;
import org.primefaces.model.charts.radar.RadarChartDataSet;
import org.primefaces.model.charts.radar.RadarChartModel;
import org.primefaces.model.charts.radar.RadarChartOptions;
import org.primefaces.model.charts.scatter.ScatterChartModel;

import fr.eql.ai108.projet3.ibusiness.ChartsIBusiness;
import fr.eql.ai108.projet3.ibusiness.CompteUtilisateurIBusiness;
 

@ManagedBean(name = "mbCharts")
@RequestScoped
public class ChartJsView implements Serializable{

	private static final long serialVersionUID = 1L;
	
	  private PieChartModel pieModel;

	    private PolarAreaChartModel polarAreaModel;

	    private LineChartModel lineModel;

	    private LineChartModel cartesianLinerModel;

	    private BarChartModel barModel;

	    private BarChartModel barModel2;

	    private HorizontalBarChartModel hbarModel;

	    private BarChartModel stackedBarModel;

	    private BarChartModel stackedGroupBarModel;

	    private RadarChartModel radarModel;

	    private RadarChartModel radarModel2;

	    private BubbleChartModel bubbleModel;

	    private BarChartModel mixedModel;

	    private DonutChartModel donutModel;

	    private ScatterChartModel scatterModel;
	    
	    
	    private Long numberOfCat1;
	    private Long numberOfCat2;
	    private Long numberOfCat3;
	    private Long numberOfCat4;
	    private Long numberOfCat5;
	    private Long numberOfCat6;
	    private Long numberOfCat7;
	    private Long numberOfCat8;
	    private Long numberOfCat9;
	    private Long numberOfCat10;
	    private Long numberOfCat11;
	    
	    
	    private Long inscriptionsAvril2020;
	    private Long inscriptionsMai2020;
	    private Long inscriptionsJuin2020;
	    private Long inscriptionsJuillet2020;
	    private Long inscriptionsAout2020;
	    private Long inscriptionsSeptembre2020;
	    private Long inscriptionsOctobre2020;
	    private Long inscriptionsNovembre2020;
	    private Long inscriptionsDecembre2020;
	    private Long inscriptionsJanvier2021;
	    private Long inscriptionsFevrier2021;
	    private Long inscriptionsMars2021;
	    private Long inscriptionsAvril2021;
	    
	    private Long nbServicesDoneJanv;
	    private Long nbServicesDoneFev;
	    private Long nbServicesDoneMars;
	    private Long nbServicesDoneAvril;
	    private Long nbServicesUndoneJanv;
	    private Long nbServicesUndoneFev;
	    private Long nbServicesUndoneMars;
	    private Long nbServicesUndoneAvril;
	    

	    @EJB
	    private ChartsIBusiness proxyChartsBusiness;
	    
	    @PostConstruct
	    public void init() {
	    	numberOfCat1 = proxyChartsBusiness.displayNumberServicesCat1();
	    	numberOfCat2 = proxyChartsBusiness.displayNumberServicesCat2();
	    	numberOfCat3 = proxyChartsBusiness.displayNumberServicesCat3();
	    	numberOfCat4 = proxyChartsBusiness.displayNumberServicesCat4();
	    	numberOfCat5 = proxyChartsBusiness.displayNumberServicesCat5();
	    	numberOfCat6 = proxyChartsBusiness.displayNumberServicesCat6();
	    	numberOfCat7 = proxyChartsBusiness.displayNumberServicesCat7();
	    	numberOfCat8 = proxyChartsBusiness.displayNumberServicesCat8();
	    	numberOfCat9 = proxyChartsBusiness.displayNumberServicesCat9();
	    	numberOfCat10 = proxyChartsBusiness.displayNumberServicesCat10();
	    	numberOfCat11 = proxyChartsBusiness.displayNumberServicesCat11();
	    	
	    	inscriptionsAvril2020 = proxyChartsBusiness.displayNbreInscriptionsAvril2020();
	    	inscriptionsMai2020 = proxyChartsBusiness.displayNbreInscriptionsMai2020();
	    	inscriptionsJuin2020 = proxyChartsBusiness.displayNbreInscriptionsJuin2020();
	    	inscriptionsJuillet2020 = proxyChartsBusiness.displayNbreInscriptionsJuillet2020();
	    	inscriptionsAout2020 = proxyChartsBusiness.displayNbreInscriptionsAout2020();
	    	inscriptionsSeptembre2020 = proxyChartsBusiness.displayNbreInscriptionsSeptembre2020();
	    	inscriptionsOctobre2020 = proxyChartsBusiness.displayNbreInscriptionsOctobre2020();
	    	inscriptionsNovembre2020 = proxyChartsBusiness.displayNbreInscriptionsNovembre2020();
	    	inscriptionsDecembre2020 = proxyChartsBusiness.displayNbreInscriptionsDecembre2020();
	    	inscriptionsJanvier2021 = proxyChartsBusiness.displayNbreInscriptionsJanvier2021();
	    	inscriptionsFevrier2021 = proxyChartsBusiness.displayNbreInscriptionsFevrier2021();
	    	inscriptionsMars2021 = proxyChartsBusiness.displayNbreInscriptionsMars2021();
	    	inscriptionsAvril2021 = proxyChartsBusiness.displayNbreInscriptionsAvril2021();
	    	
	        nbServicesDoneJanv = proxyChartsBusiness.displayNbServicesCloturesJanv();
	        nbServicesDoneFev = proxyChartsBusiness.displayNbServicesCloturesFev();
	        nbServicesDoneMars = proxyChartsBusiness.displayNbServicesCloturesMars();
	        nbServicesDoneAvril = proxyChartsBusiness.displayNbServicesCloturesAvril();
	        nbServicesUndoneJanv = proxyChartsBusiness.displayNbServicesNonCloturesJanv();
	        nbServicesUndoneFev = proxyChartsBusiness.displayNbServicesNonCloturesFev();
	        nbServicesUndoneMars = proxyChartsBusiness.displayNbServicesNonCloturesMars();
	        nbServicesUndoneAvril = proxyChartsBusiness.displayNbServicesNonCloturesAvril();
	    	
	    	
	    	
	    	createBarModel();
	        createBarModel2();
	        createDonutModel();
	        
	        
//	    	createPieModel();
//	        createPolarAreaModel();
//	        createLineModel();
//	        createCartesianLinerModel();        
//	        createHorizontalBarModel();
//	        createStackedBarModel();
//	        createStackedGroupBarModel();
//	        createRadarModel();
//	        createRadarModel2();
//	        createBubbleModel();
//	        createMixedModel();	       
//	        createScatterModel();	        
	        
	    }

	    public void createDonutModel() {
	        donutModel = new DonutChartModel();
	        ChartData data = new ChartData();

	        DonutChartDataSet dataSet = new DonutChartDataSet();
	        List<Number> values = new ArrayList<>();

	        values.add(numberOfCat1);
	        values.add(numberOfCat2);
	        values.add(numberOfCat3);
	        values.add(numberOfCat4);
	        values.add(numberOfCat5);
	        values.add(numberOfCat6);
	        values.add(numberOfCat7);
	        values.add(numberOfCat8);
	        values.add(numberOfCat9);
	        values.add(numberOfCat10);
	        values.add(numberOfCat11);
	        
	        dataSet.setData(values);

	        List<String> bgColors = new ArrayList<>();
	        bgColors.add("rgb(255, 99, 132)");
	        bgColors.add("rgb(54, 162, 235)");
	        bgColors.add("rgb(255, 205, 86)");
	        bgColors.add("rgb(204, 85, 00)");
	        bgColors.add("rgb(187, 210, 225)");
	        bgColors.add("rgb(253, 191, 183)");
	        bgColors.add("rgb(231, 62, 1)");
	        bgColors.add("rgb(128, 0, 128)");
	        bgColors.add("rgb(76, 166, 107)");
	        bgColors.add("rgb(1, 121, 111)");
	        bgColors.add("rgb(212, 115, 212)");

	        dataSet.setBackgroundColor(bgColors);

	        data.addChartDataSet(dataSet);
	        List<String> labels = new ArrayList<>();
	        labels.add("Bricolage");
	        labels.add("Jardinage");
	        labels.add("Déménagement");
	        labels.add("Dépannage");
	        labels.add("Entretien - Réparation Véhicules");
	        labels.add("Services véhiculés");
	        labels.add("Services à la personne");
	        labels.add("Enfants");
	        labels.add("Animaux");
	        labels.add("Informatique - Web");
	        labels.add("Cours - Formations");
	        data.setLabels(labels);

	        donutModel.setData(data);
	    }
	    
	    public void createBarModel() {
	        barModel = new BarChartModel();
	        ChartData data = new ChartData();

	        BarChartDataSet barDataSet = new BarChartDataSet();
	        barDataSet.setLabel("Historique des inscriptions");

	        List<Number> values = new ArrayList<>();	        
	        
	        values.add(inscriptionsAvril2020);
	        values.add(inscriptionsMai2020);
	        values.add(inscriptionsJuin2020);
	        values.add(inscriptionsJuillet2020);
	        values.add(inscriptionsAout2020);
	        values.add(inscriptionsSeptembre2020);
	        values.add(inscriptionsOctobre2020);
	        values.add(inscriptionsNovembre2020);
	        values.add(inscriptionsDecembre2020);
	        values.add(inscriptionsJanvier2021);
	        values.add(inscriptionsFevrier2021);
	        values.add(inscriptionsMars2021);
	        values.add(inscriptionsAvril2021);

	        barDataSet.setData(values);

	        List<String> bgColor = new ArrayList<>();
	        bgColor.add("rgba(255, 99, 132, 0.2)");
	        bgColor.add("rgba(255, 159, 64, 0.2)");
	        bgColor.add("rgba(255, 205, 86, 0.2)");
	        bgColor.add("rgba(75, 192, 192, 0.2)");
	        bgColor.add("rgba(54, 162, 235, 0.2)");
	        bgColor.add("rgba(153, 102, 255, 0.2)");
	        bgColor.add("rgba(201, 203, 207, 0.2)");
	        bgColor.add("rgb(253, 191, 183, 0.2)");
	        bgColor.add("rgb(231, 62, 1, 0.2)");
	        bgColor.add("rgb(128, 0, 128, 0.2)");
	        bgColor.add("rgb(76, 166, 107, 0.2)");
	        bgColor.add("rgb(1, 121, 111, 0.2)");
	        bgColor.add("rgba(255, 99, 132, 0.2)");
	        barDataSet.setBackgroundColor(bgColor);

	        List<String> borderColor = new ArrayList<>();
	        borderColor.add("rgb(255, 99, 132)");
	        borderColor.add("rgb(255, 159, 64)");
	        borderColor.add("rgb(255, 205, 86)");
	        borderColor.add("rgb(75, 192, 192)");
	        borderColor.add("rgb(54, 162, 235)");
	        borderColor.add("rgb(153, 102, 255)");
	        borderColor.add("rgb(201, 203, 207)");
	        borderColor.add("rgb(253, 191, 183)");
	        borderColor.add("rgb(231, 62, 1)");
	        borderColor.add("rgb(128, 0, 128)");
	        borderColor.add("rgb(76, 166, 107)");
	        borderColor.add("rgb(1, 121, 111)");
	        borderColor.add("rgb(255, 99, 132)");
	        
	        barDataSet.setBorderColor(borderColor);
	        barDataSet.setBorderWidth(1);

	        data.addChartDataSet(barDataSet);

	        List<String> labels = new ArrayList<>();
	        labels.add("Avril 2020");
	        labels.add("Mai 2020");
	        labels.add("Juin 2020");
	        labels.add("Juillet 2020");
	        labels.add("Août 2020");
	        labels.add("Septembre 2020");
	        labels.add("Octobre 2020");
	        labels.add("Novembre 2020");
	        labels.add("Décembre 2020");
	        labels.add("Janvier 2021");
	        labels.add("Février 2021");
	        labels.add("Mars 2021");
	        labels.add("Avril 2020");
	        data.setLabels(labels);
	        barModel.setData(data);

	        //Options
	        BarChartOptions options = new BarChartOptions();
	        CartesianScales cScales = new CartesianScales();
	        CartesianLinearAxes linearAxes = new CartesianLinearAxes();
	        linearAxes.setOffset(true);
	        CartesianLinearTicks ticks = new CartesianLinearTicks();
	        ticks.setBeginAtZero(true);
	        linearAxes.setTicks(ticks);
	        cScales.addYAxesData(linearAxes);
	        options.setScales(cScales);

	        Title title = new Title();
	        title.setDisplay(true);
	        title.setText("Analyse");
	        options.setTitle(title);

	        Legend legend = new Legend();
	        legend.setDisplay(true);
	        legend.setPosition("top");
	        LegendLabel legendLabels = new LegendLabel();
	        legendLabels.setFontStyle("bold");
	        legendLabels.setFontColor("#2980B9");
	        legendLabels.setFontSize(24);
	        legend.setLabels(legendLabels);
	        options.setLegend(legend);

	        // disable animation
	        Animation animation = new Animation();
	        animation.setDuration(0);
	        options.setAnimation(animation);

	        barModel.setOptions(options);
	    }

	    public void createBarModel2() {
	        barModel2 = new BarChartModel();
	        ChartData data = new ChartData();

	        BarChartDataSet barDataSet = new BarChartDataSet();
	        barDataSet.setLabel("Services Clôturés");
	        barDataSet.setBackgroundColor("rgba(255, 99, 132, 0.2)");
	        barDataSet.setBorderColor("rgb(255, 99, 132)");
	        barDataSet.setBorderWidth(1);
	        List<Number> values = new ArrayList<>();
	        values.add(nbServicesDoneJanv);
	        values.add(nbServicesDoneFev);
	        values.add(nbServicesDoneMars);
	        values.add(nbServicesDoneAvril);
	        barDataSet.setData(values);

	        BarChartDataSet barDataSet2 = new BarChartDataSet();
	        barDataSet2.setLabel("Services Non Clôturés");
	        barDataSet2.setBackgroundColor("rgba(255, 159, 64, 0.2)");
	        barDataSet2.setBorderColor("rgb(255, 159, 64)");
	        barDataSet2.setBorderWidth(1);
	        List<Number> values2 = new ArrayList<>();
	        values2.add(nbServicesUndoneJanv);
	        values2.add(nbServicesUndoneFev);
	        values2.add(nbServicesUndoneMars);
	        values2.add(nbServicesUndoneAvril);
	        barDataSet2.setData(values2);

	        data.addChartDataSet(barDataSet);
	        data.addChartDataSet(barDataSet2);

	        List<String> labels = new ArrayList<>();
	        labels.add("Janvier 2021");
	        labels.add("Février 2021");
	        labels.add("Mars 2021");
	        labels.add("Avril 2021");
	        data.setLabels(labels);
	        barModel2.setData(data);

	        //Options
	        BarChartOptions options = new BarChartOptions();
	        CartesianScales cScales = new CartesianScales();
	        CartesianLinearAxes linearAxes = new CartesianLinearAxes();
	        linearAxes.setOffset(true);
	        CartesianLinearTicks ticks = new CartesianLinearTicks();
	        ticks.setBeginAtZero(true);
	        linearAxes.setTicks(ticks);
	        cScales.addYAxesData(linearAxes);
	        options.setScales(cScales);

	        Title title = new Title();
	        title.setDisplay(true);
	        title.setText("Comparaison / Evolution Services");
	        options.setTitle(title);

	        barModel2.setOptions(options);
	    }
	    
//	    
//	    private void createPieModel() {
//	        pieModel = new PieChartModel();
//	        ChartData data = new ChartData();
//
//	        PieChartDataSet dataSet = new PieChartDataSet();
//	        List<Number> values = new ArrayList<>();
//	        values.add(300);
//	        values.add(50);
//	        values.add(100);
//	        dataSet.setData(values);
//
//	        List<String> bgColors = new ArrayList<>();
//	        bgColors.add("rgb(255, 99, 132)");
//	        bgColors.add("rgb(54, 162, 235)");
//	        bgColors.add("rgb(255, 205, 86)");
//	        dataSet.setBackgroundColor(bgColors);
//
//	        data.addChartDataSet(dataSet);
//	        List<String> labels = new ArrayList<>();
//	        labels.add("Red");
//	        labels.add("Blue");
//	        labels.add("Yellow");
//	        data.setLabels(labels);
//
//	        pieModel.setData(data);
//	    }
//
//	    private void createPolarAreaModel() {
//	        polarAreaModel = new PolarAreaChartModel();
//	        ChartData data = new ChartData();
//
//	        PolarAreaChartDataSet dataSet = new PolarAreaChartDataSet();
//	        List<Number> values = new ArrayList<>();
//	        values.add(11);
//	        values.add(16);
//	        values.add(7);
//	        values.add(3);
//	        values.add(14);
//	        dataSet.setData(values);
//
//	        List<String> bgColors = new ArrayList<>();
//	        bgColors.add("rgb(255, 99, 132)");
//	        bgColors.add("rgb(75, 192, 192)");
//	        bgColors.add("rgb(255, 205, 86)");
//	        bgColors.add("rgb(201, 203, 207)");
//	        bgColors.add("rgb(54, 162, 235)");
//	        dataSet.setBackgroundColor(bgColors);
//
//	        data.addChartDataSet(dataSet);
//	        List<String> labels = new ArrayList<>();
//	        labels.add("Red");
//	        labels.add("Green");
//	        labels.add("Yellow");
//	        labels.add("Grey");
//	        labels.add("Blue");
//	        data.setLabels(labels);
//
//	        polarAreaModel.setData(data);
//	    }
//
//	    public void createLineModel() {
//	        lineModel = new LineChartModel();
//	        ChartData data = new ChartData();
//
//	        LineChartDataSet dataSet = new LineChartDataSet();
//	        List<Object> values = new ArrayList<>();
//	        values.add(65);
//	        values.add(59);
//	        values.add(80);
//	        values.add(81);
//	        values.add(56);
//	        values.add(55);
//	        values.add(40);
//	        dataSet.setData(values);
//	        dataSet.setFill(false);
//	        dataSet.setLabel("My First Dataset");
//	        dataSet.setBorderColor("rgb(75, 192, 192)");
//	        dataSet.setLineTension(0.1);
//	        data.addChartDataSet(dataSet);
//
//	        List<String> labels = new ArrayList<>();
//	        labels.add("January");
//	        labels.add("February");
//	        labels.add("March");
//	        labels.add("April");
//	        labels.add("May");
//	        labels.add("June");
//	        labels.add("July");
//	        data.setLabels(labels);
//
//	        //Options
//	        LineChartOptions options = new LineChartOptions();
//	        Title title = new Title();
//	        title.setDisplay(true);
//	        title.setText("Line Chart");
//	        options.setTitle(title);
//
//	        lineModel.setOptions(options);
//	        lineModel.setData(data);
//	    }
//
//	    public void createScatterModel() {
//	        scatterModel = new ScatterChartModel();
//	        ChartData data = new ChartData();
//
//	        LineChartDataSet dataSet = new LineChartDataSet();
//	        List<Object> values = new ArrayList<>();
//	        values.add(new NumericPoint(-10, 0));
//	        values.add(new NumericPoint(0,10));
//	        values.add(new NumericPoint(10, 5));
//	        values.add(new NumericPoint(8, 14));
//	        values.add(new NumericPoint(12, 2));
//	        values.add(new NumericPoint(13, 7));
//	        values.add(new NumericPoint(6, 9));
//	        dataSet.setData(values);
//	        dataSet.setLabel("Red Dataset");
//	        dataSet.setBorderColor("rgb(249, 24, 24)");
//	        dataSet.setShowLine(false);
//	        data.addChartDataSet(dataSet);
//
//	        //Options
//	        LineChartOptions options = new LineChartOptions();
//	        Title title = new Title();
//	        title.setDisplay(true);
//	        title.setText("Scatter Chart");
//	        options.setShowLines(false);
//	        options.setTitle(title);
//
//	        scatterModel.setOptions(options);
//	        scatterModel.setData(data);
//	    }
//
//	    public void createCartesianLinerModel() {
//	        cartesianLinerModel = new LineChartModel();
//	        ChartData data = new ChartData();
//
//	        LineChartDataSet dataSet = new LineChartDataSet();
//	        List<Object> values = new ArrayList<>();
//	        values.add(20);
//	        values.add(50);
//	        values.add(100);
//	        values.add(75);
//	        values.add(25);
//	        values.add(0);
//	        dataSet.setData(values);
//	        dataSet.setLabel("Left Dataset");
//	        dataSet.setYaxisID("left-y-axis");
//
//	        LineChartDataSet dataSet2 = new LineChartDataSet();
//	        List<Object> values2 = new ArrayList<>();
//	        values2.add(0.1);
//	        values2.add(0.5);
//	        values2.add(1.0);
//	        values2.add(2.0);
//	        values2.add(1.5);
//	        values2.add(0);
//	        dataSet2.setData(values2);
//	        dataSet2.setLabel("Right Dataset");
//	        dataSet2.setYaxisID("right-y-axis");
//
//	        data.addChartDataSet(dataSet);
//	        data.addChartDataSet(dataSet2);
//
//	        List<String> labels = new ArrayList<>();
//	        labels.add("Jan");
//	        labels.add("Feb");
//	        labels.add("Mar");
//	        labels.add("Apr");
//	        labels.add("May");
//	        labels.add("Jun");
//	        data.setLabels(labels);
//	        cartesianLinerModel.setData(data);
//
//	        //Options
//	        LineChartOptions options = new LineChartOptions();
//	        CartesianScales cScales = new CartesianScales();
//	        CartesianLinearAxes linearAxes = new CartesianLinearAxes();
//	        linearAxes.setId("left-y-axis");
//	        linearAxes.setPosition("left");
//	        CartesianLinearAxes linearAxes2 = new CartesianLinearAxes();
//	        linearAxes2.setId("right-y-axis");
//	        linearAxes2.setPosition("right");
//
//	        cScales.addYAxesData(linearAxes);
//	        cScales.addYAxesData(linearAxes2);
//	        options.setScales(cScales);
//
//	        Title title = new Title();
//	        title.setDisplay(true);
//	        title.setText("Cartesian Linear Chart");
//	        options.setTitle(title);
//
//	        cartesianLinerModel.setOptions(options);
//	    }
//
//	   
//	    
//
//	    public void createHorizontalBarModel() {
//	        hbarModel = new HorizontalBarChartModel();
//	        ChartData data = new ChartData();
//
//	        HorizontalBarChartDataSet hbarDataSet = new HorizontalBarChartDataSet();
//	        hbarDataSet.setLabel("My First Dataset");
//
//	        List<Number> values = new ArrayList<>();
//	        values.add(65);
//	        values.add(59);
//	        values.add(80);
//	        values.add(81);
//	        values.add(56);
//	        values.add(55);
//	        values.add(40);
//	        hbarDataSet.setData(values);
//
//	        List<String> bgColor = new ArrayList<>();
//	        bgColor.add("rgba(255, 99, 132, 0.2)");
//	        bgColor.add("rgba(255, 159, 64, 0.2)");
//	        bgColor.add("rgba(255, 205, 86, 0.2)");
//	        bgColor.add("rgba(75, 192, 192, 0.2)");
//	        bgColor.add("rgba(54, 162, 235, 0.2)");
//	        bgColor.add("rgba(153, 102, 255, 0.2)");
//	        bgColor.add("rgba(201, 203, 207, 0.2)");
//	        hbarDataSet.setBackgroundColor(bgColor);
//
//	        List<String> borderColor = new ArrayList<>();
//	        borderColor.add("rgb(255, 99, 132)");
//	        borderColor.add("rgb(255, 159, 64)");
//	        borderColor.add("rgb(255, 205, 86)");
//	        borderColor.add("rgb(75, 192, 192)");
//	        borderColor.add("rgb(54, 162, 235)");
//	        borderColor.add("rgb(153, 102, 255)");
//	        borderColor.add("rgb(201, 203, 207)");
//	        hbarDataSet.setBorderColor(borderColor);
//	        hbarDataSet.setBorderWidth(1);
//
//	        data.addChartDataSet(hbarDataSet);
//
//	        List<String> labels = new ArrayList<>();
//	        labels.add("January");
//	        labels.add("February");
//	        labels.add("March");
//	        labels.add("April");
//	        labels.add("May");
//	        labels.add("June");
//	        labels.add("July");
//	        data.setLabels(labels);
//	        hbarModel.setData(data);
//
//	        //Options
//	        BarChartOptions options = new BarChartOptions();
//	        CartesianScales cScales = new CartesianScales();
//	        CartesianLinearAxes linearAxes = new CartesianLinearAxes();
//	        linearAxes.setOffset(true);
//	        CartesianLinearTicks ticks = new CartesianLinearTicks();
//	        ticks.setBeginAtZero(true);
//	        linearAxes.setTicks(ticks);
//	        cScales.addXAxesData(linearAxes);
//	        options.setScales(cScales);
//
//	        Title title = new Title();
//	        title.setDisplay(true);
//	        title.setText("Horizontal Bar Chart");
//	        options.setTitle(title);
//
//	        hbarModel.setOptions(options);
//	    }
//
//	    public void createStackedBarModel() {
//	        stackedBarModel = new BarChartModel();
//	        ChartData data = new ChartData();
//
//	        BarChartDataSet barDataSet = new BarChartDataSet();
//	        barDataSet.setLabel("Dataset 1");
//	        barDataSet.setBackgroundColor("rgb(255, 99, 132)");
//	        List<Number> dataVal = new ArrayList<>();
//	        dataVal.add(62);
//	        dataVal.add(-58);
//	        dataVal.add(-49);
//	        dataVal.add(25);
//	        dataVal.add(4);
//	        dataVal.add(77);
//	        dataVal.add(-41);
//	        barDataSet.setData(dataVal);
//
//	        BarChartDataSet barDataSet2 = new BarChartDataSet();
//	        barDataSet2.setLabel("Dataset 2");
//	        barDataSet2.setBackgroundColor("rgb(54, 162, 235)");
//	        List<Number> dataVal2 = new ArrayList<>();
//	        dataVal2.add(-1);
//	        dataVal2.add(32);
//	        dataVal2.add(-52);
//	        dataVal2.add(11);
//	        dataVal2.add(97);
//	        dataVal2.add(76);
//	        dataVal2.add(-78);
//	        barDataSet2.setData(dataVal2);
//
//	        BarChartDataSet barDataSet3 = new BarChartDataSet();
//	        barDataSet3.setLabel("Dataset 3");
//	        barDataSet3.setBackgroundColor("rgb(75, 192, 192)");
//	        List<Number> dataVal3 = new ArrayList<>();
//	        dataVal3.add(-44);
//	        dataVal3.add(25);
//	        dataVal3.add(15);
//	        dataVal3.add(92);
//	        dataVal3.add(80);
//	        dataVal3.add(-25);
//	        dataVal3.add(-11);
//	        barDataSet3.setData(dataVal3);
//
//	        data.addChartDataSet(barDataSet);
//	        data.addChartDataSet(barDataSet2);
//	        data.addChartDataSet(barDataSet3);
//
//	        List<String> labels = new ArrayList<>();
//	        labels.add("January");
//	        labels.add("February");
//	        labels.add("March");
//	        labels.add("April");
//	        labels.add("May");
//	        labels.add("June");
//	        labels.add("July");
//	        data.setLabels(labels);
//	        stackedBarModel.setData(data);
//
//	        //Options
//	        BarChartOptions options = new BarChartOptions();
//	        CartesianScales cScales = new CartesianScales();
//	        CartesianLinearAxes linearAxes = new CartesianLinearAxes();
//	        linearAxes.setStacked(true);
//	        linearAxes.setOffset(true);
//	        cScales.addXAxesData(linearAxes);
//	        cScales.addYAxesData(linearAxes);
//	        options.setScales(cScales);
//
//	        Title title = new Title();
//	        title.setDisplay(true);
//	        title.setText("Bar Chart - Stacked");
//	        options.setTitle(title);
//
//	        Tooltip tooltip = new Tooltip();
//	        tooltip.setMode("index");
//	        tooltip.setIntersect(false);
//	        options.setTooltip(tooltip);
//
//	        stackedBarModel.setOptions(options);
//	    }
//
//	    public void createStackedGroupBarModel() {
//	        stackedGroupBarModel = new BarChartModel();
//	        ChartData data = new ChartData();
//
//	        BarChartDataSet barDataSet = new BarChartDataSet();
//	        barDataSet.setLabel("Dataset 1");
//	        barDataSet.setBackgroundColor("rgb(255, 99, 132)");
//	        barDataSet.setStack("Stack 0");
//	        List<Number> dataVal = new ArrayList<>();
//	        dataVal.add(-32);
//	        dataVal.add(-70);
//	        dataVal.add(-33);
//	        dataVal.add(30);
//	        dataVal.add(-49);
//	        dataVal.add(23);
//	        dataVal.add(-92);
//	        barDataSet.setData(dataVal);
//
//	        BarChartDataSet barDataSet2 = new BarChartDataSet();
//	        barDataSet2.setLabel("Dataset 2");
//	        barDataSet2.setBackgroundColor("rgb(54, 162, 235)");
//	        barDataSet2.setStack("Stack 0");
//	        List<Number> dataVal2 = new ArrayList<>();
//	        dataVal2.add(83);
//	        dataVal2.add(18);
//	        dataVal2.add(86);
//	        dataVal2.add(8);
//	        dataVal2.add(34);
//	        dataVal2.add(46);
//	        dataVal2.add(11);
//	        barDataSet2.setData(dataVal2);
//
//	        BarChartDataSet barDataSet3 = new BarChartDataSet();
//	        barDataSet3.setLabel("Dataset 3");
//	        barDataSet3.setBackgroundColor("rgb(75, 192, 192)");
//	        barDataSet3.setStack("Stack 1");
//	        List<Number> dataVal3 = new ArrayList<>();
//	        dataVal3.add(-45);
//	        dataVal3.add(73);
//	        dataVal3.add(-25);
//	        dataVal3.add(65);
//	        dataVal3.add(49);
//	        dataVal3.add(-18);
//	        dataVal3.add(46);
//	        barDataSet3.setData(dataVal3);
//
//	        data.addChartDataSet(barDataSet);
//	        data.addChartDataSet(barDataSet2);
//	        data.addChartDataSet(barDataSet3);
//
//	        List<String> labels = new ArrayList<>();
//	        labels.add("January");
//	        labels.add("February");
//	        labels.add("March");
//	        labels.add("April");
//	        labels.add("May");
//	        labels.add("June");
//	        labels.add("July");
//	        data.setLabels(labels);
//	        stackedGroupBarModel.setData(data);
//
//	        //Options
//	        BarChartOptions options = new BarChartOptions();
//	        CartesianScales cScales = new CartesianScales();
//	        CartesianLinearAxes linearAxes = new CartesianLinearAxes();
//	        linearAxes.setStacked(true);
//	        linearAxes.setOffset(true);
//	        cScales.addXAxesData(linearAxes);
//	        cScales.addYAxesData(linearAxes);
//	        options.setScales(cScales);
//
//	        Title title = new Title();
//	        title.setDisplay(true);
//	        title.setText("Bar Chart - Stacked Group");
//	        options.setTitle(title);
//
//	        Tooltip tooltip = new Tooltip();
//	        tooltip.setMode("index");
//	        tooltip.setIntersect(false);
//	        options.setTooltip(tooltip);
//
//	        stackedGroupBarModel.setOptions(options);
//	    }
//
//	    public void createRadarModel() {
//	        radarModel = new RadarChartModel();
//	        ChartData data = new ChartData();
//
//	        RadarChartDataSet radarDataSet = new RadarChartDataSet();
//	        radarDataSet.setLabel("My First Dataset");
//	        radarDataSet.setFill(true);
//	        radarDataSet.setBackgroundColor("rgba(255, 99, 132, 0.2)");
//	        radarDataSet.setBorderColor("rgb(255, 99, 132)");
//	        radarDataSet.setPointBackgroundColor("rgb(255, 99, 132)");
//	        radarDataSet.setPointBorderColor("#fff");
//	        radarDataSet.setPointHoverBackgroundColor("#fff");
//	        radarDataSet.setPointHoverBorderColor("rgb(255, 99, 132)");
//	        List<Number> dataVal = new ArrayList<>();
//	        dataVal.add(65);
//	        dataVal.add(59);
//	        dataVal.add(90);
//	        dataVal.add(81);
//	        dataVal.add(56);
//	        dataVal.add(55);
//	        dataVal.add(40);
//	        radarDataSet.setData(dataVal);
//
//	        RadarChartDataSet radarDataSet2 = new RadarChartDataSet();
//	        radarDataSet2.setLabel("My Second Dataset");
//	        radarDataSet2.setFill(true);
//	        radarDataSet2.setBackgroundColor("rgba(54, 162, 235, 0.2)");
//	        radarDataSet2.setBorderColor("rgb(54, 162, 235)");
//	        radarDataSet2.setPointBackgroundColor("rgb(54, 162, 235)");
//	        radarDataSet2.setPointBorderColor("#fff");
//	        radarDataSet2.setPointHoverBackgroundColor("#fff");
//	        radarDataSet2.setPointHoverBorderColor("rgb(54, 162, 235)");
//	        List<Number> dataVal2 = new ArrayList<>();
//	        dataVal2.add(28);
//	        dataVal2.add(48);
//	        dataVal2.add(40);
//	        dataVal2.add(19);
//	        dataVal2.add(96);
//	        dataVal2.add(27);
//	        dataVal2.add(100);
//	        radarDataSet2.setData(dataVal2);
//
//	        data.addChartDataSet(radarDataSet);
//	        data.addChartDataSet(radarDataSet2);
//
//	        List<String> labels = new ArrayList<>();
//	        labels.add("Eating");
//	        labels.add("Drinking");
//	        labels.add("Sleeping");
//	        labels.add("Designing");
//	        labels.add("Coding");
//	        labels.add("Cycling");
//	        labels.add("Running");
//	        data.setLabels(labels);
//
//	        /* Options */
//	        RadarChartOptions options = new RadarChartOptions();
//	        Elements elements = new Elements();
//	        ElementsLine elementsLine = new ElementsLine();
//	        elementsLine.setTension(0);
//	        elementsLine.setBorderWidth(3);
//	        elements.setLine(elementsLine);
//	        options.setElements(elements);
//
//	        radarModel.setOptions(options);
//	        radarModel.setData(data);
//	    }
//
//	    public void createRadarModel2() {
//	        radarModel2 = new RadarChartModel();
//	        ChartData data = new ChartData();
//
//	        RadarChartDataSet radarDataSet = new RadarChartDataSet();
//	        radarDataSet.setLabel("P.Practitioner");
//	        radarDataSet.setLineTension(0.1);
//	        radarDataSet.setBackgroundColor("rgba(102, 153, 204, 0.2)");
//	        radarDataSet.setBorderColor("rgba(102, 153, 204, 1)");
//	        radarDataSet.setPointBackgroundColor("rgba(102, 153, 204, 1)");
//	        radarDataSet.setPointBorderColor("#fff");
//	        radarDataSet.setPointHoverRadius(5);
//	        radarDataSet.setPointHoverBackgroundColor("#fff");
//	        radarDataSet.setPointHoverBorderColor("rgba(102, 153, 204, 1)");
//	        List<Number> dataVal = new ArrayList<>();
//	        dataVal.add(2);
//	        dataVal.add(3);
//	        dataVal.add(2);
//	        dataVal.add(1);
//	        dataVal.add(3);
//	        radarDataSet.setData(dataVal);
//
//	        RadarChartDataSet radarDataSet2 = new RadarChartDataSet();
//	        radarDataSet2.setLabel("P.Manager");
//	        radarDataSet2.setLineTension(0.1);
//	        radarDataSet2.setBackgroundColor("rgba(255, 204, 102, 0.2)");
//	        radarDataSet2.setBorderColor("rgba(255, 204, 102, 1)");
//	        radarDataSet2.setPointBackgroundColor("rgba(255, 204, 102, 1)");
//	        radarDataSet2.setPointBorderColor("#fff");
//	        radarDataSet2.setPointHoverRadius(5);
//	        radarDataSet2.setPointHoverBackgroundColor("#fff");
//	        radarDataSet2.setPointHoverBorderColor("rgba(255, 204, 102, 1)");
//	        List<Number> dataVal2 = new ArrayList<>();
//	        dataVal2.add(2);
//	        dataVal2.add(3);
//	        dataVal2.add(3);
//	        dataVal2.add(2);
//	        dataVal2.add(3);
//	        radarDataSet2.setData(dataVal2);
//
//	        data.addChartDataSet(radarDataSet);
//	        data.addChartDataSet(radarDataSet2);
//
//	        List<List<String>> labels = new ArrayList<>();
//	        labels.add(new ArrayList(Arrays.asList("Process","Excellence")));
//	        labels.add(new ArrayList(Arrays.asList("Problem","Solving")));
//	        labels.add(new ArrayList(Arrays.asList("Facilitation")));
//	        labels.add(new ArrayList(Arrays.asList("Project","Mgmt")));
//	        labels.add(new ArrayList(Arrays.asList("Change","Mgmt")));
//	        data.setLabels(labels);
//
//	        /* Options */
//	        RadarChartOptions options = new RadarChartOptions();
//	        RadialScales rScales = new RadialScales();
//
//	        RadialLinearAngleLines angelLines = new RadialLinearAngleLines();
//	        angelLines.setDisplay(true);
//	        angelLines.setLineWidth(0.5);
//	        angelLines.setColor("rgba(128, 128, 128, 0.2)");
//	        rScales.setAngelLines(angelLines);
//
//	        RadialLinearPointLabels pointLabels = new RadialLinearPointLabels();
//	        pointLabels.setFontSize(14);
//	        pointLabels.setFontStyle("300");
//	        pointLabels.setFontColor("rgba(204, 204, 204, 1)");
//	        pointLabels.setFontFamily("Lato, sans-serif");
//
//	        RadialLinearTicks ticks = new RadialLinearTicks();
//	        ticks.setBeginAtZero(true);
//	        ticks.setMaxTicksLimit(3);
//	        ticks.setMin(0);
//	        ticks.setMax(3);
//	        ticks.setDisplay(false);
//
//	        options.setScales(rScales);
//
//	        radarModel2.setOptions(options);
//	        radarModel2.setData(data);
//	        radarModel2.setExtender("skinRadarChart");
//	    }
//
//	    public void createBubbleModel() {
//	        bubbleModel = new BubbleChartModel();
//	        ChartData data = new ChartData();
//
//	        BubbleChartDataSet dataSet = new BubbleChartDataSet();
//	        List<BubblePoint> values = new ArrayList<>();
//	        values.add(new BubblePoint(20, 30, 15));
//	        values.add(new BubblePoint(40, 10, 10));
//	        dataSet.setData(values);
//	        dataSet.setBackgroundColor("rgb(255, 99, 132)");
//	        dataSet.setLabel("First Dataset");
//	        data.addChartDataSet(dataSet);
//	        bubbleModel.setData(data);
//	    }
//
//	    public void createMixedModel() {
//	        mixedModel = new BarChartModel();
//	        ChartData data = new ChartData();
//
//	        BarChartDataSet dataSet = new BarChartDataSet();
//	        List<Number> values = new ArrayList<>();
//	        values.add(10);
//	        values.add(20);
//	        values.add(30);
//	        values.add(40);
//	        dataSet.setData(values);
//	        dataSet.setLabel("Bar Dataset");
//	        dataSet.setBorderColor("rgb(255, 99, 132)");
//	        dataSet.setBackgroundColor("rgba(255, 99, 132, 0.2)");
//
//	        LineChartDataSet dataSet2 = new LineChartDataSet();
//	        List<Object> values2 = new ArrayList<>();
//	        values2.add(50);
//	        values2.add(50);
//	        values2.add(50);
//	        values2.add(50);
//	        dataSet2.setData(values2);
//	        dataSet2.setLabel("Line Dataset");
//	        dataSet2.setFill(false);
//	        dataSet2.setBorderColor("rgb(54, 162, 235)");
//
//	        data.addChartDataSet(dataSet);
//	        data.addChartDataSet(dataSet2);
//
//	        List<String> labels = new ArrayList<>();
//	        labels.add("January");
//	        labels.add("February");
//	        labels.add("March");
//	        labels.add("April");
//	        data.setLabels(labels);
//
//	        mixedModel.setData(data);
//
//	        //Options
//	        BarChartOptions options = new BarChartOptions();
//	        CartesianScales cScales = new CartesianScales();
//	        CartesianLinearAxes linearAxes = new CartesianLinearAxes();
//	        linearAxes.setOffset(true);
//	        CartesianLinearTicks ticks = new CartesianLinearTicks();
//	        ticks.setBeginAtZero(true);
//	        linearAxes.setTicks(ticks);
//
//	        cScales.addYAxesData(linearAxes);
//	        options.setScales(cScales);
//	        mixedModel.setOptions(options);
//	    }



	    public void itemSelect(ItemSelectEvent event) {
	        FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Item selected",
	                "Item Index: " + event.getItemIndex() + ", DataSet Index:" + event.getDataSetIndex());

	        FacesContext.getCurrentInstance().addMessage(null, msg);
	    }

	    public PieChartModel getPieModel() {
	        return pieModel;
	    }

	    public void setPieModel(PieChartModel pieModel) {
	        this.pieModel = pieModel;
	    }

	    public PolarAreaChartModel getPolarAreaModel() {
	        return polarAreaModel;
	    }

	    public void setPolarAreaModel(PolarAreaChartModel polarAreaModel) {
	        this.polarAreaModel = polarAreaModel;
	    }

	    public LineChartModel getLineModel() {
	        return lineModel;
	    }

	    public void setLineModel(LineChartModel lineModel) {
	        this.lineModel = lineModel;
	    }

	    public LineChartModel getCartesianLinerModel() {
	        return cartesianLinerModel;
	    }

	    public void setCartesianLinerModel(LineChartModel cartesianLinerModel) {
	        this.cartesianLinerModel = cartesianLinerModel;
	    }

	    public BarChartModel getBarModel() {
	        return barModel;
	    }

	    public void setBarModel(BarChartModel barModel) {
	        this.barModel = barModel;
	    }

	    public BarChartModel getBarModel2() {
	        return barModel2;
	    }

	    public void setBarModel2(BarChartModel barModel2) {
	        this.barModel2 = barModel2;
	    }

	    public HorizontalBarChartModel getHbarModel() {
	        return hbarModel;
	    }

	    public void setHbarModel(HorizontalBarChartModel hbarModel) {
	        this.hbarModel = hbarModel;
	    }

	    public BarChartModel getStackedBarModel() {
	        return stackedBarModel;
	    }

	    public void setStackedBarModel(BarChartModel stackedBarModel) {
	        this.stackedBarModel = stackedBarModel;
	    }

	    public BarChartModel getStackedGroupBarModel() {
	        return stackedGroupBarModel;
	    }

	    public void setStackedGroupBarModel(BarChartModel stackedGroupBarModel) {
	        this.stackedGroupBarModel = stackedGroupBarModel;
	    }

	    public RadarChartModel getRadarModel() {
	        return radarModel;
	    }

	    public void setRadarModel(RadarChartModel radarModel) {
	        this.radarModel = radarModel;
	    }

	    public RadarChartModel getRadarModel2() {
	        return radarModel2;
	    }

	    public void setRadarModel2(RadarChartModel radarModel2) {
	        this.radarModel2 = radarModel2;
	    }

	    public BubbleChartModel getBubbleModel() {
	        return bubbleModel;
	    }

	    public void setBubbleModel(BubbleChartModel bubbleModel) {
	        this.bubbleModel = bubbleModel;
	    }

	    public BarChartModel getMixedModel() {
	        return mixedModel;
	    }

	    public void setMixedModel(BarChartModel mixedModel) {
	        this.mixedModel = mixedModel;
	    }

	    public DonutChartModel getDonutModel() {
	        return donutModel;
	    }

	    public void setDonutModel(DonutChartModel donutModel) {
	        this.donutModel = donutModel;
	    }

	    public ScatterChartModel getScatterModel() {
	        return scatterModel;
	    }

	    public void setScatterModel(ScatterChartModel scatterModel) {
	        this.scatterModel = scatterModel;
	    }

		public Long getNumberOfCat1() {
			return numberOfCat1;
		}

		public void setNumberOfCat1(Long numberOfCat1) {
			this.numberOfCat1 = numberOfCat1;
		}

		public Long getNumberOfCat2() {
			return numberOfCat2;
		}

		public Long getNumberOfCat3() {
			return numberOfCat3;
		}

		public Long getNumberOfCat4() {
			return numberOfCat4;
		}

		public Long getNumberOfCat5() {
			return numberOfCat5;
		}

		public Long getNumberOfCat6() {
			return numberOfCat6;
		}

		public Long getNumberOfCat7() {
			return numberOfCat7;
		}

		public Long getNumberOfCat8() {
			return numberOfCat8;
		}

		public Long getNumberOfCat9() {
			return numberOfCat9;
		}

		public Long getNumberOfCat10() {
			return numberOfCat10;
		}

		public Long getNumberOfCat11() {
			return numberOfCat11;
		}

		public void setNumberOfCat2(Long numberOfCat2) {
			this.numberOfCat2 = numberOfCat2;
		}

		public void setNumberOfCat3(Long numberOfCat3) {
			this.numberOfCat3 = numberOfCat3;
		}

		public void setNumberOfCat4(Long numberOfCat4) {
			this.numberOfCat4 = numberOfCat4;
		}

		public void setNumberOfCat5(Long numberOfCat5) {
			this.numberOfCat5 = numberOfCat5;
		}

		public void setNumberOfCat6(Long numberOfCat6) {
			this.numberOfCat6 = numberOfCat6;
		}

		public void setNumberOfCat7(Long numberOfCat7) {
			this.numberOfCat7 = numberOfCat7;
		}

		public void setNumberOfCat8(Long numberOfCat8) {
			this.numberOfCat8 = numberOfCat8;
		}

		public void setNumberOfCat9(Long numberOfCat9) {
			this.numberOfCat9 = numberOfCat9;
		}

		public void setNumberOfCat10(Long numberOfCat10) {
			this.numberOfCat10 = numberOfCat10;
		}

		public void setNumberOfCat11(Long numberOfCat11) {
			this.numberOfCat11 = numberOfCat11;
		}



		public Long getInscriptionsAvril2020() {
			return inscriptionsAvril2020;
		}

		public Long getInscriptionsMai2020() {
			return inscriptionsMai2020;
		}

		public Long getInscriptionsJuin2020() {
			return inscriptionsJuin2020;
		}

		public Long getInscriptionsJuillet2020() {
			return inscriptionsJuillet2020;
		}

		public Long getInscriptionsAout2020() {
			return inscriptionsAout2020;
		}

		public Long getInscriptionsSeptembre2020() {
			return inscriptionsSeptembre2020;
		}

		public Long getInscriptionsOctobre2020() {
			return inscriptionsOctobre2020;
		}

		public Long getInscriptionsNovembre2020() {
			return inscriptionsNovembre2020;
		}


		public Long getInscriptionsJanvier2021() {
			return inscriptionsJanvier2021;
		}


		public Long getInscriptionsMars2021() {
			return inscriptionsMars2021;
		}

		public ChartsIBusiness getProxyChartsBusiness() {
			return proxyChartsBusiness;
		}

		public void setInscriptionsAvril2020(Long inscriptionsAvril2020) {
			this.inscriptionsAvril2020 = inscriptionsAvril2020;
		}

		public void setInscriptionsMai2020(Long inscriptionsMai2020) {
			this.inscriptionsMai2020 = inscriptionsMai2020;
		}

		public void setInscriptionsJuin2020(Long inscriptionsJuin2020) {
			this.inscriptionsJuin2020 = inscriptionsJuin2020;
		}

		public void setInscriptionsJuillet2020(Long inscriptionsJuillet2020) {
			this.inscriptionsJuillet2020 = inscriptionsJuillet2020;
		}

		public void setInscriptionsAout2020(Long inscriptionsAout2020) {
			this.inscriptionsAout2020 = inscriptionsAout2020;
		}

		public void setInscriptionsSeptembre2020(Long inscriptionsSeptembre2020) {
			this.inscriptionsSeptembre2020 = inscriptionsSeptembre2020;
		}

		public void setInscriptionsOctobre2020(Long inscriptionsOctobre2020) {
			this.inscriptionsOctobre2020 = inscriptionsOctobre2020;
		}

		public void setInscriptionsNovembre2020(Long inscriptionsNovembre2020) {
			this.inscriptionsNovembre2020 = inscriptionsNovembre2020;
		}


		public void setInscriptionsJanvier2021(Long inscriptionsJanvier2021) {
			this.inscriptionsJanvier2021 = inscriptionsJanvier2021;
		}


		public void setInscriptionsMars2021(Long inscriptionsMars2021) {
			this.inscriptionsMars2021 = inscriptionsMars2021;
		}

		public void setProxyChartsBusiness(ChartsIBusiness proxyChartsBusiness) {
			this.proxyChartsBusiness = proxyChartsBusiness;
		}

		public Long getInscriptionsFevrier2021() {
			return inscriptionsFevrier2021;
		}

		public void setInscriptionsFevrier2021(Long inscriptionsFevrier2021) {
			this.inscriptionsFevrier2021 = inscriptionsFevrier2021;
		}

		public Long getInscriptionsDecembre2020() {
			return inscriptionsDecembre2020;
		}

		public void setInscriptionsDecembre2020(Long inscriptionsDecembre2020) {
			this.inscriptionsDecembre2020 = inscriptionsDecembre2020;
		}

		public Long getInscriptionsAvril2021() {
			return inscriptionsAvril2021;
		}

		public void setInscriptionsAvril2021(Long inscriptionsAvril2021) {
			this.inscriptionsAvril2021 = inscriptionsAvril2021;
		}

		public Long getNbServicesDoneJanv() {
			return nbServicesDoneJanv;
		}

		public void setNbServicesDoneJanv(Long nbServicesDoneJanv) {
			this.nbServicesDoneJanv = nbServicesDoneJanv;
		}

		public Long getNbServicesDoneFev() {
			return nbServicesDoneFev;
		}

		public void setNbServicesDoneFev(Long nbServicesDoneFev) {
			this.nbServicesDoneFev = nbServicesDoneFev;
		}

		public Long getNbServicesDoneMars() {
			return nbServicesDoneMars;
		}

		public void setNbServicesDoneMars(Long nbServicesDoneMars) {
			this.nbServicesDoneMars = nbServicesDoneMars;
		}

		public Long getNbServicesDoneAvril() {
			return nbServicesDoneAvril;
		}

		public void setNbServicesDoneAvril(Long nbServicesDoneAvril) {
			this.nbServicesDoneAvril = nbServicesDoneAvril;
		}

		public Long getNbServicesUndoneJanv() {
			return nbServicesUndoneJanv;
		}

		public void setNbServicesUndoneJanv(Long nbServicesUndoneJanv) {
			this.nbServicesUndoneJanv = nbServicesUndoneJanv;
		}

		public Long getNbServicesUndoneFev() {
			return nbServicesUndoneFev;
		}

		public void setNbServicesUndoneFev(Long nbServicesUndoneFev) {
			this.nbServicesUndoneFev = nbServicesUndoneFev;
		}

		public Long getNbServicesUndoneMars() {
			return nbServicesUndoneMars;
		}

		public void setNbServicesUndoneMars(Long nbServicesUndoneMars) {
			this.nbServicesUndoneMars = nbServicesUndoneMars;
		}

		public Long getNbServicesUndoneAvril() {
			return nbServicesUndoneAvril;
		}

		public void setNbServicesUndoneAvril(Long nbServicesUndoneAvril) {
			this.nbServicesUndoneAvril = nbServicesUndoneAvril;
		}
		
		

		


}
