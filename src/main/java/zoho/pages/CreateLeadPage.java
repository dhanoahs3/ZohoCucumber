package zoho.pages;

import java.util.List;

import zoho.managers.WebDriverManager;
import zoho.teststeps.data.LeadData;

public class CreateLeadPage {

	WebDriverManager app;
	
	public CreateLeadPage(WebDriverManager app) {
		this.app=app;
	}

	public void submitLeadDetails(List<LeadData> leadData) {
		System.out.println("The data is "+leadData.get(0).firstName);
		String firstName = leadData.get(0).firstName;
		System.out.println("The data is-----> "+firstName);

		app.typeLeadData("lead_first_name_id", leadData.get(0).firstName);
		app.typeLeadData("lead_last_name_id", leadData.get(0).lastName);
		app.typeLeadData("lead_company_id", leadData.get(0).company);
		app.typeLeadData("lead_email_id", leadData.get(0).email);
		app.click("save_btn_id");
	}
}
