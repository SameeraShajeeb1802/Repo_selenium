package testng;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ConfigurationAnnotation {
@BeforeSuite
public void beforeSuite() {
	Reporter.log("@BeforeSuite Executed",true);
}
@BeforeTest
public void beforeTest() {
	Reporter.log("@BeforeTest Executed",true);
}
@BeforeClass
public void beforeClass() {
Reporter.log("@BeforeClass Executed",true);
}
@BeforeMethod
public void beforeMethod() {
	Reporter.log("@BeforeMethod Executed",true);
}
@Test
public void sample() {
	Reporter.log("@Test(sample) Executed",true);
}
@Test
public void demo() {
	Reporter.log("@Test(demo)",true);
}
@AfterMethod
public void afterMethod() {
	Reporter.log("@AfterMethod Executed",true);
}
@AfterClass
public void afterClass() {
	Reporter.log("@AfterClass Exeecuted",true);
}
@AfterTest
public void afterTest() {
	Reporter.log("@AfterTest Executed",true);
}
@AfterSuite
public void afterSuite() {
	Reporter.log("@AfterSuite executed",true);
}
}
