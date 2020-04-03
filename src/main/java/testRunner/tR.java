package testRunner;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions
(
		features = "C:\\Selenium Programes\\MavenGitJenkins\\MavenJenkinsGit\\src\\main\\java\\Features\\Feature1.feature",
		glue={"stepDefinition"}
		//format={"pretty","html:test-output","json:json_output/cucumber.json","junit:junit_output/xml/cucumber.xml"}
		,dryRun=false
				,monochrome=true
				,strict=true
				//,plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-report/report.html"}
		)
public class tR {

	
}
