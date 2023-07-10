package stepdef;

import execution.HomePage;
import execution.LoginPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class CommonStepDefinitions   {
	
	private HomePage homePage;
	private LoginPage loginPage;
	
	public CommonStepDefinitions() {
	homePage = new HomePage(Hooks.driver);
	loginPage = new LoginPage(Hooks.driver);
}
	
	@Given("the loginpage")
	public void homePage() throws InterruptedException {
		homePage.Loginscreen();
	}
	@When("Oranizational Unit Workflow")
	public void OrganizationalUnit() throws InterruptedException {
		homePage.organizationalUnit();
	}
	@And("Adding Manage Project")
	public void manageProject() throws InterruptedException {
		homePage.manageProject();
	}
	/*@When("user enter username as {string} and password as {string}")
	public void enterUserNameAndPassword(String userName, String password) {
		loginPage.setUsernameAndPassword(userName, password);
	}
	
	@And("user click on sign in button")
	public void clickSignInButton() {
		loginPage.clickSignIn();*/
	}
	
	/*
	 * @And("Verify the negative scenario as {string} and password as {string}")
	 * public void verifythenegativescenario(String username, String password)
	 * throws InterruptedException { loginPage.NegativeScenario(username, password);
	 * }
	 * 
	 * 
	 * @Then("tasks tab should be displayed") public void verifyHomePageDisplayed()
	 * { Assertions.assertThat(homePage.isTasksTabDisplayed()).isTrue(); }
	 * 
	 * @Then("Task Activity page should not be displayed") public void
	 * verifyHomePageNotDisplayed() {
	 * Assertions.assertThat(loginPage.isErrorMsgDisplayed()).isTrue(); }
	 */

