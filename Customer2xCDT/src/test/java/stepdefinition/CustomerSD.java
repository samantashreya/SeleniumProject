package stepdefinition;

import java.util.HashMap;
import java.util.Iterator;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gherkin.formatter.model.DataTableRow;

public class CustomerSD {
	int sum=0;
	private HashMap<String, Integer> eMap;

	@Given("^A customer purchased some products$")
	public void a_customer_purchased_some_products(DataTable eTable) throws Throwable {
		eMap = new HashMap<String, Integer>();
		for (DataTableRow row : eTable.getGherkinRows()) {
			eMap.put(row.getCells().get(0), Integer.parseInt(row.getCells().get(1)));
		}
	}

	@When("^Customer bills the amount for products$")
	public void customer_bills_the_amount_for_products() throws Throwable {
		Iterator<String> itr = eMap.keySet().iterator();
		 
		while (itr.hasNext())
		{
			String key = itr.next();
			Integer value = eMap.get(key);
		     
		    sum+=value;
		}
	}

	@Then("^The bill to be paid is (\\d+)$")
	public void the_bill_to_be_paid_is(int arg1) throws Throwable {
		System.out.println("Total sum: "+sum);
	}

}
