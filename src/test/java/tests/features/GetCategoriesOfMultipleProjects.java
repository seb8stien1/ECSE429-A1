package tests.features;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GetCategoriesOfMultipleProjects {
    @Given("the following projects exist in the system:")
    public void theFollowingProjectsExistInTheSystem() {
    }

    @Given("the following categories exist in the system:")
    public void theFollowingCategoriesExistInTheSystem() {
    }

    @When("a user retrieves categories associated with the project {string}")
    public void aUserRetrievesCategoriesAssociatedWithTheProject(String projectTitle) {
    }

    @Then("the categories {string} and {string} associated with {string} should be returned")
    public void theCategoriesAndAssociatedWithShouldBeReturned(String categoryName1, String categoryName2, String categoryName3) {
    }

    @When("a user retrieves the categories associated with the project {string}")
    public void aUserRetrievesTheCategoriesAssociatedWithTheProject(String projectTitle) {
    }

    @Then("only the category {string} associated with the project {string} should be returned")
    public void onlyTheCategoryAssociatedWithTheProjectShouldBeReturned(String categoryName, String projectTitle) {
    }

    @When("a user attempts to retrieve categories associated with a non-existent project {string}")
    public void aUserAttemptsToRetrieveCategoriesAssociatedWithANonExistentProject(String nonExistentProject) {
    }

    @Then("the system is restored to the original state")
    public void theSystemIsRestoredToTheOriginalState() {
        // todo
    }

    @Then("an error should be raised")
    public void anErrorShouldBeRaised() {
    }

    @And("the status code returned by the API is {string}")
    public void theStatusCodeReturnedByTheAPIIs(String statusCode) {
    }

    @Given("the following project and category association exist in the system:")
    public void theFollowingProjectAndCategoryAssociationExistInTheSystem() {
    }
}
