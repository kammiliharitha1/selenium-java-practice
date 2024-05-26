package seleniumlearning;

import org.testng.annotations.AfterMethod;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


@Test(groups="testing class level groups")
public class testcasesWriting {

	@BeforeTest
	public void loginapp()
	{
		System.out.println("Before Test");
	}
	@AfterTest
	public void loggedout()
	{
		System.out.println("After Test");
	}
	
	@BeforeMethod
	public void BeforeMeth()
	{
		System.out.println("Before Method");
	
	}
	@AfterMethod
	public void AfterMeth()
	{
		System.out.println("After Method");
	}
	@Test(priority=-2,description="login")
	public void Login() {
		System.out.println("Login");		
		
	}
	
	@Test(priority=-9,groups="Regression")
	public void Logout() {
		System.out.println("Logout");
	}
}
