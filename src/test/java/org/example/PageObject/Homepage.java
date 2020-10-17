package org.example.PageObject;

import org.example.BaseClassPackage.DriverFactory;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage extends DriverFactory {


    @FindBy(id = "header-search")
    WebElement SearchBox;

    @FindBy(xpath = "//button[@class='btn btn-dark']")
    WebElement Magnifierglass;

    public void dosearch(String item){
        SearchBox.sendKeys(item);
        Magnifierglass.click();
    }

    public void getResultURL(){
        String actualresultURL = driver.getCurrentUrl();
        Assert.assertThat(actualresultURL, Matchers.containsString("https://www.iceland.co.uk/food-cupboard/biscuits-and-crackers"));
    }

    @FindBy(id = "depdateit")
    WebElement departuredate;

    public void SouthallCalender(){departuredate.click();}

    @FindBy(xpath = "//a[contains(text(),'28')]")
    WebElement getdate;

    public void getdatedep() throws InterruptedException {

        Thread.sleep(10000);
        getdate.click();
    }




}
