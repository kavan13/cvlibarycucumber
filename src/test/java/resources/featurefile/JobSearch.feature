Feature: cv libary
  As User I want to search For Job
@Smoke @Sanity @Regression
  Scenario Outline: verifyJobSearchResultUsingDifferentDataSet
    Given I am on home page
    When I accept cookies
    And I am able to enter jobtitle "<jobTitle>"
    And I enter location "<location>"
    And I enter distance "<distance>"
    And I click on more search option link
    And I enter min salary "<minSalary>"
    And I enter max salary "<maxSalary>"
    And I select salary type "<salaryType>"
    And I select job type "<jobType>"
    And I click on find job button
    Then I verify result "<result>"

    Examples:
      | jobTitle | location   | distance       | minSalary | maxSalary | salaryType | jobType   | result                                        |
      | Tester   | Harrow     | up to 5 miles  | 30000     | 50000     | Per annum  | Permanent | Permanent Tester Jobs in Harrow on the Harrow |
      | Tester   | Manchester | up to 10 miles | 38000     | 48000     | Per annum  | Permanent | Permanent Tester jobs in Manchester           |
      | Tester   | London     | up to 5 miles  | 40000     | 45000     | Per annum  | Permanent | Permanent Tester jobs in London               |
      | Tester   | Leeds      | up to 2 miles  | 42000     | 46000     | Per annum  | Permanent | Permanent Tester jobs in Leeds                |
      | Tester   | Kent       | up to 7 miles  | 43000     | 47000     | Per annum  | Permanent | Permanent Tester jobs in Kent                 |
      | Tester   | Scotland   | up to 5 miles  | 45000     | 49000     | Per annum  | Permanent | Permanent Tester jobs in Scotland             |