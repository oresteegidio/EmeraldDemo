package steps;
import resources.steps.ClassicsCDStepDefHelper;
import com.rational.test.ft.*;
import com.rational.test.ft.object.interfaces.*;
import com.rational.test.ft.object.interfaces.SAP.*;
import com.rational.test.ft.object.interfaces.WPF.*;
import com.rational.test.ft.object.interfaces.dojo.*;
import com.rational.test.ft.object.interfaces.siebel.*;
import com.rational.test.ft.object.interfaces.flex.*;
import com.rational.test.ft.object.interfaces.generichtmlsubdomain.*;
import com.rational.test.ft.script.*;
import com.rational.test.ft.value.*;
import com.rational.test.ft.vp.*;

import io.cucumber.java.en.*;


import com.ibm.rational.test.ft.object.interfaces.sapwebportal.*;
/**
 * Description   : Functional Test Script
 * @author orest
 */
public class ClassicsCDStepDef extends ClassicsCDStepDefHelper
{
	/**
	 * Script Name   : <b>ClassicsCDStepDef</b>
	 * Generated     : <b>Jan 8, 2025 11:27:33 AM</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 10.0  Build 22631 ()
	 * 
	 * @since  2025/01/08
	 * @author orest
	 */
	public void testMain(Object[] args) 
	{
		
		
		/* Frame: ClassicsCD
		classicsCD().click(atPoint(562,22));
		classicsCD().click(atPoint(1695,18));
		classicsCD(ANY,MAY_EXIT).close();
		*/
	}
	
	
	@Given("^I start ClassicsCD App$")
	
	public void i_start_ClassicsCD_app1() throws Throwable {
		startApp("ClassicsJavaA");
		
	}
	
	@Then("^I Close the App$")
	
	public void i_close_ClassicsCD_app1() throws Throwable {
		classicsCD(ANY,MAY_EXIT).close();
		
	}
	
@Then("^I maximize the App$")
	
	public void i_maximize_ClassicsCD_app() throws Throwable {
		classicsCD(ANY,MAY_EXIT).close();
		
	}
}

