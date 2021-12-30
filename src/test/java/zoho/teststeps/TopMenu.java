package zoho.teststeps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import zoho.context.TestContext;
import zoho.pages.TopMenuComponent;

public class TopMenu {
  
	public TestContext testContext;
  public TopMenuComponent topMenu;


  public TopMenu(TestContext testContext){
		System.out.println("<-------------------- In the topmenu constructor ----------------------->");
		this.testContext = testContext;
		this.topMenu = testContext.getPageObjectManager().getTopMenu();
		}
	
  @And("I click on {string} in top menu")
  	 public void verifyLeadsPage(String menuOption){
	  testContext.log("I click on "+menuOption +" in top menu");
		topMenu.load(menuOption);
	}
	
	

}
