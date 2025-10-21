
import resources.DataDriven_3270Helper;
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
import com.ibm.rational.test.ft.object.interfaces.sapwebportal.*;
/**
 * Description   : Functional Test Script
 * @author STUART.WALKER
 */
public class DataDriven_3270 extends DataDriven_3270Helper
{
	/**
	 * Script Name   : <b>DataDriven</b>
	 * Generated     : <b>9 Mar 2022 09:37:03</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 10.0  Build 19042 ()
	 * 
	 * @since  2022/03/09
	 * @author STUART.WALKER
	 */
	public void testMain(Object[] args) 
	{
		startApp("Extension for Terminal Applications");
	
		// Instantiate a counter to track the current datapool row for logging purposes
		//int currentDatapoolRow = 0;
		
        // Login 	
		host().click(atPoint(93,11));
		ibmExtensionForTerminalBasedAp().inputChars("10.134.71.136");
		connectUsingTheCurrentConnecti().click();
		
		// Load CIC56M11
		field_22_16().click(atPoint(4,16));
		ibmExtensionForTerminalBasedAp().inputKeys("logon applid{(}CIC56M11{)}{ENTER}");
		sleep(2);
		terminalOIA(ANY,DISABLED).waitForExistence();
		clear().click();
		
		// Load Application SSC1
		ibmExtensionForTerminalBasedAp().inputKeys("SSC1{ENTER}");
		field_1_13().waitForExistence();
		
		//while (!dpDone()) {
			
		// Data Drive the customer number
		CustNum().setText(dpString("CustomerNumber"));
		ibmExtensionForTerminalBasedAp().inputKeys("{ENTER}");
		ibmExtensionForTerminalBasedAp().inputKeys("1{ENTER}");
	    sleep(2);
	    
	    // Validate the Customer Details from DataSet
		FirstName().performTest(FirstNameVP());
	    LastName().performTest(LastNameVP());
	    DOB().performTest(DOBVP());
		HouseName().performTest(HouseNameVP());
		HouseNumber().performTest(HouseNumberVP());
		Postcode().performTest(PostcodeVP());
		Telephone().performTest(TelephoneVP());
		Mobile().performTest(MobileVP());
		Email().performTest(EmailVP());
		
		// Increment currentDatapoolRow
		//	currentDatapoolRow++;

		// Advance to next datapool row
		//	dpNext();
		//}
		
	    // Log Off
		disconnectFromTheHost().click();
		ibmExtensionForTerminalBasedAp(ANY,MAY_EXIT).close();
		
	}
}

