package uk.co.library.pages;

import com.aventstack.extentreports.Status;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import uk.co.library.utility.Utility;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {PageFactory.initElements(driver, this);}

    @CacheLookup
    @FindBy(xpath = "//input[@id='keywords']")
    WebElement jobTitle;

    @CacheLookup
    @FindBy(xpath = "//input[@id='location']" )
    WebElement location;

    @CacheLookup
    @FindBy(xpath = "//select[@id='distance']")
    WebElement distanceDropDown;

    @CacheLookup
    @FindBy(xpath = "//button[@id='toggle-hp-search']")
    WebElement moreSearchOptionLink;

    @CacheLookup
    @FindBy(xpath = "//input[@id='salarymin']")
    WebElement salaryMin;

    @CacheLookup
    @FindBy(xpath = "//input[@id='salarymax']")
    WebElement salaryMax;

    @CacheLookup
    @FindBy(xpath = "//select[@id='salarytype']")
    WebElement salaryTypeDropDown;

    @CacheLookup
    @FindBy(xpath = "//select[@id='tempperm']")
    WebElement jobTypeDropDown;

    @CacheLookup
    @FindBy(xpath = "//input[@id='hp-search-btn']")
    WebElement findJobsButton;

    @CacheLookup
    @FindBy(xpath = "//span//div//span[normalize-space()='Accept All']")
    WebElement acceptCookies;
    @CacheLookup
    @FindBy(id ="gdpr-consent-notice")
    WebElement iframe;


    public void enterJobTitle(String jobTitle1){
        sendTextToElement(jobTitle, jobTitle1);
        log.info("Select job title" + jobTitle.toString());


    }
    public void enterLocation(String Location){
        sendTextToElement(location, Location);
        log.info("Select location" + location.toString());


    }
    public void selectDistance(String distance){
        selectByVisibleTextFromDropDown(distanceDropDown,distance);

        log.info("Select Distance" + distanceDropDown.toString());

    }
    public  void clickOnMoreSearchOptionLink(){
        clickOnElement(moreSearchOptionLink);

        log.info("click on More Search Option" + moreSearchOptionLink.toString());

    }
    public  void enterMinSalary(String minSalary){
        sendTextToElement(salaryMin,minSalary);

        log.info("Enter Salary  to salary field " + salaryMin.toString());

    }
    public  void enterMaxSalary(String maxSalary){
        sendTextToElement(salaryMax,maxSalary);

        log.info("Enter Salary  to salary field " + salaryMax.toString() );

    }
    public void selectSalaryType(String sType){
        selectByVisibleTextFromDropDown(salaryTypeDropDown,sType);

        log.info("Select Salary Type" + salaryTypeDropDown.toString());

    }
    public void selectJobType(String jobType){
        selectByVisibleTextFromDropDown(jobTypeDropDown,jobType);

        log.info("Select Job Type" + jobTypeDropDown.toString());

    }
    public void clickOnFindJobsButton(){
        clickOnElement(findJobsButton);

        log.info("click on Find Job Button"  + findJobsButton.toString());

    }
    public void setAcceptCookies(){
        switchToIframe(iframe);
        clickOnElement(acceptCookies);
        log.info("click on accept coolies"  + acceptCookies.toString());

        driver.switchTo().defaultContent();
    }


}
