package com.bcs.test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/features/planet/Busqueda",tags="@SmokeTest")
public class RunnerFeatures {

}
