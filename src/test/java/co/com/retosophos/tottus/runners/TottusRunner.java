package co.com.retosophos.tottus.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/co/com/retosophos/tottus/features/tottus.feature",
snippets = SnippetType.CAMELCASE, glue = "co.com.retosophos.tottus.stepsdefinitions")

public class TottusRunner {

}
