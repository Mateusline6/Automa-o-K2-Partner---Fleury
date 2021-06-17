package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(

		/**
		 * 
		 * @author Mateus Metodo de gerar Status Report
		 *
		 */
		features = "src/test/resources/Features", glue = "Steps", tags = "@tag", dryRun = false, monochrome = true, plugin = {
				"pretty", "html:Evidencias/statusReport.html", "json:Evidencias/statusReport.json" }

)

public class Run {

}
