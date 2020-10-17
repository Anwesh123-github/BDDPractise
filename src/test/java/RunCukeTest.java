import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(features = "C:\\Users\\anwes\\IdeaProjects\\BDDPractise\\src\\test\\Resources\\HomePage.feature", tags = {"@SouthallCalender"},
        plugin = {"html:target/cucumber-html-report"} )


public class RunCukeTest {
}



// first commit anwesh branch