package uk.co.library.cucumber.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import uk.co.library.pages.HomePage;
import uk.co.library.pages.ResultPage;

public class JobSearchSteps {
    @Given("^I am on home page$")
    public void iAmOnHomePage() {
    }

    @When("^I accept cookies$")
    public void iAcceptCookies() {
        new HomePage().setAcceptCookies();

    }

    @And("^I am able to enter jobtitle \"([^\"]*)\"$")
    public void iAmAbleToEnterJobtitle(String jobTitle)  {
        new HomePage().enterJobTitle(jobTitle);

    }

    @And("^I enter location \"([^\"]*)\"$")
    public void iEnterLocation(String location)  {
        new HomePage().enterLocation(location);

    }

    @And("^I enter distance \"([^\"]*)\"$")
    public void iEnterDistance(String distance)  {
       new HomePage().selectDistance(distance);
    }

    @And("^I click on more search option link$")
    public void iClickOnMoreSearchOptionLink() {
        new HomePage().clickOnMoreSearchOptionLink();
    }

    @And("^I enter min salary \"([^\"]*)\"$")
    public void iEnterMinSalary(String minSalary)  {
        new HomePage().enterMinSalary(minSalary);

    }

    @And("^I enter max salary \"([^\"]*)\"$")
    public void iEnterMaxSalary(String maxSalary)  {
       new HomePage().enterMaxSalary(maxSalary);
    }

    @And("^I select salary type \"([^\"]*)\"$")
    public void iSelectSalaryType(String salaryType)  {
       new HomePage().selectSalaryType(salaryType);
    }

    @And("^I select job type \"([^\"]*)\"$")
    public void iSelectJobType(String jobType)  {
       new HomePage().selectJobType(jobType);
    }

    @And("^I click on find job button$")
    public void iClickOnFindJobButton() {
        new HomePage().clickOnFindJobsButton();
    }

    @Then("^I verify result \"([^\"]*)\"$")
    public void iVerifyResult(String result)  {
       new ResultPage().verifyTheResult(result);
    }
}
