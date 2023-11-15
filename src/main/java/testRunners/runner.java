package testRunners;
import Util.DriverFactory;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.openqa.selenium.WebDriver;
@CucumberOptions(
features = {"src/test/java/Features"},
        glue ={"StepDefinitions","Util" },
        tags ="",   //featuresin icindeki secdiyimiz testi ca;isdirir
        plugin = {
        "summary" ,"pretty" ,"html:Reports/CucumberReport/Reports.html"
                //pretty sadece neticeni daha rengli seliqeli edir

        } // cucumber ucun ozel kelimeler var olardan istifade ederek rapor yaradiriq



)
public class runner extends AbstractTestNGCucumberTests {
    static WebDriver driver= DriverFactory.getDriver();
}
