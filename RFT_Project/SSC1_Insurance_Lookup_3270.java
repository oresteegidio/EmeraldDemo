
import resources.SSC1_Insurance_Lookup_3270Helper;
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
 * @author admin
 */
public class SSC1_Insurance_Lookup_3270 extends SSC1_Insurance_Lookup_3270Helper
{
	/**
	 * Script Name   : <b>bbb</b>
	 * Generated     : <b>Aug 24, 2023 9:08:03 AM</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 10.0  Build 19045 ()
	 * 
	 * @since  2023/08/24
	 * @author admin
	 */
	public void testMain(Object[] args) 
	{
		// Launch Insurance App
		startApp("Extension for Terminal Applications");
		
		// Connect to target
		host().click(atPoint(187,11));
		ibmExtensionForTerminalBasedAp().inputKeys("{Num1}{Num0}{Num.}{Num1}{Num3}{Num4}{Num.}{Num7}{Num1}{Num.}");
		ibmExtensionForTerminalBasedAp(ANY,UNINITIALIZED).inputKeys("{Num1}{Num3}{Num6}");
		connectUsingTheCurrentConnecti().click();
		
		// Wait for Command prompt
		field_22_1().waitForExistence();
		
		// Login to CICS
		ibmExtensionForTerminalBasedAp().inputKeys("logon applid{(}cic56m11{)}{ENTER}");
		field_1_2().waitForExistence();
		clear().click();
		
		// Launch SSC1 Insurance Application
		ibmExtensionForTerminalBasedAp().inputKeys("ssc1{ENTER}");
		field_1_2_2().waitForExistence();
		
		// Lookup user 1
		ibmExtensionForTerminalBasedAp().inputKeys("{ExtRight}{ExtRight}{ExtRight}{ExtRight}{ExtRight}{ExtRight}{ExtRight}{ExtRight}{ExtRight}1{Num~}");
		ibmExtensionForTerminalBasedAp().inputKeys("1{Num~}");
		
		// Validate email address
		field_13_51().performTest(EmailVP());
		
		// Lookup user 2
		
		ibmExtensionForTerminalBasedAp().inputKeys("{ExtRight}{ExtRight}{ExtRight}{ExtRight}{ExtRight}{ExtRight}{ExtRight}{ExtRight}{ExtRight}{Num2}{Num~}");
		sleep(1);
		field_13_51_2().performTest(Email2VP());
		
		// Lookup user 3
		ibmExtensionForTerminalBasedAp().inputKeys("{ExtRight}{ExtRight}{ExtRight}{ExtRight}{ExtRight}{ExtRight}{ExtRight}{ExtRight}{ExtRight}{Num3}{Num~}");
		sleep(1);
		field_13_51_3().performTest(Email3VP());
		
		// Disconnect and close terminal
		disconnectFromTheHost().click();
		ibmExtensionForTerminalBasedAp(ANY,MAY_EXIT).close();
	}
}

