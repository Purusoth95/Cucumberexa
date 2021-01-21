package com.cucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="OpenGoogle/DataTablewithExample.feature" , glue="Steps",Dryrun=true)
public class Runnerclass {
}
