import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(features = "C:\\Users\\anwes\\IdeaProjects\\BDDPractise\\src\\test\\Resources\\HomePage.feature", tags = {"@SouthallCalender"},
        plugin = {"html:target/cucumber-html-report",
                  "json:target/cucumber-json-report.json",
        "junit:target/cucumber-xml-report.xml",
        "pretty:target/cucumber-pretty-report.txt"}
        )


public class RunCukeTest {
}



 anwesh_BDDPractise.feature
// first commit anwesh branch

//first commit to dev branch


 dev
